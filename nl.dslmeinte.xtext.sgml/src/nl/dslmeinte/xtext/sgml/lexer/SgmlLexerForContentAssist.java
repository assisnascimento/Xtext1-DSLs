package nl.dslmeinte.xtext.sgml.lexer;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;

import com.google.inject.Inject;

public class SgmlLexerForContentAssist
	extends org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer
	implements WeavableAntlrLexer
{

	@Inject
	public SgmlLexerForContentAssist(SgmlLexer sgmlLexer) {
		super(null);
		this.sgmlLexer = sgmlLexer;
	}

	private SgmlLexer sgmlLexer;

	@Override
	public CharStream input() {
		return super.input;
	}

	@Override
	public void setType(int type) {
		super.type = type;
	}

	@Override
	public void mTokens() throws RecognitionException {
		sgmlLexer.mTokensDelegate();
	}

	@Override
	public void reset() {
		super.reset();
		sgmlLexer.setBaseLexer(this);
	}

}
