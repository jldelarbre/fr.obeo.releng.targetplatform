package fr.obeo.releng.targetplatform.util;

import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.util.TargetReloader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TargetReloaderImpl implements TargetReloader {
  @Override
  public TargetPlatform forceReload(final TargetPlatform targetPlatform) {
    TargetPlatform reloadedTarget = null;
    final Resource selfContext = targetPlatform.eResource();
    final String importTargetUri = targetPlatform.eResource().getURI().toString();
    selfContext.unload();
    final Resource resourceUpdated = EcoreUtil2.getResource(selfContext, importTargetUri);
    EList<EObject> _contents = null;
    if (resourceUpdated!=null) {
      _contents=resourceUpdated.getContents();
    }
    EObject _head = null;
    if (_contents!=null) {
      _head=IterableExtensions.<EObject>head(_contents);
    }
    EObject root = _head;
    if ((root instanceof TargetPlatform)) {
      reloadedTarget = ((TargetPlatform) root);
    }
    return reloadedTarget;
  }
}
