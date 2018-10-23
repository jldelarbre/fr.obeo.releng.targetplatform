package fr.obeo.releng.targetplatform;

import java.net.URI;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.equinox.internal.p2.metadata.repository.MetadataRepositoryManager;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;

import fr.obeo.releng.targetplatform.util.PreferenceSettings;

@SuppressWarnings("restriction")
public class TargetPlatformRepositoryManager extends MetadataRepositoryManager {

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
		
		TargetPlatformBundleActivator instance = TargetPlatformBundleActivator.getInstance();
		PreferenceSettings preferenceSettings = instance.getPreferenceSettings();
		int maxRetry = preferenceSettings.getMaxRetry();

		ProvisionException result = null;
		int numTries = maxRetry+1;
		for (int i = 0 ; i < numTries ; i++) {
			try {
				IMetadataRepository repository = super.loadRepository(location, flags, monitor);
				if (repository != null) {
					return repository;
				}
			} catch (ProvisionException e1) {
				result = e1;

				removeRepository(location);
				clearCache(location);
				
				if (i+1 < numTries) {
					try {
						Thread.sleep(Math.min(800, (i+1)*150));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					String errStr = "Retry (" + (i+1) + "/" + maxRetry + ") to load location: " + location;
					TargetPlatformBundleActivator.getInstance().getLog()
					.log(new Status(IStatus.INFO, TargetPlatformBundleActivator.PLUGIN_ID, errStr));
				}
				else {
					String errStr = "Fail to load location: " + location;
					TargetPlatformBundleActivator.getInstance().getLog()
					.log(new Status(IStatus.WARNING, TargetPlatformBundleActivator.PLUGIN_ID, errStr));
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if (result == null) {
			result = new ProvisionException("Unable to load repository: " + location);
		}
		throw result;
	}

	private void clearCache(URI location) {
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
	}

}
