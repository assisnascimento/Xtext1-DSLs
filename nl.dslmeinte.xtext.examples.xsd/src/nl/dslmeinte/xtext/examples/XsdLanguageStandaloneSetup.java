
package nl.dslmeinte.xtext.examples;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XsdLanguageStandaloneSetup extends XsdLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new XsdLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

