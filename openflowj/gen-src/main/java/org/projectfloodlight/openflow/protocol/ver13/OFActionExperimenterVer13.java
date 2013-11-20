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

abstract class OFActionExperimenterVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 8;


    public final static OFActionExperimenterVer13.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFActionExperimenter> {
        @Override
        public OFActionExperimenter readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFActionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            int experimenter = bb.readInt();
            bb.readerIndex(start);
            switch(experimenter) {
               case 0x5c16c7:
                   // discriminator value 0x5c16c7L=0x5c16c7L for class OFActionBsnVer13
                   return OFActionBsnVer13.READER.readFrom(bb);
               case 0x2320:
                   // discriminator value 0x2320L=0x2320L for class OFActionNiciraVer13
                   return OFActionNiciraVer13.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator experimenter of class OFActionExperimenterVer13: " + experimenter);
            }
        }
    }
}
