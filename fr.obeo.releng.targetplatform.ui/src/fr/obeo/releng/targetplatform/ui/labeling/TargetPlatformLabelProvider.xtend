/*******************************************************************************
 * Copyright (c) 2012-2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mikael Barbero (Obeo) - initial API and implementation
 *******************************************************************************/
package fr.obeo.releng.targetplatform.ui.labeling

import com.google.inject.Inject
import fr.obeo.releng.targetplatform.CompositeString
import fr.obeo.releng.targetplatform.Environment
import fr.obeo.releng.targetplatform.IU
import fr.obeo.releng.targetplatform.IncludeDeclaration
import fr.obeo.releng.targetplatform.Location
import fr.obeo.releng.targetplatform.Option
import fr.obeo.releng.targetplatform.Options
import fr.obeo.releng.targetplatform.TargetPlatform
import fr.obeo.releng.targetplatform.VarCall
import fr.obeo.releng.targetplatform.VarDefinition
import fr.obeo.releng.targetplatform.VarDefinitionContainer
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.jface.viewers.StyledString
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class TargetPlatformLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(Location object) {
		val ss = new StyledString();
		if (object.getID() !== null) {
			ss.append(object.getID() + " - ", StyledString.DECORATIONS_STYLER);
		}
		if (object.uri !== null) {
			ss.append(object.uri);
		}
		else {
			ss.append("Unable to resolve URI")
		}
		ss;
	}

	def image(Location object) {
		if (object.discardState !== null && object.discardState.actualString.compareToIgnoreCase("true") == 0) {
			return "obj16/location_obj_discard.gif";
		}
		"obj16/location_obj.gif";
	}

	def text(IU object) {
		val ss = new StyledString();
		ss.append(object.getID());
		if (object.getVersion() !== null) {
			ss.append(" " + object.getVersion(), StyledString.COUNTER_STYLER);
		}
		ss;
	}

	def image(IU object) {
		"obj16/iu_obj.gif";
	}

	def text(TargetPlatform object) {
		object.getName();
	}

	def image(TargetPlatform object) {
		"obj16/target_obj.gif";
	}

	def text(IncludeDeclaration object) {
		val ss = new StyledString()
		ss.append(object.compositeImportURI.computeActualString + " - " + object.importURI)
		ss
	}

	def image(IncludeDeclaration object) {
		"obj16/inc_obj.gif"
	}

	def text(CompositeString object) {
		if (object.isResolved) {
			object.name + " = " + object.computeActualString
		} else {
			object.name + " = <unresolved composite string>"
		}
	}

	def text(VarCall object) {
		"${" + object.varName?.name + "}"
	}

	def image(Option object) {
		"obj16/option_obj.gif"
	}

	def text(Options object) {
		"Options"
	}

	def image(Options object) {
		"obj16/option_obj.gif"
	}

	def text(Environment object) {
		"Environment"
	}

	def image(Environment object) {
		"obj16/env_obj.gif"
	}

	def image(VarDefinitionContainer object) {
		"obj16/var_group.gif"
	}

	def text(VarDefinition object) {
		object.name + " - (effective value = " + object.effectiveValue + ")"
	}

	def image(VarDefinition object) {
		if (object.imported) {
			if (object.diamondInherit) {
				if (object.constant) {
					"obj16/cstImportDiamond_obj.gif"
				} else {
					"obj16/varImportDiamond_obj.gif"
				}
			} else {
				if (object.constant) {
					"obj16/cstImport_obj.gif"
				} else {
					"obj16/varImport_obj.gif"
				}
			}
		} else {
			if (object.constant) {
				"obj16/cst_obj.gif"
			} else {
				"obj16/var_obj.gif"
			}
		}
	}
}
