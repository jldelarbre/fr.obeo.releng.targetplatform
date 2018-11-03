package fr.obeo.releng.targetplatform.util

import fr.obeo.releng.targetplatform.TargetPlatform
import org.eclipse.xtext.EcoreUtil2

class TargetReloaderImpl implements TargetReloader {

	// URI prefix from tests: tmp:/
	// URI prefix from eclipse: platform:/
	// URI prefix from command line: file:/
	override forceReload(TargetPlatform targetPlatform) {
		var TargetPlatform reloadedTarget = null;
		
 		val selfContext	= targetPlatform.eResource
 		val importTargetUri = targetPlatform.eResource.URI.toString
 		
 		selfContext.unload
 		val resourceUpdated = EcoreUtil2.getResource(selfContext, importTargetUri);
		var root = resourceUpdated?.getContents()?.head;
 		if (root instanceof TargetPlatform) {
			reloadedTarget = root as TargetPlatform;
		}
		
		return reloadedTarget
	}
}
