package fr.obeo.releng.targetplatform.util

import fr.obeo.releng.targetplatform.TargetPlatform
import org.eclipse.xtext.EcoreUtil2

class TargetReloaderImpl implements TargetReloader {

//	static TargetResourceChangeListener changeListener = new TargetResourceChangeListener;

	// URI prefix from tests: tmp:/
	// URI prefix from eclipse: platform:/
	// URI prefix from command line: file:/
	override getUpToDateTarget(TargetPlatform targetPlatformBase, TargetPlatform importedTargetPlatform) {
		//targetPlatformBase not necessary
		var TargetPlatform ret = null;
		
// 		val context	= targetPlatformBase.eResource
 		val selfContext	= importedTargetPlatform.eResource
 		val importTargetUri = importedTargetPlatform.eResource.URI.toString
 		
// 		val resource = EcoreUtil2.getResource(context, importTargetUri);
// 		resource.unload
 		selfContext.unload
// 		val resourceUpdated = EcoreUtil2.getResource(context, importTargetUri);
 		val resourceUpdated = EcoreUtil2.getResource(selfContext, importTargetUri);
		var root = resourceUpdated?.getContents()?.head;
 		if (root instanceof TargetPlatform) {
			ret = root as TargetPlatform;
		}
		
		return ret
	}

//	override registerTargetPlatform(TargetPlatform targetPlatform) {
//		val resourceSet = targetPlatform.eResource?.resourceSet
//		changeListener.addResourceSet(resourceSet)
//	}
//
//	private static class TargetResourceChangeListener implements IResourceChangeListener {
//
//		Set<ResourceSet> resourceSets = Collections.newSetFromMap(new WeakHashMap());
//
//		new() {
//			ResourcesPlugin.workspace.addResourceChangeListener(this)
//		}
//
//		override resourceChanged(IResourceChangeEvent event) {
//			val delta = event.delta
//			if (IResource.FILE == delta.resource.type) {
//				if (IResourceDelta.CHANGED == delta.kind || IResourceDelta.REMOVED == delta.kind) {
//					resourceSets.forEach [
//						val resourceURI = URI.createPlatformResourceURI(delta.fullPath.toString, true)
//						var resource = it.resources.filter[resourceURI.equals(it.URI)].head
//						if (IResourceDelta.CHANGED == delta.kind) {
//							resource.unload
//							resource.load(Collections.emptyMap)
//						} else if (IResourceDelta.REMOVED == delta.kind) {
//							resource.unload
//						}
//					]
//				}
//			}
//		}
//
//		def addResourceSet(ResourceSet resourceSet) {
//			resourceSets.add(resourceSet)
//		}
//
//	}
}
