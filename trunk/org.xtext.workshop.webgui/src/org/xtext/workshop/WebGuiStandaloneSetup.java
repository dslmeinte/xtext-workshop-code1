
package org.xtext.workshop;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class WebGuiStandaloneSetup extends WebGuiStandaloneSetupGenerated{

	public static void doSetup() {
		new WebGuiStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

