package fr.obeo.releng.targetplatform.impl;

import fr.obeo.releng.targetplatform.IU;
import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.Location;
import fr.obeo.releng.targetplatform.VarCall;
import fr.obeo.releng.targetplatform.impl.TargetPlatformFactoryImpl;

public class TargetPlatformFactoryImplExt extends TargetPlatformFactoryImpl {

	public TargetPlatformFactoryImplExt() {
		super();
	}
	
	@Override
	public Location createLocation() {
		return new LocationImplExt();
	}
	
	@Override
	public IncludeDeclaration createIncludeDeclaration() {
		return new IncludeDeclarationImplExt();
	}
	
	@Override
	public IU createIU() {
		return new IUImplExt();
	}
	
	@Override
	public VarCall createVarCall() {
		return new VarCallImplExt();
	}
}