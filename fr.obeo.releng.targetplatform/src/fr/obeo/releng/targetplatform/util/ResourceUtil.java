package fr.obeo.releng.targetplatform.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class ResourceUtil {

	public static final int DEFAULT_MAX_TRIES = 10;
	public static int MAX_TRIES = DEFAULT_MAX_TRIES;

	private static URI getResolvedImportUri(Resource context, URI uri) {
		URI contextURI = context.getURI();
		if (contextURI.isHierarchical() && !contextURI.isRelative() && (uri.isRelative() && !uri.isEmpty())) {
			uri = uri.resolve(contextURI);
		}
		return uri;
	}

	public static Resource getResource(Resource context, String uri) {

		URI newURI = getResolvedImportUri(context, URI.createURI(uri));

		for (int i = 1; i <= MAX_TRIES; i++) {
			try {
				Resource resource = context.getResourceSet().getResource(newURI, true);
				if (!resource.getErrors().isEmpty()) {
					context.getResourceSet().getResources().remove(resource);
					resource = context.getResourceSet().getResource(newURI, true);
				}
				return resource;

			} catch (RuntimeException e) {
				if (i < MAX_TRIES) {
					System.out.println("Error while retrieving location:" + uri);
					System.out.println("Retry:" + (i+1) + "/" + MAX_TRIES);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e2) {
						e2.printStackTrace();
					}
				}
			}
		}
		return null;

	}
}
