// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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
import org.jboss.netty.buffer.ChannelBuffer;

abstract class OFInstructionIdBsnVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 12;


    public final static OFInstructionIdBsnVer13.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFInstructionIdBsn> {
        @Override
        public OFInstructionIdBsn readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFInstructionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            int subtype = bb.readInt();
            bb.readerIndex(start);
            switch(subtype) {
               case 0x1:
                   // discriminator value 0x1L=0x1L for class OFInstructionIdBsnArpOffloadVer13
                   return OFInstructionIdBsnArpOffloadVer13.READER.readFrom(bb);
               case 0x5:
                   // discriminator value 0x5L=0x5L for class OFInstructionIdBsnDenyVer13
                   return OFInstructionIdBsnDenyVer13.READER.readFrom(bb);
               case 0x2:
                   // discriminator value 0x2L=0x2L for class OFInstructionIdBsnDhcpOffloadVer13
                   return OFInstructionIdBsnDhcpOffloadVer13.READER.readFrom(bb);
               case 0x3:
                   // discriminator value 0x3L=0x3L for class OFInstructionIdBsnDisableSplitHorizonCheckVer13
                   return OFInstructionIdBsnDisableSplitHorizonCheckVer13.READER.readFrom(bb);
               case 0x0:
                   // discriminator value 0x0L=0x0L for class OFInstructionIdBsnDisableSrcMacCheckVer13
                   return OFInstructionIdBsnDisableSrcMacCheckVer13.READER.readFrom(bb);
               case 0x6:
                   // discriminator value 0x6L=0x6L for class OFInstructionIdBsnPacketOfDeathVer13
                   return OFInstructionIdBsnPacketOfDeathVer13.READER.readFrom(bb);
               case 0x4:
                   // discriminator value 0x4L=0x4L for class OFInstructionIdBsnPermitVer13
                   return OFInstructionIdBsnPermitVer13.READER.readFrom(bb);
               case 0x7:
                   // discriminator value 0x7L=0x7L for class OFInstructionIdBsnPrioritizePdusVer13
                   return OFInstructionIdBsnPrioritizePdusVer13.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator subtype of class OFInstructionIdBsnVer13: " + subtype);
            }
        }
    }
}
