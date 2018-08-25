package fr.obeo.releng.targetplatform;

import java.net.URI;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.equinox.internal.p2.metadata.repository.MetadataRepositoryManager;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;

@SuppressWarnings("restriction")
public class TargetPlatformRepositoryManager extends MetadataRepositoryManager {

	public static final int MAX_TRIES = 5;

	public TargetPlatformRepositoryManager(IProvisioningAgent agent) {
		super(agent);
	}

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
		for (int i = 0; i < MAX_TRIES; i++) {
			try {
				IMetadataRepository repository = super.loadRepository(location, flags, monitor);
				if (repository != null) {
					return repository;
				}
			} catch (ProvisionException e1) {
				result = e1;

				removeRepository(location);

				if (unavailableRepositories != null) {
					if (unavailableRepositories.get() != null) {
						unavailableRepositories.get().remove(location);
					}
				}
				repositories.remove(getKey(location));
				// flushCache();
				try {
					Thread.sleep(i * 500 + 100); // 100 600 1100 1600 2100 ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Retry (" + (i+1) + "/" + MAX_TRIES + ") to load repository: " + location);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		throw result;
	}

}
