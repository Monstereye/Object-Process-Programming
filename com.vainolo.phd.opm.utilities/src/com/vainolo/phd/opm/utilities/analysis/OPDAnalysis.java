/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.utilities.analysis;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Iterables.*;

import java.util.Collection;
import java.util.Set;

import com.google.common.collect.Sets;
import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMProceduralLink;
import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.utilities.predicates.IsOPMEventLink;
import com.vainolo.phd.opm.utilities.predicates.IsOPMInvocationLink;
import com.vainolo.phd.opm.utilities.predicates.IsOPMObjectNode;
import com.vainolo.phd.opm.utilities.predicates.IsOPMProceduralLink;
import com.vainolo.phd.opm.utilities.predicates.IsOPMProcessIncomingDataLink;
import com.vainolo.phd.opm.utilities.predicates.IsOPMProcessNode;
import com.vainolo.phd.opm.utilities.predicates.IsOPMProcessOutgoingDataLink;
import com.vainolo.phd.opm.utilities.predicates.IsOPMStructuralLink;

@SuppressWarnings("unchecked")
public class OPDAnalysis {

  // Implementing

  /**
   * We assume that all effect links have the object as the source.
   * 
   * @param object
   * @return
   */
  public static Set<OPMProcess> findConnectedEventProcesses(OPMObject object) {
    Set<OPMProcess> processes = Sets.newHashSet();
    for(OPMProceduralLink link : findOutgoingEventLinks(object)) {
      processes.add((OPMProcess) link.getTarget());
    }
    return processes;
  }

  private static Iterable<OPMProceduralLink> findOutgoingEventLinks(OPMObject object) {
    return filter(findAllProceduralLinks(object), IsOPMEventLink.INSTANCE);
  }

  //

  @SuppressWarnings("rawtypes")
  private static Iterable<OPMProceduralLink> findAllProceduralLinks(OPMNode node) {
    return (Iterable) filter(concat(node.getIncomingLinks(), node.getOutgoingLinks()), IsOPMProceduralLink.INSTANCE);
  }

  public static OPMObjectProcessDiagram findOPD(OPMNode node) {
    OPMContainer currentContainer = node.getContainer();
    while(!(currentContainer instanceof OPMObjectProcessDiagram)) { // $codepro.audit.disable useForLoop
      currentContainer = ((OPMNode) currentContainer).getContainer();
    }
    return (OPMObjectProcessDiagram) currentContainer;
  }

  public static Iterable<OPMProceduralLink> findOutgoingInvocationLinks(OPMProcess process) {
    return filter(findAllProceduralLinks(process), IsOPMInvocationLink.INSTANCE);
  }

  public static Iterable<OPMProceduralLink> findIncomingDataLinks(OPMProcess process) {
    return filter(findAllProceduralLinks(process), IsOPMProcessIncomingDataLink.INSTANCE);
  }

  public static Iterable<OPMProceduralLink> findOutgoingDataLinks(OPMProcess process) {
    return filter(findAllProceduralLinks(process), IsOPMProcessOutgoingDataLink.INSTANCE);
  }

  public static Collection<OPMProcess> findExecutableProcesses(OPMObjectProcessDiagram opd) {
    switch(opd.getKind()) {
      case COMPOUND:
        return findContainedProcesses(findInZoomedProcess(opd));
      case SYSTEM:
        return findContainedProcesses(opd);
      default:
        throw new IllegalStateException("Unknown OPD kind.");
    }
  }

  @SuppressWarnings("rawtypes")
  private static Collection<OPMProcess> findContainedProcesses(OPMContainer container) {
    return (Collection) filter(container.getNodes(), IsOPMProcessNode.INSTANCE);
  }

  @SuppressWarnings("rawtypes")
  public static Collection<OPMObject> findContainedObjects(OPMContainer container) {
    return (Collection) filter(container.getNodes(), IsOPMObjectNode.INSTANCE);
  }

  public static OPMProcess findInZoomedProcess(OPMObjectProcessDiagram opd) {
    Collection<OPMNode> processNodes = filter(opd.getNodes(), IsOPMProcessNode.INSTANCE);
    if(processNodes.size() != 1) {
      throw new RuntimeException("A compound OPD can containt only one process directly.");
    }
    return (OPMProcess) processNodes.iterator().next();
  }

  public static Collection<OPMLink> findOutgoingStructuralLinks(OPMNode node) {
    return filter(node.getOutgoingLinks(), IsOPMStructuralLink.INSTANCE);
  }

  public static Collection<OPMLink> findIncomingStructuralLinks(OPMNode node) {
    return filter(node.getIncomingLinks(), IsOPMStructuralLink.INSTANCE);
  }
}