/*
 * generated by Xtext 2.32.0
 */
grammar InternalAlgo;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.algorithme.algo.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.algorithme.algo.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.algorithme.algo.services.AlgoGrammarAccess;

}

@parser::members {

 	private AlgoGrammarAccess grammarAccess;

    public InternalAlgoParser(TokenStream input, AlgoGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Catalogue";
   	}

   	@Override
   	protected AlgoGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCatalogue
entryRuleCatalogue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCatalogueRule()); }
	iv_ruleCatalogue=ruleCatalogue
	{ $current=$iv_ruleCatalogue.current; }
	EOF;

// Rule Catalogue
ruleCatalogue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='catalogue'
		{
			newLeafNode(otherlv_0, grammarAccess.getCatalogueAccess().getCatalogueKeyword_0());
		}
		(
			(
				lv_nom_1_0=RULE_ID
				{
					newLeafNode(lv_nom_1_0, grammarAccess.getCatalogueAccess().getNomIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCatalogueRule());
					}
					setWithLastConsumed(
						$current,
						"nom",
						lv_nom_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCatalogueAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCatalogueAccess().getAlgorithmesAlgorithmeParserRuleCall_3_0());
				}
				lv_algorithmes_3_0=ruleAlgorithme
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCatalogueRule());
					}
					add(
						$current,
						"algorithmes",
						lv_algorithmes_3_0,
						"org.xtext.algorithme.algo.Algo.Algorithme");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getCatalogueAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleAlgorithme
entryRuleAlgorithme returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlgorithmeRule()); }
	iv_ruleAlgorithme=ruleAlgorithme
	{ $current=$iv_ruleAlgorithme.current; }
	EOF;

// Rule Algorithme
ruleAlgorithme returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='algorithm'
		{
			newLeafNode(otherlv_0, grammarAccess.getAlgorithmeAccess().getAlgorithmKeyword_0());
		}
		(
			(
				lv_nom_1_0=RULE_ID
				{
					newLeafNode(lv_nom_1_0, grammarAccess.getAlgorithmeAccess().getNomIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAlgorithmeRule());
					}
					setWithLastConsumed(
						$current,
						"nom",
						lv_nom_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='documentation'
		{
			newLeafNode(otherlv_3, grammarAccess.getAlgorithmeAccess().getDocumentationKeyword_3());
		}
		(
			(
				lv_documentation_4_0=RULE_STRING
				{
					newLeafNode(lv_documentation_4_0, grammarAccess.getAlgorithmeAccess().getDocumentationSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAlgorithmeRule());
					}
					setWithLastConsumed(
						$current,
						"documentation",
						lv_documentation_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='ressource'
		{
			newLeafNode(otherlv_5, grammarAccess.getAlgorithmeAccess().getRessourceKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAlgorithmeAccess().getRessourceRessourceParserRuleCall_6_0());
				}
				lv_ressource_6_0=ruleRessource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
					}
					set(
						$current,
						"ressource",
						lv_ressource_6_0,
						"org.xtext.algorithme.algo.Algo.Ressource");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7='ports'
			{
				newLeafNode(otherlv_7, grammarAccess.getAlgorithmeAccess().getPortsKeyword_7_0());
			}
			otherlv_8='{'
			{
				newLeafNode(otherlv_8, grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAlgorithmeAccess().getPortPortParserRuleCall_7_2_0());
					}
					lv_port_9_0=rulePort
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
						}
						add(
							$current,
							"port",
							lv_port_9_0,
							"org.xtext.algorithme.algo.Algo.Port");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_7_3());
			}
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleRessource
entryRuleRessource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRessourceRule()); }
	iv_ruleRessource=ruleRessource
	{ $current=$iv_ruleRessource.current; }
	EOF;

// Rule Ressource
ruleRessource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRessourceAccess().getTypeTypeRessourceEnumRuleCall_0_0());
				}
				lv_type_0_0=ruleTypeRessource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRessourceRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"org.xtext.algorithme.algo.Algo.TypeRessource");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='path'
		{
			newLeafNode(otherlv_1, grammarAccess.getRessourceAccess().getPathKeyword_1());
		}
		(
			(
				lv_emplacement_2_0=RULE_STRING
				{
					newLeafNode(lv_emplacement_2_0, grammarAccess.getRessourceAccess().getEmplacementSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRessourceRule());
					}
					setWithLastConsumed(
						$current,
						"emplacement",
						lv_emplacement_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRulePort
entryRulePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	iv_rulePort=rulePort
	{ $current=$iv_rulePort.current; }
	EOF;

// Rule Port
rulePort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPortAccess().getDirectionDirectionEnumRuleCall_0_0());
				}
				lv_direction_0_0=ruleDirection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPortRule());
					}
					set(
						$current,
						"direction",
						lv_direction_0_0,
						"org.xtext.algorithme.algo.Algo.Direction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_constant_1_0='constant'
				{
					newLeafNode(lv_constant_1_0, grammarAccess.getPortAccess().getConstantConstantKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPortRule());
					}
					setWithLastConsumed($current, "constant", lv_constant_1_0 != null, "constant");
				}
			)
		)?
		(
			(
				lv_nom_2_0=RULE_ID
				{
					newLeafNode(lv_nom_2_0, grammarAccess.getPortAccess().getNomIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPortRule());
					}
					setWithLastConsumed(
						$current,
						"nom",
						lv_nom_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getPortAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPortAccess().getTypeTypeDonneesEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleTypeDonnees
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPortRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"org.xtext.algorithme.algo.Algo.TypeDonnees");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule TypeRessource
ruleTypeRessource returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Python'
			{
				$current = grammarAccess.getTypeRessourceAccess().getPythonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeRessourceAccess().getPythonEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Script'
			{
				$current = grammarAccess.getTypeRessourceAccess().getScriptEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeRessourceAccess().getScriptEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule Direction
ruleDirection returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Entree'
			{
				$current = grammarAccess.getDirectionAccess().getEntreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getEntreeEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Sortie'
			{
				$current = grammarAccess.getDirectionAccess().getSortieEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getSortieEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule TypeDonnees
ruleTypeDonnees returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Entier'
			{
				$current = grammarAccess.getTypeDonneesAccess().getEntierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeDonneesAccess().getEntierEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Flottant'
			{
				$current = grammarAccess.getTypeDonneesAccess().getFlottantEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeDonneesAccess().getFlottantEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Texte'
			{
				$current = grammarAccess.getTypeDonneesAccess().getTexteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeDonneesAccess().getTexteEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Booleen'
			{
				$current = grammarAccess.getTypeDonneesAccess().getBooleenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeDonneesAccess().getBooleenEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
