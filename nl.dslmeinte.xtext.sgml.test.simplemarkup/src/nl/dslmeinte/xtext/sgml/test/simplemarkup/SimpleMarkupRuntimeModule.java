package nl.dslmeinte.xtext.sgml.test.simplemarkup;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import nl.dslmeinte.xtext.sgml.base.services.BaseTerminalsConverter;
import nl.dslmeinte.xtext.sgml.lexer.SgmlLexerForParsing;
import nl.dslmeinte.xtext.sgml.test.simplemarkup.naming.SimpleMarkupNameProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SimpleMarkupRuntimeModule extends nl.dslmeinte.xtext.sgml.test.simplemarkup.AbstractSimpleMarkupRuntimeModule {

	public void configureRuntimeLexer(Binder binder) {
		binder
			.bind(org.eclipse.xtext.parser.antlr.Lexer.class)
			.annotatedWith(Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME))
			.to(SgmlLexerForParsing.class);
	}

//	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrParser> bindIAntlrParser() {
//		return CustomizedSimpleMarkupParser.class;
//	}

	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return BaseTerminalsConverter.class;
	}

	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return SimpleMarkupNameProvider.class;
	}

}
