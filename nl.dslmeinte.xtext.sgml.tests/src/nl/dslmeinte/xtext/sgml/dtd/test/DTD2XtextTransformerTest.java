package nl.dslmeinte.xtext.sgml.dtd.test;

import nl.dslmeinte.xtext.sgml.dtd.DTD2XtextTransformer;
import nl.dslmeinte.xtext.sgml.dtd.test.support.DTDTestSupport;

import org.junit.Test;

@SuppressWarnings("nls")
public class DTD2XtextTransformerTest extends DTDTestSupport {

	@Test
	public void test_transformation_of_trivial_dtd() {
		DTD2XtextTransformer.transform(
				createModelsURI("trivial.dtd"),
				"nl.dslmeinte.xtext.sgml.dtd.test.Trivial",
				"http://dslmeinte.nl/Xtext/sgml/dtd/test/trivial",
				createModelsURI("trivial-gen.xtext")
			);
	}

}
