/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.OPMObject#getKind <em>Kind</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMObject#isParameter <em>Parameter</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMObject#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opm.model.OPMPackage#getOPMObject()
 * @model
 * @generated
 */
public interface OPMObject extends OPMThing {

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The default value is <code>"Simple"</code>.
   * The literals are from the enumeration {@link com.vainolo.phd.opm.model.OPMObjectKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see com.vainolo.phd.opm.model.OPMObjectKind
   * @see #setKind(OPMObjectKind)
   * @see com.vainolo.phd.opm.model.OPMPackage#getOPMObject_Kind()
   * @model default="Simple" required="true"
   * @generated
   */
  OPMObjectKind getKind();

  /**
   * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMObject#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see com.vainolo.phd.opm.model.OPMObjectKind
   * @see #getKind()
   * @generated
   */
  void setKind(OPMObjectKind value);

		/**
   * Returns the value of the '<em><b>Parameter</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' attribute.
   * @see #setParameter(boolean)
   * @see com.vainolo.phd.opm.model.OPMPackage#getOPMObject_Parameter()
   * @model default="false" required="true"
   * @generated
   */
	boolean isParameter();

		/**
   * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMObject#isParameter <em>Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' attribute.
   * @see #isParameter()
   * @generated
   */
	void setParameter(boolean value);

    /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(Object)
   * @see com.vainolo.phd.opm.model.OPMPackage#getOPMObject_Value()
   * @model
   * @generated
   */
  Object getValue();

    /**
   * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMObject#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Object value);

} // OPMObject
