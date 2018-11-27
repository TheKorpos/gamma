/********************************************************************************
 * Copyright (c) 2018 Contributors to the Gamma project
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * SPDX-License-Identifier: EPL-1.0
 ********************************************************************************/
package hu.bme.mit.gamma.constraint.language.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import hu.bme.mit.gamma.constraint.language.ConstraintLanguageRuntimeModule;
import hu.bme.mit.gamma.constraint.language.ConstraintLanguageStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ConstraintLanguageIdeSetup extends ConstraintLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ConstraintLanguageRuntimeModule(), new ConstraintLanguageIdeModule()));
	}
	
}
