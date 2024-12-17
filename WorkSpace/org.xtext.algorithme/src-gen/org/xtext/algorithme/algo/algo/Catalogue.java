/**
 * generated by Xtext 2.32.0
 */
package org.xtext.algorithme.algo.algo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.algorithme.algo.algo.Catalogue#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.algorithme.algo.algo.Catalogue#getAlgorithmes <em>Algorithmes</em>}</li>
 * </ul>
 *
 * @see org.xtext.algorithme.algo.algo.AlgoPackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject
{
  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see org.xtext.algorithme.algo.algo.AlgoPackage#getCatalogue_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link org.xtext.algorithme.algo.algo.Catalogue#getNom <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom</em>' attribute.
   * @see #getNom()
   * @generated
   */
  void setNom(String value);

  /**
   * Returns the value of the '<em><b>Algorithmes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.algorithme.algo.algo.Algorithme}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithmes</em>' containment reference list.
   * @see org.xtext.algorithme.algo.algo.AlgoPackage#getCatalogue_Algorithmes()
   * @model containment="true"
   * @generated
   */
  EList<Algorithme> getAlgorithmes();

} // Catalogue