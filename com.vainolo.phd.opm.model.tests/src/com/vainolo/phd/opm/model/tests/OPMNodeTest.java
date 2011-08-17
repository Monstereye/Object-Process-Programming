/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model.tests;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMStructuralLinkAggregator;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.OPMNode#getOutgoingStructuralLinks() <em>Get Outgoing Structural Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMNode#getIncomingStructuralLinks() <em>Get Incoming Structural Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMNode#getOpd() <em>Get Opd</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class OPMNodeTest extends OPMContainerTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(OPMNodeTest.class);
    }

	/**
     * Constructs a new Node test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OPMNodeTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Node test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    protected OPMNode getFixture() {
        return (OPMNode)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(OPMFactory.eINSTANCE.createOPMNode());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
	@Override
	protected void tearDown() throws Exception {
        setFixture(null);
    }

    /**
     * Tests the '{@link com.vainolo.phd.opm.model.OPMNode#getOutgoingStructuralLinks() <em>Get Outgoing Structural Links</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.vainolo.phd.opm.model.OPMNode#getOutgoingStructuralLinks()
     * @generated NOT
     */
    public void testGetOutgoingStructuralLinks() {
        OPMNode node1 = OPMFactory.eINSTANCE.createOPMNode();
        OPMNode node2 = OPMFactory.eINSTANCE.createOPMNode();
        OPMNode node3 = OPMFactory.eINSTANCE.createOPMNode();
        OPMNode node4 = OPMFactory.eINSTANCE.createOPMNode();
        OPMStructuralLinkAggregator aggregator1 = OPMFactory.eINSTANCE.createOPMStructuralLinkAggregator();
        OPMStructuralLinkAggregator aggregator2 = OPMFactory.eINSTANCE.createOPMStructuralLinkAggregator();
        OPMLink link1 = OPMFactory.eINSTANCE.createOPMLink();
        OPMLink link2 = OPMFactory.eINSTANCE.createOPMLink();
        OPMLink link3 = OPMFactory.eINSTANCE.createOPMLink();
        OPMLink link4 = OPMFactory.eINSTANCE.createOPMLink();
        OPMLink link5 = OPMFactory.eINSTANCE.createOPMLink();

        // Check empty list
        assertEquals(0, node1.getOutgoingStructuralLinks().size());
        
        // Create one structural link
        link1.setSource(node1);
        link1.setTarget(aggregator1);
        assertEquals(1, node1.getOutgoingStructuralLinks().size());
        assertEquals(true, node1.getOutgoingStructuralLinks().contains(link1));
        
        // Add another structural link
        link2.setSource(node1);
        link2.setTarget(aggregator2);
        assertEquals(2, node1.getOutgoingStructuralLinks().size());
        assertTrue(node1.getOutgoingStructuralLinks().contains(link1));
        assertTrue(node1.getOutgoingStructuralLinks().contains(link2));
        
        // Add regular link and check that it is not in strucutral links
        link3.setSource(node1);
        link3.setTarget(node2);
        assertEquals(2, node1.getOutgoingStructuralLinks().size());
        assertFalse(node1.getOutgoingStructuralLinks().contains(link3));
        
    }

    /**
     * Tests the '{@link com.vainolo.phd.opm.model.OPMNode#getIncomingStructuralLinks() <em>Get Incoming Structural Links</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.vainolo.phd.opm.model.OPMNode#getIncomingStructuralLinks()
     * @generated NOT
     */
    public void testGetIncomingStructuralLinks() {
        OPMNode node1 = OPMFactory.eINSTANCE.createOPMNode();
        OPMNode node2 = OPMFactory.eINSTANCE.createOPMNode();
        OPMNode node3 = OPMFactory.eINSTANCE.createOPMNode();
        OPMNode node4 = OPMFactory.eINSTANCE.createOPMNode();
        OPMStructuralLinkAggregator aggregator1 = OPMFactory.eINSTANCE.createOPMStructuralLinkAggregator();
        OPMStructuralLinkAggregator aggregator2 = OPMFactory.eINSTANCE.createOPMStructuralLinkAggregator();
        OPMLink link1 = OPMFactory.eINSTANCE.createOPMLink();
        OPMLink link2 = OPMFactory.eINSTANCE.createOPMLink();
        OPMLink link3 = OPMFactory.eINSTANCE.createOPMLink();
        OPMLink link4 = OPMFactory.eINSTANCE.createOPMLink();
        OPMLink link5 = OPMFactory.eINSTANCE.createOPMLink();
        
        // Verify that implementation works for empty list.
        assertEquals(0, node1.getIncomingStructuralLinks().size());
        
        // Add one structural link from node 1 to node 2.
        link1.setSource(node1);
        link1.setTarget(aggregator1);
        link2.setSource(aggregator1);
        link2.setTarget(node2);
        assertEquals(1, node2.getIncomingStructuralLinks().size());
        assertEquals(link2, node2.getIncomingStructuralLinks().get(0));
        
        // Add another structural link from node 1 to note 3
        link3.setSource(aggregator1);
        link3.setTarget(node3);
        assertEquals(1, node2.getIncomingStructuralLinks().size());
        assertEquals(1, node3.getIncomingStructuralLinks().size());
        
        // Add another structural link from node 4 to node 3
        link4.setSource(node4);
        link4.setTarget(aggregator2);
        link5.setSource(aggregator2);
        link5.setTarget(node3);
        assertEquals(1, node2.getIncomingStructuralLinks().size());
        assertEquals(2, node3.getIncomingStructuralLinks().size());
    }

    /**
     * Tests the '{@link com.vainolo.phd.opm.model.OPMNode#getOpd() <em>Get Opd</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.vainolo.phd.opm.model.OPMNode#getOpd()
     * @generated NOT
     */
    public void testGetOpd() {
        // First simple test, create object, set container and check that container was set correctly.
        OPMObjectProcessDiagram opd = OPMFactory.eINSTANCE.createOPMObjectProcessDiagram();
        OPMNode node1 = OPMFactory.eINSTANCE.createOPMNode();
        node1.setContainer(opd);
        assertEquals(opd, node1.getOpd());
        
        // Add more hierarchy levels in the containment hierarchy and check that the correct OPD
        // is always found.
        OPMNode node2 = OPMFactory.eINSTANCE.createOPMNode();
        node2.setContainer(node1);
        assertEquals(opd, node2.getOpd());

    }

} //OPMNodeTest