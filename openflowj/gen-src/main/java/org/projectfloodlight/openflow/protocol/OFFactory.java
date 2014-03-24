// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import java.util.Set;
import java.util.List;

public interface OFFactory extends XidGenerator {
    // Subfactories
    OFActions actions();
    OFInstructions instructions();
    OFMeterBands meterBands();
    OFOxms oxms();
    OFQueueProps queueProps();
    OFErrorMsgs errorMsgs();
    OFActionIds actionIds();
    OFInstructionIds instructionIds();
    OFBsnTlvs bsnTlvs();

    OFAggregateStatsReply.Builder buildAggregateStatsReply();
    OFAggregateStatsRequest.Builder buildAggregateStatsRequest();
    OFBarrierReply.Builder buildBarrierReply();
    OFBarrierReply barrierReply();
    OFBarrierRequest.Builder buildBarrierRequest();
    OFBarrierRequest barrierRequest();
    OFBsnBwClearDataReply.Builder buildBsnBwClearDataReply();
    OFBsnBwClearDataReply bsnBwClearDataReply(long status);
    OFBsnBwClearDataRequest.Builder buildBsnBwClearDataRequest();
    OFBsnBwClearDataRequest bsnBwClearDataRequest();
    OFBsnBwEnableGetReply.Builder buildBsnBwEnableGetReply();
    OFBsnBwEnableGetReply bsnBwEnableGetReply(long enabled);
    OFBsnBwEnableGetRequest.Builder buildBsnBwEnableGetRequest();
    OFBsnBwEnableGetRequest bsnBwEnableGetRequest();
    OFBsnBwEnableSetReply.Builder buildBsnBwEnableSetReply();
    OFBsnBwEnableSetRequest.Builder buildBsnBwEnableSetRequest();
    OFBsnBwEnableSetRequest bsnBwEnableSetRequest(long enable);
    OFBsnGetInterfacesReply.Builder buildBsnGetInterfacesReply();
    OFBsnGetInterfacesReply bsnGetInterfacesReply(List<OFBsnInterface> interfaces);
    OFBsnGetInterfacesRequest.Builder buildBsnGetInterfacesRequest();
    OFBsnGetInterfacesRequest bsnGetInterfacesRequest();
    OFBsnGetIpMaskReply.Builder buildBsnGetIpMaskReply() throws UnsupportedOperationException;
    OFBsnGetIpMaskRequest.Builder buildBsnGetIpMaskRequest() throws UnsupportedOperationException;
    OFBsnGetIpMaskRequest bsnGetIpMaskRequest(short index);
    OFBsnGetL2TableReply.Builder buildBsnGetL2TableReply() throws UnsupportedOperationException;
    OFBsnGetL2TableRequest.Builder buildBsnGetL2TableRequest() throws UnsupportedOperationException;
    OFBsnGetL2TableRequest bsnGetL2TableRequest();
    OFBsnGetMirroringReply.Builder buildBsnGetMirroringReply();
    OFBsnGetMirroringReply bsnGetMirroringReply(short reportMirrorPorts);
    OFBsnGetMirroringRequest.Builder buildBsnGetMirroringRequest();
    OFBsnGetMirroringRequest bsnGetMirroringRequest(short reportMirrorPorts);
    OFBsnHybridGetReply.Builder buildBsnHybridGetReply() throws UnsupportedOperationException;
    OFBsnHybridGetRequest.Builder buildBsnHybridGetRequest() throws UnsupportedOperationException;
    OFBsnHybridGetRequest bsnHybridGetRequest();
    OFBsnInterface.Builder buildBsnInterface();
    OFBsnPduRxReply.Builder buildBsnPduRxReply();
    OFBsnPduRxRequest.Builder buildBsnPduRxRequest();
    OFBsnPduRxTimeout.Builder buildBsnPduRxTimeout();
    OFBsnPduTxReply.Builder buildBsnPduTxReply();
    OFBsnPduTxRequest.Builder buildBsnPduTxRequest();
    OFBsnSetIpMask.Builder buildBsnSetIpMask() throws UnsupportedOperationException;
    OFBsnSetL2TableReply.Builder buildBsnSetL2TableReply() throws UnsupportedOperationException;
    OFBsnSetL2TableRequest.Builder buildBsnSetL2TableRequest() throws UnsupportedOperationException;
    OFBsnSetMirroring.Builder buildBsnSetMirroring();
    OFBsnSetMirroring bsnSetMirroring(short reportMirrorPorts);
    OFBsnSetPktinSuppressionReply.Builder buildBsnSetPktinSuppressionReply();
    OFBsnSetPktinSuppressionReply bsnSetPktinSuppressionReply(long status);
    OFBsnSetPktinSuppressionRequest.Builder buildBsnSetPktinSuppressionRequest();
    OFBsnShellCommand.Builder buildBsnShellCommand() throws UnsupportedOperationException;
    OFBsnShellOutput.Builder buildBsnShellOutput() throws UnsupportedOperationException;
    OFBsnShellOutput bsnShellOutput(byte[] data);
    OFBsnShellStatus.Builder buildBsnShellStatus() throws UnsupportedOperationException;
    OFBsnShellStatus bsnShellStatus(long status);
    OFBsnVirtualPortCreateReply.Builder buildBsnVirtualPortCreateReply();
    OFBsnVportQInQ.Builder buildBsnVportQInQ();
    OFBsnVirtualPortCreateRequest.Builder buildBsnVirtualPortCreateRequest();
    OFBsnVirtualPortCreateRequest bsnVirtualPortCreateRequest(OFBsnVportQInQ vport);
    OFBsnVirtualPortRemoveReply.Builder buildBsnVirtualPortRemoveReply();
    OFBsnVirtualPortRemoveReply bsnVirtualPortRemoveReply(long status);
    OFBsnVirtualPortRemoveRequest.Builder buildBsnVirtualPortRemoveRequest();
    OFBsnVirtualPortRemoveRequest bsnVirtualPortRemoveRequest(long vportNo);
    OFDescStatsReply.Builder buildDescStatsReply();
    OFDescStatsRequest.Builder buildDescStatsRequest();
    OFDescStatsRequest descStatsRequest(Set<OFStatsRequestFlags> flags);
    OFEchoReply.Builder buildEchoReply();
    OFEchoReply echoReply(byte[] data);
    OFEchoRequest.Builder buildEchoRequest();
    OFEchoRequest echoRequest(byte[] data);
    OFFeaturesReply.Builder buildFeaturesReply();
    OFFeaturesRequest.Builder buildFeaturesRequest();
    OFFeaturesRequest featuresRequest();
    OFFlowAdd.Builder buildFlowAdd();
    OFFlowDelete.Builder buildFlowDelete();
    OFFlowDeleteStrict.Builder buildFlowDeleteStrict();
    OFFlowModify.Builder buildFlowModify();
    OFFlowModifyStrict.Builder buildFlowModifyStrict();
    OFFlowRemoved.Builder buildFlowRemoved();
    OFFlowStatsEntry.Builder buildFlowStatsEntry();
    OFFlowStatsReply.Builder buildFlowStatsReply();
    OFFlowStatsRequest.Builder buildFlowStatsRequest();
    OFGetConfigReply.Builder buildGetConfigReply();
    OFGetConfigRequest.Builder buildGetConfigRequest();
    OFGetConfigRequest getConfigRequest();
    OFHello.Builder buildHello();
    OFHello hello(List<OFHelloElem> elements);
    OFMatchV1.Builder buildMatchV1() throws UnsupportedOperationException;
    OFNiciraControllerRoleReply.Builder buildNiciraControllerRoleReply() throws UnsupportedOperationException;
    OFNiciraControllerRoleReply niciraControllerRoleReply(OFNiciraControllerRole role);
    OFNiciraControllerRoleRequest.Builder buildNiciraControllerRoleRequest() throws UnsupportedOperationException;
    OFNiciraControllerRoleRequest niciraControllerRoleRequest(OFNiciraControllerRole role);
    OFPacketIn.Builder buildPacketIn();
    OFPacketOut.Builder buildPacketOut();
    OFPacketQueue.Builder buildPacketQueue();
    OFPortDesc.Builder buildPortDesc();
    OFPortMod.Builder buildPortMod();
    OFPortStatsEntry.Builder buildPortStatsEntry();
    OFPortStatsReply.Builder buildPortStatsReply();
    OFPortStatsRequest.Builder buildPortStatsRequest();
    OFPortStatus.Builder buildPortStatus();
    OFQueueGetConfigReply.Builder buildQueueGetConfigReply();
    OFQueueGetConfigRequest.Builder buildQueueGetConfigRequest();
    OFQueueGetConfigRequest queueGetConfigRequest(OFPort port);
    OFQueueStatsEntry.Builder buildQueueStatsEntry();
    OFQueueStatsReply.Builder buildQueueStatsReply();
    OFQueueStatsRequest.Builder buildQueueStatsRequest();
    OFSetConfig.Builder buildSetConfig();
    OFTableMod.Builder buildTableMod();
    OFTableStatsEntry.Builder buildTableStatsEntry();
    OFTableStatsReply.Builder buildTableStatsReply();
    OFTableStatsRequest.Builder buildTableStatsRequest();
    OFTableStatsRequest tableStatsRequest(Set<OFStatsRequestFlags> flags);
    OFBucket.Builder buildBucket() throws UnsupportedOperationException;
    OFBucketCounter.Builder buildBucketCounter() throws UnsupportedOperationException;
    OFBucketCounter bucketCounter(U64 packetCount, U64 byteCount);
    OFGroupAdd.Builder buildGroupAdd() throws UnsupportedOperationException;
    OFGroupDelete.Builder buildGroupDelete() throws UnsupportedOperationException;
    OFGroupDescStatsEntry.Builder buildGroupDescStatsEntry() throws UnsupportedOperationException;
    OFGroupDescStatsReply.Builder buildGroupDescStatsReply() throws UnsupportedOperationException;
    OFGroupDescStatsRequest.Builder buildGroupDescStatsRequest() throws UnsupportedOperationException;
    OFGroupDescStatsRequest groupDescStatsRequest(Set<OFStatsRequestFlags> flags);
    OFGroupModify.Builder buildGroupModify() throws UnsupportedOperationException;
    OFGroupStatsEntry.Builder buildGroupStatsEntry() throws UnsupportedOperationException;
    OFGroupStatsReply.Builder buildGroupStatsReply() throws UnsupportedOperationException;
    OFGroupStatsRequest.Builder buildGroupStatsRequest() throws UnsupportedOperationException;
    OFMatchV2.Builder buildMatchV2() throws UnsupportedOperationException;
    OFGroupFeaturesStatsReply.Builder buildGroupFeaturesStatsReply() throws UnsupportedOperationException;
    OFGroupFeaturesStatsRequest.Builder buildGroupFeaturesStatsRequest() throws UnsupportedOperationException;
    OFGroupFeaturesStatsRequest groupFeaturesStatsRequest(Set<OFStatsRequestFlags> flags);
    OFMatchV3.Builder buildMatchV3() throws UnsupportedOperationException;
    OFMatchV3 matchV3(OFOxmList oxmList);
    OFRoleReply.Builder buildRoleReply() throws UnsupportedOperationException;
    OFRoleRequest.Builder buildRoleRequest() throws UnsupportedOperationException;
    OFAsyncGetReply.Builder buildAsyncGetReply() throws UnsupportedOperationException;
    OFAsyncGetRequest.Builder buildAsyncGetRequest() throws UnsupportedOperationException;
    OFAsyncSet.Builder buildAsyncSet() throws UnsupportedOperationException;
    OFBsnArpIdle.Builder buildBsnArpIdle() throws UnsupportedOperationException;
    OFBsnControllerConnection.Builder buildBsnControllerConnection() throws UnsupportedOperationException;
    OFBsnControllerConnectionsReply.Builder buildBsnControllerConnectionsReply() throws UnsupportedOperationException;
    OFBsnControllerConnectionsReply bsnControllerConnectionsReply(List<OFBsnControllerConnection> connections);
    OFBsnControllerConnectionsRequest.Builder buildBsnControllerConnectionsRequest() throws UnsupportedOperationException;
    OFBsnControllerConnectionsRequest bsnControllerConnectionsRequest();
    OFBsnDebugCounterDescStatsEntry.Builder buildBsnDebugCounterDescStatsEntry() throws UnsupportedOperationException;
    OFBsnDebugCounterDescStatsReply.Builder buildBsnDebugCounterDescStatsReply() throws UnsupportedOperationException;
    OFBsnDebugCounterDescStatsRequest.Builder buildBsnDebugCounterDescStatsRequest() throws UnsupportedOperationException;
    OFBsnDebugCounterDescStatsRequest bsnDebugCounterDescStatsRequest(Set<OFStatsRequestFlags> flags);
    OFBsnDebugCounterStatsEntry.Builder buildBsnDebugCounterStatsEntry() throws UnsupportedOperationException;
    OFBsnDebugCounterStatsEntry bsnDebugCounterStatsEntry(U64 counterId, U64 value);
    OFBsnDebugCounterStatsReply.Builder buildBsnDebugCounterStatsReply() throws UnsupportedOperationException;
    OFBsnDebugCounterStatsRequest.Builder buildBsnDebugCounterStatsRequest() throws UnsupportedOperationException;
    OFBsnDebugCounterStatsRequest bsnDebugCounterStatsRequest(Set<OFStatsRequestFlags> flags);
    OFBsnFlowChecksumBucketStatsEntry.Builder buildBsnFlowChecksumBucketStatsEntry() throws UnsupportedOperationException;
    OFBsnFlowChecksumBucketStatsEntry bsnFlowChecksumBucketStatsEntry(U64 checksum);
    OFBsnFlowChecksumBucketStatsReply.Builder buildBsnFlowChecksumBucketStatsReply() throws UnsupportedOperationException;
    OFBsnFlowChecksumBucketStatsRequest.Builder buildBsnFlowChecksumBucketStatsRequest() throws UnsupportedOperationException;
    OFBsnFlowIdle.Builder buildBsnFlowIdle() throws UnsupportedOperationException;
    OFBsnFlowIdleEnableGetReply.Builder buildBsnFlowIdleEnableGetReply() throws UnsupportedOperationException;
    OFBsnFlowIdleEnableGetReply bsnFlowIdleEnableGetReply(long enabled);
    OFBsnFlowIdleEnableGetRequest.Builder buildBsnFlowIdleEnableGetRequest() throws UnsupportedOperationException;
    OFBsnFlowIdleEnableGetRequest bsnFlowIdleEnableGetRequest();
    OFBsnFlowIdleEnableSetReply.Builder buildBsnFlowIdleEnableSetReply() throws UnsupportedOperationException;
    OFBsnFlowIdleEnableSetRequest.Builder buildBsnFlowIdleEnableSetRequest() throws UnsupportedOperationException;
    OFBsnFlowIdleEnableSetRequest bsnFlowIdleEnableSetRequest(long enable);
    OFBsnGentableBucketStatsEntry.Builder buildBsnGentableBucketStatsEntry() throws UnsupportedOperationException;
    OFBsnGentableBucketStatsEntry bsnGentableBucketStatsEntry(OFChecksum128 checksum);
    OFBsnGentableBucketStatsReply.Builder buildBsnGentableBucketStatsReply() throws UnsupportedOperationException;
    OFBsnGentableBucketStatsRequest.Builder buildBsnGentableBucketStatsRequest() throws UnsupportedOperationException;
    OFBsnGentableClearReply.Builder buildBsnGentableClearReply() throws UnsupportedOperationException;
    OFBsnGentableClearRequest.Builder buildBsnGentableClearRequest() throws UnsupportedOperationException;
    OFBsnGentableDescStatsEntry.Builder buildBsnGentableDescStatsEntry() throws UnsupportedOperationException;
    OFBsnGentableDescStatsReply.Builder buildBsnGentableDescStatsReply() throws UnsupportedOperationException;
    OFBsnGentableDescStatsRequest.Builder buildBsnGentableDescStatsRequest() throws UnsupportedOperationException;
    OFBsnGentableDescStatsRequest bsnGentableDescStatsRequest(Set<OFStatsRequestFlags> flags);
    OFBsnGentableEntryAdd.Builder buildBsnGentableEntryAdd() throws UnsupportedOperationException;
    OFBsnGentableEntryDelete.Builder buildBsnGentableEntryDelete() throws UnsupportedOperationException;
    OFBsnGentableEntryDescStatsEntry.Builder buildBsnGentableEntryDescStatsEntry() throws UnsupportedOperationException;
    OFBsnGentableEntryDescStatsReply.Builder buildBsnGentableEntryDescStatsReply() throws UnsupportedOperationException;
    OFBsnGentableEntryDescStatsRequest.Builder buildBsnGentableEntryDescStatsRequest() throws UnsupportedOperationException;
    OFBsnGentableEntryStatsEntry.Builder buildBsnGentableEntryStatsEntry() throws UnsupportedOperationException;
    OFBsnGentableEntryStatsEntry bsnGentableEntryStatsEntry(List<OFBsnTlv> key, List<OFBsnTlv> stats);
    OFBsnGentableEntryStatsReply.Builder buildBsnGentableEntryStatsReply() throws UnsupportedOperationException;
    OFBsnGentableEntryStatsRequest.Builder buildBsnGentableEntryStatsRequest() throws UnsupportedOperationException;
    OFBsnGentableSetBucketsSize.Builder buildBsnGentableSetBucketsSize() throws UnsupportedOperationException;
    OFBsnGentableStatsEntry.Builder buildBsnGentableStatsEntry() throws UnsupportedOperationException;
    OFBsnGentableStatsReply.Builder buildBsnGentableStatsReply() throws UnsupportedOperationException;
    OFBsnGentableStatsRequest.Builder buildBsnGentableStatsRequest() throws UnsupportedOperationException;
    OFBsnGentableStatsRequest bsnGentableStatsRequest(Set<OFStatsRequestFlags> flags);
    OFBsnGetSwitchPipelineReply.Builder buildBsnGetSwitchPipelineReply() throws UnsupportedOperationException;
    OFBsnGetSwitchPipelineReply bsnGetSwitchPipelineReply(String pipeline);
    OFBsnGetSwitchPipelineRequest.Builder buildBsnGetSwitchPipelineRequest() throws UnsupportedOperationException;
    OFBsnGetSwitchPipelineRequest bsnGetSwitchPipelineRequest();
    OFBsnLacpConvergenceNotif.Builder buildBsnLacpConvergenceNotif() throws UnsupportedOperationException;
    OFBsnLacpStatsEntry.Builder buildBsnLacpStatsEntry() throws UnsupportedOperationException;
    OFBsnLacpStatsReply.Builder buildBsnLacpStatsReply() throws UnsupportedOperationException;
    OFBsnLacpStatsRequest.Builder buildBsnLacpStatsRequest() throws UnsupportedOperationException;
    OFBsnLacpStatsRequest bsnLacpStatsRequest(Set<OFStatsRequestFlags> flags);
    OFBsnPortCounterStatsEntry.Builder buildBsnPortCounterStatsEntry() throws UnsupportedOperationException;
    OFBsnPortCounterStatsEntry bsnPortCounterStatsEntry(OFPort portNo, List<U64> values);
    OFBsnPortCounterStatsReply.Builder buildBsnPortCounterStatsReply() throws UnsupportedOperationException;
    OFBsnPortCounterStatsRequest.Builder buildBsnPortCounterStatsRequest() throws UnsupportedOperationException;
    OFBsnRoleStatus.Builder buildBsnRoleStatus() throws UnsupportedOperationException;
    OFBsnSetAuxCxnsReply.Builder buildBsnSetAuxCxnsReply() throws UnsupportedOperationException;
    OFBsnSetAuxCxnsRequest.Builder buildBsnSetAuxCxnsRequest() throws UnsupportedOperationException;
    OFBsnSetAuxCxnsRequest bsnSetAuxCxnsRequest(long numAux);
    OFBsnSetLacpReply.Builder buildBsnSetLacpReply() throws UnsupportedOperationException;
    OFBsnSetLacpRequest.Builder buildBsnSetLacpRequest() throws UnsupportedOperationException;
    OFBsnSetSwitchPipelineReply.Builder buildBsnSetSwitchPipelineReply() throws UnsupportedOperationException;
    OFBsnSetSwitchPipelineReply bsnSetSwitchPipelineReply(long status);
    OFBsnSetSwitchPipelineRequest.Builder buildBsnSetSwitchPipelineRequest() throws UnsupportedOperationException;
    OFBsnSetSwitchPipelineRequest bsnSetSwitchPipelineRequest(String pipeline);
    OFBsnSwitchPipelineStatsEntry.Builder buildBsnSwitchPipelineStatsEntry() throws UnsupportedOperationException;
    OFBsnSwitchPipelineStatsEntry bsnSwitchPipelineStatsEntry(String pipeline);
    OFBsnSwitchPipelineStatsReply.Builder buildBsnSwitchPipelineStatsReply() throws UnsupportedOperationException;
    OFBsnSwitchPipelineStatsRequest.Builder buildBsnSwitchPipelineStatsRequest() throws UnsupportedOperationException;
    OFBsnSwitchPipelineStatsRequest bsnSwitchPipelineStatsRequest(Set<OFStatsRequestFlags> flags);
    OFBsnTableChecksumStatsEntry.Builder buildBsnTableChecksumStatsEntry() throws UnsupportedOperationException;
    OFBsnTableChecksumStatsEntry bsnTableChecksumStatsEntry(TableId tableId, U64 checksum);
    OFBsnTableChecksumStatsReply.Builder buildBsnTableChecksumStatsReply() throws UnsupportedOperationException;
    OFBsnTableChecksumStatsRequest.Builder buildBsnTableChecksumStatsRequest() throws UnsupportedOperationException;
    OFBsnTableChecksumStatsRequest bsnTableChecksumStatsRequest(Set<OFStatsRequestFlags> flags);
    OFBsnTableSetBucketsSize.Builder buildBsnTableSetBucketsSize() throws UnsupportedOperationException;
    OFBsnTimeReply.Builder buildBsnTimeReply() throws UnsupportedOperationException;
    OFBsnTimeReply bsnTimeReply(U64 timeMs);
    OFBsnTimeRequest.Builder buildBsnTimeRequest() throws UnsupportedOperationException;
    OFBsnTimeRequest bsnTimeRequest();
    OFBsnVlanCounterStatsEntry.Builder buildBsnVlanCounterStatsEntry() throws UnsupportedOperationException;
    OFBsnVlanCounterStatsEntry bsnVlanCounterStatsEntry(int vlanVid, List<U64> values);
    OFBsnVlanCounterStatsReply.Builder buildBsnVlanCounterStatsReply() throws UnsupportedOperationException;
    OFBsnVlanCounterStatsRequest.Builder buildBsnVlanCounterStatsRequest() throws UnsupportedOperationException;
    OFHelloElemVersionbitmap.Builder buildHelloElemVersionbitmap() throws UnsupportedOperationException;
    OFHelloElemVersionbitmap helloElemVersionbitmap(List<U32> bitmaps);
    OFMeterBandStats.Builder buildMeterBandStats() throws UnsupportedOperationException;
    OFMeterBandStats meterBandStats(U64 packetBandCount, U64 byteBandCount);
    OFMeterConfig.Builder buildMeterConfig() throws UnsupportedOperationException;
    OFMeterConfigStatsReply.Builder buildMeterConfigStatsReply() throws UnsupportedOperationException;
    OFMeterConfigStatsRequest.Builder buildMeterConfigStatsRequest() throws UnsupportedOperationException;
    OFMeterFeatures.Builder buildMeterFeatures() throws UnsupportedOperationException;
    OFMeterFeaturesStatsReply.Builder buildMeterFeaturesStatsReply() throws UnsupportedOperationException;
    OFMeterFeaturesStatsRequest.Builder buildMeterFeaturesStatsRequest() throws UnsupportedOperationException;
    OFMeterFeaturesStatsRequest meterFeaturesStatsRequest(Set<OFStatsRequestFlags> flags);
    OFMeterMod.Builder buildMeterMod() throws UnsupportedOperationException;
    OFMeterStats.Builder buildMeterStats() throws UnsupportedOperationException;
    OFMeterStatsReply.Builder buildMeterStatsReply() throws UnsupportedOperationException;
    OFMeterStatsRequest.Builder buildMeterStatsRequest() throws UnsupportedOperationException;
    OFPortDescStatsReply.Builder buildPortDescStatsReply() throws UnsupportedOperationException;
    OFPortDescStatsRequest.Builder buildPortDescStatsRequest() throws UnsupportedOperationException;
    OFPortDescStatsRequest portDescStatsRequest(Set<OFStatsRequestFlags> flags);
    OFTableFeaturePropApplyActions.Builder buildTableFeaturePropApplyActions() throws UnsupportedOperationException;
    OFTableFeaturePropApplyActions tableFeaturePropApplyActions(List<OFActionId> actionIds);
    OFTableFeaturePropApplyActionsMiss.Builder buildTableFeaturePropApplyActionsMiss() throws UnsupportedOperationException;
    OFTableFeaturePropApplyActionsMiss tableFeaturePropApplyActionsMiss(List<OFActionId> actionIds);
    OFTableFeaturePropApplySetfield.Builder buildTableFeaturePropApplySetfield() throws UnsupportedOperationException;
    OFTableFeaturePropApplySetfield tableFeaturePropApplySetfield(List<U32> oxmIds);
    OFTableFeaturePropApplySetfieldMiss.Builder buildTableFeaturePropApplySetfieldMiss() throws UnsupportedOperationException;
    OFTableFeaturePropApplySetfieldMiss tableFeaturePropApplySetfieldMiss(List<U32> oxmIds);
    OFTableFeaturePropExperimenter.Builder buildTableFeaturePropExperimenter() throws UnsupportedOperationException;
    OFTableFeaturePropExperimenterMiss.Builder buildTableFeaturePropExperimenterMiss() throws UnsupportedOperationException;
    OFTableFeaturePropInstructions.Builder buildTableFeaturePropInstructions() throws UnsupportedOperationException;
    OFTableFeaturePropInstructions tableFeaturePropInstructions(List<OFInstructionId> instructionIds);
    OFTableFeaturePropInstructionsMiss.Builder buildTableFeaturePropInstructionsMiss() throws UnsupportedOperationException;
    OFTableFeaturePropInstructionsMiss tableFeaturePropInstructionsMiss(List<OFInstructionId> instructionIds);
    OFTableFeaturePropMatch.Builder buildTableFeaturePropMatch() throws UnsupportedOperationException;
    OFTableFeaturePropMatch tableFeaturePropMatch(List<U32> oxmIds);
    OFTableFeaturePropNextTables.Builder buildTableFeaturePropNextTables() throws UnsupportedOperationException;
    OFTableFeaturePropNextTables tableFeaturePropNextTables(List<U8> nextTableIds);
    OFTableFeaturePropNextTablesMiss.Builder buildTableFeaturePropNextTablesMiss() throws UnsupportedOperationException;
    OFTableFeaturePropNextTablesMiss tableFeaturePropNextTablesMiss(List<U8> nextTableIds);
    OFTableFeaturePropWildcards.Builder buildTableFeaturePropWildcards() throws UnsupportedOperationException;
    OFTableFeaturePropWildcards tableFeaturePropWildcards(List<U32> oxmIds);
    OFTableFeaturePropWriteActions.Builder buildTableFeaturePropWriteActions() throws UnsupportedOperationException;
    OFTableFeaturePropWriteActions tableFeaturePropWriteActions(List<OFActionId> actionIds);
    OFTableFeaturePropWriteActionsMiss.Builder buildTableFeaturePropWriteActionsMiss() throws UnsupportedOperationException;
    OFTableFeaturePropWriteActionsMiss tableFeaturePropWriteActionsMiss(List<OFActionId> actionIds);
    OFTableFeaturePropWriteSetfield.Builder buildTableFeaturePropWriteSetfield() throws UnsupportedOperationException;
    OFTableFeaturePropWriteSetfield tableFeaturePropWriteSetfield(List<U32> oxmIds);
    OFTableFeaturePropWriteSetfieldMiss.Builder buildTableFeaturePropWriteSetfieldMiss() throws UnsupportedOperationException;
    OFTableFeaturePropWriteSetfieldMiss tableFeaturePropWriteSetfieldMiss(List<U32> oxmIds);
    OFTableFeatures.Builder buildTableFeatures() throws UnsupportedOperationException;
    OFTableFeaturesStatsReply.Builder buildTableFeaturesStatsReply() throws UnsupportedOperationException;
    OFTableFeaturesStatsRequest.Builder buildTableFeaturesStatsRequest() throws UnsupportedOperationException;
    OFUint64.Builder buildUint64() throws UnsupportedOperationException;
    OFUint64 uint64(U64 value);
    Match.Builder buildMatch();
    Match matchWildcardAll();

    OFMessageReader<OFMessage> getReader();
    OFVersion getVersion();
}
