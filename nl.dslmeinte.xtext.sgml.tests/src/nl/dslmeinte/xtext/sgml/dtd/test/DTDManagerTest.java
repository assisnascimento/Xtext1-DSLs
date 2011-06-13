package nl.dslmeinte.xtext.sgml.dtd.test;

import nl.dslmeinte.xtext.dtd.DTDModelUtil;
import nl.dslmeinte.xtext.sgml.dtd.DTDManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DTDManagerTest extends DTDTestSupport {

	private DTDManager dtdManager;

	@Before
	public void setup() {
		dtdManager = new DTDManager(createModelsURI("trivial.dtd"));
	}

	@Test
	public void test_initialization_of_DTDManager() {
		Assert.assertNotNull(dtdManager);
	}

	@Test
	public void test_finding_first_element() {
		Assert.assertEquals("ROOT", DTDModelUtil.firstElement(dtdManager.getDTD()).getName());
	}

}
