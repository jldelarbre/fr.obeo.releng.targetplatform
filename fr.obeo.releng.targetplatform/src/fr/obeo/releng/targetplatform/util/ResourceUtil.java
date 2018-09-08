package fr.obeo.releng.targetplatform.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import fr.obeo.releng.targetplatform.TargetPlatformBundleActivator;

public class ResourceUtil {

	private static URI getResolvedImportUri(Resource context, URI uri) {
		URI contextURI = context.getURI();
		if (contextURI.isHierarchical() && !contextURI.isRelative() && (uri.isRelative() && !uri.isEmpty())) {
			uri = uri.resolve(contextURI);
		}
		return uri;
	}

	public static Resource getResource(Resource context, String uri) {
		
		TargetPlatformBundleActivator instance = TargetPlatformBundleActivator.getInstance();
		PreferenceSettings preferenceSettings = instance.getPreferenceSettings();
		int maxRetry = preferenceSettings.getMaxRetry();

		URI newURI = getResolvedImportUri(context, URI.createURI(uri));

		int numTries = maxRetry+1;
		for (int i = 1; i <= numTries; i++) {
			try {
				Resource resource = context.getResourceSet().getResource(newURI, true);
				if (!resource.getErrors().isEmpty()) {
					context.getResourceSet().getResources().remove(resource);
					resource = context.getResourceSet().getResource(newURI, true);
				}
				return resource;

			} catch (RuntimeException e) {
				if (i < numTries) {
					try {
						Thread.sleep(Math.min(800, i*150));
					} catch (InterruptedException e2) {
						e2.printStackTrace();
					}
					String errStr = "Retry (" + i + "/" + maxRetry + ") to load \"include\" tpd: " + uri + " in " + context.getURI();
					TargetPlatformBundleActivator.getInstance().getLog()
					.log(new Status(IStatus.INFO, TargetPlatformBundleActivator.PLUGIN_ID, errStr));
				}
				else {
					String errStr = "Fail to load \"include\" tpd: " + uri + " in " + context.getURI();
					TargetPlatformBundleActivator.getInstance().getLog()
					.log(new Status(IStatus.WARNING, TargetPlatformBundleActivator.PLUGIN_ID, errStr));
				}
			}
		}
		return null;

	}
}
