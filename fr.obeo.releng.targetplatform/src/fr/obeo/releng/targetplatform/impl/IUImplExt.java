package fr.obeo.releng.targetplatform.impl;

import fr.obeo.releng.targetplatform.impl.IUImpl;

public class IUImplExt extends IUImpl {
	public IUImplExt() {
		super();
	}
	
	@Override
	public String getVersion() {
		if (null != this.varVersion) {
			String newVersion = this.varVersion.getActualString();
			if (this.version != this.varVersion.getActualString()) {
			    this.setVersion(newVersion);
			}
		}
		
		return super.getVersion();
	}
}
