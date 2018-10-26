package fr.obeo.releng.targetplatform.impl;

import java.net.URI;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;

import fr.obeo.releng.targetplatform.impl.LocationImpl;

public class LocationImplExt extends LocationImpl {
	public LocationImplExt() {
		super();
	}
	
	@Override
	public String getUri() {
		resolveUri();
		return super.getUri();
	}
	
	@Override
	public void resolveUri() {
		try {
			if (null != this.compositeUri && this.compositeUri.isResolved()) {
				String computeActualString = this.compositeUri.computeActualString();
				URI computedUri = new URI(computeActualString);
				
				if (((((!computedUri.isAbsolute()) 
						&& (null != this.eResource())) 
						&& (null != this.eResource().getURI())) 
						&& (!this.eResource().getURI().isEmpty()))) {
				
					final org.eclipse.emf.common.util.URI resourceURI = this.eResource().getURI();
					if (resourceURI.isPlatform()) {
						URL url = new URL(resourceURI.toString());
						final String absoluteResourceURI = org.eclipse.emf.common.util.URI.createFileURI(FileLocator.toFileURL(url).getFile()).toString();
						computedUri = new URI(absoluteResourceURI).resolve(".").resolve(computedUri);
					}
					else {
						if (resourceURI.isFile()) {
							computedUri = new URI(resourceURI.toString()).resolve(".").resolve(computedUri);
						}
					}
				}
				String newUri = computedUri.toString();
				
				if (!newUri.equals(this.uri)) {
					this.setUri(newUri);
				}
			}
		}
		catch (Throwable t) {
			throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(t);
		}
	}
}
