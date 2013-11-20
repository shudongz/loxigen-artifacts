// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

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
import org.projectfloodlight.openflow.protocol.OFControllerMaxLen;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFControllerMaxLenSerializerVer12 {

    public final static short MAX_VAL = (short) 0xffe5;
    public final static short NO_BUFFER_VAL = (short) 0xffff;

    public static OFControllerMaxLen readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFControllerMaxLen e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFControllerMaxLen e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFControllerMaxLen ofWireValue(short val) {
        switch(val) {
            case MAX_VAL:
                return OFControllerMaxLen.MAX;
            case NO_BUFFER_VAL:
                return OFControllerMaxLen.NO_BUFFER;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFControllerMaxLen in version 1.2: " + val);
        }
    }


    public static short toWireValue(OFControllerMaxLen e) {
        switch(e) {
            case MAX:
                return MAX_VAL;
            case NO_BUFFER:
                return NO_BUFFER_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFControllerMaxLen in version 1.2: " + e);
        }
    }

}
