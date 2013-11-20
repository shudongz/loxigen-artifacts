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
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.jboss.netty.buffer.ChannelBuffer;

abstract class OFGroupModVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 16;


    public final static OFGroupModVer13.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFGroupMod> {
        @Override
        public OFGroupMod readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
            // fixed value property type == 15
            byte type = bb.readByte();
            if(type != (byte) 0xf)
                throw new OFParseError("Wrong type: Expected=OFType.GROUP_MOD(15), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            U32.f(bb.readInt());
            short command = bb.readShort();
            bb.readerIndex(start);
            switch(command) {
               case (short) 0x0:
                   // discriminator value OFGroupModCommand.ADD=0 for class OFGroupAddVer13
                   return OFGroupAddVer13.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value OFGroupModCommand.DELETE=2 for class OFGroupDeleteVer13
                   return OFGroupDeleteVer13.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value OFGroupModCommand.MODIFY=1 for class OFGroupModifyVer13
                   return OFGroupModifyVer13.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator command of class OFGroupModVer13: " + command);
            }
        }
    }
}
