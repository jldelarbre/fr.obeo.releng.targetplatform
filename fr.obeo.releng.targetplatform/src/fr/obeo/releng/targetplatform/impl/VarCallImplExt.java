package fr.obeo.releng.targetplatform.impl;

import org.eclipse.xtext.linking.lazy.LazyLinkingResource.CyclicLinkingException;

import fr.obeo.releng.targetplatform.TargetPlatformFactory;
import fr.obeo.releng.targetplatform.VarCall;
import fr.obeo.releng.targetplatform.VarDefinition;
import fr.obeo.releng.targetplatform.impl.VarCallImpl;

public class VarCallImplExt extends VarCallImpl {

	public VarCallImplExt() {
		super();
	}

	@Override
	public VarDefinition getVarName() {
		try {
			return super.getVarName();
		} catch(CyclicLinkingException e) {
			return null;
		}
	}
	
	@Override
	public VarCall getCopy() {
		final VarCall output = TargetPlatformFactory.eINSTANCE.createVarCall();
		output.setVarName(this.basicGetVarName());
		return output;
	}

}
