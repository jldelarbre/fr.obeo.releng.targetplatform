package fr.obeo.releng.targetplatform.impl;

import java.net.URI;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;

import fr.obeo.releng.targetplatform.impl.IncludeDeclarationImpl;

public class IncludeDeclarationImplExt extends IncludeDeclarationImpl {

	IncludeDeclarationImplExt() {
		super();
	}

	@Override
	public String getImportURI() {
		this.generateImportURI();
		return super.getImportURI();
	}

	@Override
	public void generateImportURI() {
		try {
			if (null != this.compositeImportURI && this.compositeImportURI.isResolved()) {
				String computeActualString = this.compositeImportURI.computeActualString();
				URI computedUri = new URI(computeActualString);

				if (((((!computedUri.isAbsolute()) && (null != this.eResource()))
						&& (null != this.eResource().getURI())) && (!this.eResource().getURI().isEmpty()))) {

					final org.eclipse.emf.common.util.URI resourceURI = this.eResource().getURI();
					if (resourceURI.isPlatform()) {
						URL url = new URL(resourceURI.toString());
						final String absoluteResourceURI = org.eclipse.emf.common.util.URI
								.createFileURI(FileLocator.toFileURL(url).getFile()).toString();
						computedUri = new URI(absoluteResourceURI).resolve(".").resolve(computedUri);
					} else {
						if (resourceURI.isFile()) {
							computedUri = new URI(resourceURI.toString()).resolve(".").resolve(computedUri);
						}
					}
				}
				String newUri = computedUri.toString();

				if (!newUri.equals(this.importURI)) {
					this.setImportURI(newUri);
				}
			}
		} catch (Throwable t) {
			throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(t);
		}
	}

}
