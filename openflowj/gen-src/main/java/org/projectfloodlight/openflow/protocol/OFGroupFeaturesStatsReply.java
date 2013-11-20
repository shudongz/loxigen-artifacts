// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;

public interface OFGroupFeaturesStatsReply extends OFObject, OFStatsReply {
    OFVersion getVersion();
    OFType getType();
    long getXid();
    OFStatsType getStatsType();
    Set<OFStatsReplyFlags> getFlags();
    long getTypes();
    long getCapabilities();
    long getMaxGroupsAll();
    long getMaxGroupsSelect();
    long getMaxGroupsIndirect();
    long getMaxGroupsFf();
    long getActionsAll();
    long getActionsSelect();
    long getActionsIndirect();
    long getActionsFf();

    void writeTo(ChannelBuffer channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFStatsReply.Builder {
        OFGroupFeaturesStatsReply build();
        OFVersion getVersion();
        OFType getType();
        long getXid();
        Builder setXid(long xid);
        OFStatsType getStatsType();
        Set<OFStatsReplyFlags> getFlags();
        Builder setFlags(Set<OFStatsReplyFlags> flags);
        long getTypes();
        Builder setTypes(long types);
        long getCapabilities();
        Builder setCapabilities(long capabilities);
        long getMaxGroupsAll();
        Builder setMaxGroupsAll(long maxGroupsAll);
        long getMaxGroupsSelect();
        Builder setMaxGroupsSelect(long maxGroupsSelect);
        long getMaxGroupsIndirect();
        Builder setMaxGroupsIndirect(long maxGroupsIndirect);
        long getMaxGroupsFf();
        Builder setMaxGroupsFf(long maxGroupsFf);
        long getActionsAll();
        Builder setActionsAll(long actionsAll);
        long getActionsSelect();
        Builder setActionsSelect(long actionsSelect);
        long getActionsIndirect();
        Builder setActionsIndirect(long actionsIndirect);
        long getActionsFf();
        Builder setActionsFf(long actionsFf);
    }
}
