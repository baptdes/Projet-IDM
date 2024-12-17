package AlgorithmeTable.validation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import AlgorithmeTable.AlgorithmeTablePackage;

/**
 * Réalise la validation de modèles conformes à PetriNet à l'aide du validateur et
 * affiche le résultat.
 * 
 * Les modèles sont donnés dans les arguments de la ligne de commande, et le résultat
 * est affiché dans le terminal.
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public class ValidateAlgorithmeTable {
	
	/**
	 * Afficher une lsite d'erreur avec un préfixe.
	 * Le préfixe est affiché avec juste "OK" à la suite si la liste est vide, et sinon
	 * la liste est affiché avec une erreur par ligne, la source de l'erreur et le message
	 * associé.
	 * @param prefix préfixe à afficher avant la liste (potentielle) d'erreurs
	 * @param errors erreurs à afficher
	 */
	private static void afficherErreurs(String prefix, List<ValidationResult.ValidationError> errors) {
		System.out.print(prefix + ":");
		if (errors.isEmpty()) {
			System.out.println(" OK");
		} else {
			System.out.println(" " + errors.size() + " erreurs trouvées");
			for (ValidationResult.ValidationError error : errors) {
				System.out.println("=> " + error.toString());
			}
		}
	}
	
	/**
	 * Affiche les erreurs pour les divers éléments du méta-modèle : process, activités,
	 * dépendances, commentaires.
	 * @param resultat résultat de la validation calculé auparavant
	 */
	private static void afficherResultat(ValidationResult resultat) {
		afficherErreurs("- Catalogue", resultat.getRecordedErrorsFor(AlgorithmeTablePackage.CATALOGUE));
		afficherErreurs("- Algorithme", resultat.getRecordedErrorsFor(AlgorithmeTablePackage.ALGORITHME));
		afficherErreurs("- Port", resultat.getRecordedErrorsFor(AlgorithmeTablePackage.PORT));
		afficherErreurs("- Ressource", resultat.getRecordedErrorsFor(AlgorithmeTablePackage.RESSOURCE));
	}

	/**
	 * Fonction principale. Charge le méta-modèle et les modèles passés en paramètre sur
	 * la ligne de commande, lance la validation pour chaque modèle et affiche le résultat.
	 * @param args arguments de la ligne de commande
	 */
	public static void main(String... args) {
		// On a besoin de récupérer l'eINSTANCE pour qu'elle soit correctement instanciée.
		// C'est cette étape qui "charge le méta-modèle".
		// Bien sûr, on n'utilise pas directement packageInstance, d'où le warning "unused" qui
		// est supprimé avec l'annotation.
		@SuppressWarnings("unused")
		AlgorithmeTablePackage packageInstance = AlgorithmeTablePackage.eINSTANCE;
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		AlgorithmeTableValidator validator = new AlgorithmeTableValidator();

		for (String model : args) {
			URI modelURI = URI.createURI(model);
			Resource resource = resSet.getResource(modelURI, true);
			ValidationResult resultat = validator.validate(resource);
			
			System.out.println("Résultat de validation pour " + model + ":");
			afficherResultat(resultat);
		}
		
		System.out.println("Fini.");
	
	}

}