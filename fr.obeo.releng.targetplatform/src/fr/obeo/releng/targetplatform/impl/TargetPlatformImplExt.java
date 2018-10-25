package fr.obeo.releng.targetplatform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.TargetPlatformPackage;

final class TargetPlatformImplExt extends TargetPlatformImpl {

	private TargetPlatformImplExt() {
		super();
	}

	static TargetPlatform build() {
		TargetPlatformImplExt targetPlatform = new TargetPlatformImplExt();
		TargetPlatformAdapter adapter = new TargetPlatformAdapter(targetPlatform);
		targetPlatform.eAdapters().add(adapter);
		return targetPlatform;
	}

	private static final class TargetPlatformAdapter extends AdapterImpl {
		TargetPlatformImplExt targetPlatform;
		
		public TargetPlatformAdapter(TargetPlatformImplExt targetPlatform) {
			this.targetPlatform = targetPlatform;
		}
		
		public void notifyChanged(Notification notification) {
			if (targetPlatform == notification.getNotifier()) {
				if (TargetPlatformPackage.Literals.TARGET_PLATFORM__CONTENTS == notification.getFeature()) {
					if (targetPlatform.isCompositeElementsResolved()) {
						targetPlatform.setCompositeElementsResolved(false);
					}
				}
			}
		}
	}

}
