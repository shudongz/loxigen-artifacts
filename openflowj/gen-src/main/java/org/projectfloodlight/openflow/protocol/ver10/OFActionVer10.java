// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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
import org.jboss.netty.buffer.ChannelBuffer;
import java.util.Set;

abstract class OFActionVer10 {
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int MINIMUM_LENGTH = 8;


    public final static OFActionVer10.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFAction> {
        @Override
        public OFAction readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            bb.readerIndex(start);
            switch(type) {
               case (short) 0xffff:
                   // discriminator value OFActionType.EXPERIMENTER=65535 for class OFActionExperimenterVer10
                   return OFActionExperimenterVer10.READER.readFrom(bb);
               case (short) 0xb:
                   // discriminator value OFActionType.ENQUEUE=11 for class OFActionEnqueueVer10
                   return OFActionEnqueueVer10.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value OFActionType.OUTPUT=0 for class OFActionOutputVer10
                   return OFActionOutputVer10.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value OFActionType.SET_DL_DST=5 for class OFActionSetDlDstVer10
                   return OFActionSetDlDstVer10.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value OFActionType.SET_DL_SRC=4 for class OFActionSetDlSrcVer10
                   return OFActionSetDlSrcVer10.READER.readFrom(bb);
               case (short) 0x7:
                   // discriminator value OFActionType.SET_NW_DST=7 for class OFActionSetNwDstVer10
                   return OFActionSetNwDstVer10.READER.readFrom(bb);
               case (short) 0x6:
                   // discriminator value OFActionType.SET_NW_SRC=6 for class OFActionSetNwSrcVer10
                   return OFActionSetNwSrcVer10.READER.readFrom(bb);
               case (short) 0x8:
                   // discriminator value OFActionType.SET_NW_TOS=8 for class OFActionSetNwTosVer10
                   return OFActionSetNwTosVer10.READER.readFrom(bb);
               case (short) 0xa:
                   // discriminator value OFActionType.SET_TP_DST=10 for class OFActionSetTpDstVer10
                   return OFActionSetTpDstVer10.READER.readFrom(bb);
               case (short) 0x9:
                   // discriminator value OFActionType.SET_TP_SRC=9 for class OFActionSetTpSrcVer10
                   return OFActionSetTpSrcVer10.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value OFActionType.SET_VLAN_PCP=2 for class OFActionSetVlanPcpVer10
                   return OFActionSetVlanPcpVer10.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value OFActionType.SET_VLAN_VID=1 for class OFActionSetVlanVidVer10
                   return OFActionSetVlanVidVer10.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value OFActionType.STRIP_VLAN=3 for class OFActionStripVlanVer10
                   return OFActionStripVlanVer10.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFActionVer10: " + type);
            }
        }
    }
}
