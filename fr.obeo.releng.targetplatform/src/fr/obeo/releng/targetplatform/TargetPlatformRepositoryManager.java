package fr.obeo.releng.targetplatform;

import java.net.URI;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.equinox.internal.p2.metadata.repository.MetadataRepositoryManager;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;

@SuppressWarnings("restriction")
public class TargetPlatformRepositoryManager extends MetadataRepositoryManager {

	public static final int MAX_RETRIES = 5;

	public TargetPlatformRepositoryManager(IProvisioningAgent agent) {
		super(agent);
	}

	// Copied from AbstractRepositoryManager
	// Hope the implementation will not changed :-)
	private String getKey(URI location) {
		String key = location.toString().replace('/', '_');
		// remove trailing slash
		if (key.endsWith("_")) //$NON-NLS-1$
			key = key.substring(0, key.length() - 1);
		return key;
	}

	@Override
	public IMetadataRepository loadRepository(URI location, int flags, IProgressMonitor monitor)
			throws ProvisionException {

		ProvisionException result = null;
		int numTries = MAX_RETRIES+1;
		for (int i = 0 ; i < numTries ; i++) {
			try {
				IMetadataRepository repository = super.loadRepository(location, flags, monitor);
				if (repository != null) {
					return repository;
				}
			} catch (ProvisionException e1) {
				result = e1;

				removeRepository(location);

				// TargetPlatformRepositoryManager is implementation specific since it inherits from MetadataRepositoryManager
				// (inner element ofOSGi bundle => @SuppressWarnings("restriction") annotation on this class), if anything changes,
				// it may fail. Put in try/catch part which is implementation specific: unavailableRepositories, repositories
				// Other things depend on IMetadataRepositoryManager or IRepositoryManager (interface)
				try {
					if (unavailableRepositories != null) {
						if (unavailableRepositories.get() != null) {
							unavailableRepositories.get().remove(location);
						}
					}
					repositories.remove(getKey(location));
					// flushCache();
				} catch (Exception e2) {
					System.out.println("[WARNING] Retry attempt problem (exception = " +
							e2.getClass().getSimpleName() + ", " + e2.getMessage() + ")");
				}
				try {
					Thread.sleep(Math.min(800, (i+1)*150));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i+1 < numTries) {
					String errStr = "Retry (" + (i+1) + "/" + MAX_RETRIES + ") to load location: " + location;
					TargetPlatformBundleActivator.getInstance().getLog()
					.log(new Status(IStatus.INFO, TargetPlatformBundleActivator.PLUGIN_ID, errStr));
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		throw result;
	}

}
