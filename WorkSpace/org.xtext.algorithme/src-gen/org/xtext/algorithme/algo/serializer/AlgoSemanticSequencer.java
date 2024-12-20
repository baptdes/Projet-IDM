/*
 * generated by Xtext 2.32.0
 */
package org.xtext.algorithme.algo.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.algorithme.algo.algo.AlgoPackage;
import org.xtext.algorithme.algo.algo.Algorithme;
import org.xtext.algorithme.algo.algo.Catalogue;
import org.xtext.algorithme.algo.algo.Port;
import org.xtext.algorithme.algo.algo.Ressource;
import org.xtext.algorithme.algo.services.AlgoGrammarAccess;

@SuppressWarnings("all")
public class AlgoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AlgoGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AlgoPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AlgoPackage.ALGORITHME:
				sequence_Algorithme(context, (Algorithme) semanticObject); 
				return; 
			case AlgoPackage.CATALOGUE:
				sequence_Catalogue(context, (Catalogue) semanticObject); 
				return; 
			case AlgoPackage.PORT:
				sequence_Port(context, (Port) semanticObject); 
				return; 
			case AlgoPackage.RESSOURCE:
				sequence_Ressource(context, (Ressource) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Algorithme returns Algorithme
	 *
	 * Constraint:
	 *     (nom=ID documentation=STRING ressource=Ressource port+=Port*)
	 * </pre>
	 */
	protected void sequence_Algorithme(ISerializationContext context, Algorithme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Catalogue returns Catalogue
	 *
	 * Constraint:
	 *     (nom=ID algorithmes+=Algorithme*)
	 * </pre>
	 */
	protected void sequence_Catalogue(ISerializationContext context, Catalogue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Port returns Port
	 *
	 * Constraint:
	 *     (direction=Direction constant?='constant'? nom=ID type=TypeDonnees)
	 * </pre>
	 */
	protected void sequence_Port(ISerializationContext context, Port semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Ressource returns Ressource
	 *
	 * Constraint:
	 *     (type=TypeRessource emplacement=STRING)
	 * </pre>
	 */
	protected void sequence_Ressource(ISerializationContext context, Ressource semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgoPackage.Literals.RESSOURCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgoPackage.Literals.RESSOURCE__TYPE));
			if (transientValues.isValueTransient(semanticObject, AlgoPackage.Literals.RESSOURCE__EMPLACEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgoPackage.Literals.RESSOURCE__EMPLACEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRessourceAccess().getTypeTypeRessourceEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getRessourceAccess().getEmplacementSTRINGTerminalRuleCall_2_0(), semanticObject.getEmplacement());
		feeder.finish();
	}
	
	
}
