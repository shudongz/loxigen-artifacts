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
import java.util.List;
import org.jboss.netty.buffer.ChannelBuffer;

public interface OFTableFeatures extends OFObject {
    TableId getTableId();
    String getName();
    U64 getMetadataMatch();
    U64 getMetadataWrite();
    long getConfig();
    long getMaxEntries();
    List<OFTableFeatureProp> getProperties();
    OFVersion getVersion();

    void writeTo(ChannelBuffer channelBuffer);

    Builder createBuilder();
    public interface Builder  {
        OFTableFeatures build();
        TableId getTableId();
        Builder setTableId(TableId tableId);
        String getName();
        Builder setName(String name);
        U64 getMetadataMatch();
        Builder setMetadataMatch(U64 metadataMatch);
        U64 getMetadataWrite();
        Builder setMetadataWrite(U64 metadataWrite);
        long getConfig();
        Builder setConfig(long config);
        long getMaxEntries();
        Builder setMaxEntries(long maxEntries);
        List<OFTableFeatureProp> getProperties();
        Builder setProperties(List<OFTableFeatureProp> properties);
        OFVersion getVersion();
    }
}
