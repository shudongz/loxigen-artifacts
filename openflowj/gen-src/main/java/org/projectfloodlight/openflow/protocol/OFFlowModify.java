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
import java.util.List;
import org.jboss.netty.buffer.ChannelBuffer;

public interface OFFlowModify extends OFObject, OFFlowMod {
    OFVersion getVersion();
    OFType getType();
    long getXid();
    U64 getCookie();
    U64 getCookieMask() throws UnsupportedOperationException;
    TableId getTableId() throws UnsupportedOperationException;
    OFFlowModCommand getCommand();
    int getIdleTimeout();
    int getHardTimeout();
    int getPriority();
    OFBufferId getBufferId();
    OFPort getOutPort();
    long getOutGroup() throws UnsupportedOperationException;
    Set<OFFlowModFlags> getFlags();
    Match getMatch();
    List<OFInstruction> getInstructions() throws UnsupportedOperationException;
    List<OFAction> getActions() throws UnsupportedOperationException;

    void writeTo(ChannelBuffer channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFFlowMod.Builder {
        OFFlowModify build();
        OFVersion getVersion();
        OFType getType();
        long getXid();
        Builder setXid(long xid);
        U64 getCookie();
        Builder setCookie(U64 cookie);
        U64 getCookieMask() throws UnsupportedOperationException;
        Builder setCookieMask(U64 cookieMask) throws UnsupportedOperationException;
        TableId getTableId() throws UnsupportedOperationException;
        Builder setTableId(TableId tableId) throws UnsupportedOperationException;
        OFFlowModCommand getCommand();
        int getIdleTimeout();
        Builder setIdleTimeout(int idleTimeout);
        int getHardTimeout();
        Builder setHardTimeout(int hardTimeout);
        int getPriority();
        Builder setPriority(int priority);
        OFBufferId getBufferId();
        Builder setBufferId(OFBufferId bufferId);
        OFPort getOutPort();
        Builder setOutPort(OFPort outPort);
        long getOutGroup() throws UnsupportedOperationException;
        Builder setOutGroup(long outGroup) throws UnsupportedOperationException;
        Set<OFFlowModFlags> getFlags();
        Builder setFlags(Set<OFFlowModFlags> flags);
        Match getMatch();
        Builder setMatch(Match match);
        List<OFInstruction> getInstructions() throws UnsupportedOperationException;
        Builder setInstructions(List<OFInstruction> instructions) throws UnsupportedOperationException;
        List<OFAction> getActions() throws UnsupportedOperationException;
        Builder setActions(List<OFAction> actions) throws UnsupportedOperationException;
    }
}
