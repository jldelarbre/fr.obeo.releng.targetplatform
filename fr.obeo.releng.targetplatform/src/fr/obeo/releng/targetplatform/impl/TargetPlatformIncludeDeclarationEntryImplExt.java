package fr.obeo.releng.targetplatform.impl;

import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.TargetPlatform;

public class TargetPlatformIncludeDeclarationEntryImplExt extends TargetPlatformIncludeDeclarationEntryImpl {
	@Override
	public void setKey(IncludeDeclaration key) {
		if (null != key) {
			super.setKey(key);
		}
	}

	@Override
	public TargetPlatform setValue(TargetPlatform value) {
		if (null != value) {
			return super.setValue(value);
		} else {
			return this.value;
		}
	}

	@Override
	public void setTypedKey(IncludeDeclaration newKey) {
		if (null != newKey) {
			super.setTypedKey(newKey);
		}
	}

	@Override
	public void setTypedValue(TargetPlatform newValue) {
		if (null != newValue) {
			super.setTypedValue(newValue);
		}
	}

}
