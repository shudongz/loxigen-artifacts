// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFBadRequestCode;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFBadRequestCodeSerializerVer13 {

    public final static short BAD_VERSION_VAL = (short) 0x0;
    public final static short BAD_TYPE_VAL = (short) 0x1;
    public final static short BAD_STAT_VAL = (short) 0x2;
    public final static short BAD_EXPERIMENTER_VAL = (short) 0x3;
    public final static short BAD_EXPERIMENTER_TYPE_VAL = (short) 0x4;
    public final static short EPERM_VAL = (short) 0x5;
    public final static short BAD_LEN_VAL = (short) 0x6;
    public final static short BUFFER_EMPTY_VAL = (short) 0x7;
    public final static short BUFFER_UNKNOWN_VAL = (short) 0x8;
    public final static short BAD_TABLE_ID_VAL = (short) 0x9;
    public final static short IS_SLAVE_VAL = (short) 0xa;
    public final static short BAD_PORT_VAL = (short) 0xb;
    public final static short BAD_PACKET_VAL = (short) 0xc;
    public final static short MULTIPART_BUFFER_OVERFLOW_VAL = (short) 0xd;

    public static OFBadRequestCode readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFBadRequestCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFBadRequestCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFBadRequestCode ofWireValue(short val) {
        switch(val) {
            case BAD_VERSION_VAL:
                return OFBadRequestCode.BAD_VERSION;
            case BAD_TYPE_VAL:
                return OFBadRequestCode.BAD_TYPE;
            case BAD_STAT_VAL:
                return OFBadRequestCode.BAD_STAT;
            case BAD_EXPERIMENTER_VAL:
                return OFBadRequestCode.BAD_EXPERIMENTER;
            case BAD_EXPERIMENTER_TYPE_VAL:
                return OFBadRequestCode.BAD_EXPERIMENTER_TYPE;
            case EPERM_VAL:
                return OFBadRequestCode.EPERM;
            case BAD_LEN_VAL:
                return OFBadRequestCode.BAD_LEN;
            case BUFFER_EMPTY_VAL:
                return OFBadRequestCode.BUFFER_EMPTY;
            case BUFFER_UNKNOWN_VAL:
                return OFBadRequestCode.BUFFER_UNKNOWN;
            case BAD_TABLE_ID_VAL:
                return OFBadRequestCode.BAD_TABLE_ID;
            case IS_SLAVE_VAL:
                return OFBadRequestCode.IS_SLAVE;
            case BAD_PORT_VAL:
                return OFBadRequestCode.BAD_PORT;
            case BAD_PACKET_VAL:
                return OFBadRequestCode.BAD_PACKET;
            case MULTIPART_BUFFER_OVERFLOW_VAL:
                return OFBadRequestCode.MULTIPART_BUFFER_OVERFLOW;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBadRequestCode in version 1.3: " + val);
        }
    }


    public static short toWireValue(OFBadRequestCode e) {
        switch(e) {
            case BAD_VERSION:
                return BAD_VERSION_VAL;
            case BAD_TYPE:
                return BAD_TYPE_VAL;
            case BAD_STAT:
                return BAD_STAT_VAL;
            case BAD_EXPERIMENTER:
                return BAD_EXPERIMENTER_VAL;
            case BAD_EXPERIMENTER_TYPE:
                return BAD_EXPERIMENTER_TYPE_VAL;
            case EPERM:
                return EPERM_VAL;
            case BAD_LEN:
                return BAD_LEN_VAL;
            case BUFFER_EMPTY:
                return BUFFER_EMPTY_VAL;
            case BUFFER_UNKNOWN:
                return BUFFER_UNKNOWN_VAL;
            case BAD_TABLE_ID:
                return BAD_TABLE_ID_VAL;
            case IS_SLAVE:
                return IS_SLAVE_VAL;
            case BAD_PORT:
                return BAD_PORT_VAL;
            case BAD_PACKET:
                return BAD_PACKET_VAL;
            case MULTIPART_BUFFER_OVERFLOW:
                return MULTIPART_BUFFER_OVERFLOW_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBadRequestCode in version 1.3: " + e);
        }
    }

}
