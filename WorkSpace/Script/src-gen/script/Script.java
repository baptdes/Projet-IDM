/**
 */
package script;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Script#getNom <em>Nom</em>}</li>
 *   <li>{@link script.Script#getArguments <em>Arguments</em>}</li>
 *   <li>{@link script.Script#getResultat <em>Resultat</em>}</li>
 *   <li>{@link script.Script#getBlocs <em>Blocs</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see script.ScriptPackage#getScript_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link script.Script#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link script.Argument}.
	 * It is bidirectional and its opposite is '{@link script.Argument#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see script.ScriptPackage#getScript_Arguments()
	 * @see script.Argument#getScript
	 * @model opposite="script" containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Resultat</b></em>' containment reference list.
	 * The list contents are of type {@link script.Resultat}.
	 * It is bidirectional and its opposite is '{@link script.Resultat#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultat</em>' containment reference list.
	 * @see script.ScriptPackage#getScript_Resultat()
	 * @see script.Resultat#getScript
	 * @model opposite="script" containment="true" required="true"
	 * @generated
	 */
	EList<Resultat> getResultat();

	/**
	 * Returns the value of the '<em><b>Blocs</b></em>' containment reference list.
	 * The list contents are of type {@link script.Bloc}.
	 * It is bidirectional and its opposite is '{@link script.Bloc#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocs</em>' containment reference list.
	 * @see script.ScriptPackage#getScript_Blocs()
	 * @see script.Bloc#getScript
	 * @model opposite="script" containment="true"
	 * @generated
	 */
	EList<Bloc> getBlocs();

} // Script
