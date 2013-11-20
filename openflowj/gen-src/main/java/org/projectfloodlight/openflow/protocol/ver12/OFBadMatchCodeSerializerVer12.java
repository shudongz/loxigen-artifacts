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
import org.projectfloodlight.openflow.protocol.OFBadMatchCode;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFBadMatchCodeSerializerVer12 {

    public final static short BAD_TYPE_VAL = (short) 0x0;
    public final static short BAD_LEN_VAL = (short) 0x1;
    public final static short BAD_TAG_VAL = (short) 0x2;
    public final static short BAD_DL_ADDR_MASK_VAL = (short) 0x3;
    public final static short BAD_NW_ADDR_MASK_VAL = (short) 0x4;
    public final static short BAD_WILDCARDS_VAL = (short) 0x5;
    public final static short BAD_FIELD_VAL = (short) 0x6;
    public final static short BAD_VALUE_VAL = (short) 0x7;
    public final static short BAD_MASK_VAL = (short) 0x8;
    public final static short BAD_PREREQ_VAL = (short) 0x9;
    public final static short DUP_FIELD_VAL = (short) 0xa;
    public final static short EPERM_VAL = (short) 0xb;

    public static OFBadMatchCode readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFBadMatchCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFBadMatchCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFBadMatchCode ofWireValue(short val) {
        switch(val) {
            case BAD_TYPE_VAL:
                return OFBadMatchCode.BAD_TYPE;
            case BAD_LEN_VAL:
                return OFBadMatchCode.BAD_LEN;
            case BAD_TAG_VAL:
                return OFBadMatchCode.BAD_TAG;
            case BAD_DL_ADDR_MASK_VAL:
                return OFBadMatchCode.BAD_DL_ADDR_MASK;
            case BAD_NW_ADDR_MASK_VAL:
                return OFBadMatchCode.BAD_NW_ADDR_MASK;
            case BAD_WILDCARDS_VAL:
                return OFBadMatchCode.BAD_WILDCARDS;
            case BAD_FIELD_VAL:
                return OFBadMatchCode.BAD_FIELD;
            case BAD_VALUE_VAL:
                return OFBadMatchCode.BAD_VALUE;
            case BAD_MASK_VAL:
                return OFBadMatchCode.BAD_MASK;
            case BAD_PREREQ_VAL:
                return OFBadMatchCode.BAD_PREREQ;
            case DUP_FIELD_VAL:
                return OFBadMatchCode.DUP_FIELD;
            case EPERM_VAL:
                return OFBadMatchCode.EPERM;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBadMatchCode in version 1.2: " + val);
        }
    }


    public static short toWireValue(OFBadMatchCode e) {
        switch(e) {
            case BAD_TYPE:
                return BAD_TYPE_VAL;
            case BAD_LEN:
                return BAD_LEN_VAL;
            case BAD_TAG:
                return BAD_TAG_VAL;
            case BAD_DL_ADDR_MASK:
                return BAD_DL_ADDR_MASK_VAL;
            case BAD_NW_ADDR_MASK:
                return BAD_NW_ADDR_MASK_VAL;
            case BAD_WILDCARDS:
                return BAD_WILDCARDS_VAL;
            case BAD_FIELD:
                return BAD_FIELD_VAL;
            case BAD_VALUE:
                return BAD_VALUE_VAL;
            case BAD_MASK:
                return BAD_MASK_VAL;
            case BAD_PREREQ:
                return BAD_PREREQ_VAL;
            case DUP_FIELD:
                return DUP_FIELD_VAL;
            case EPERM:
                return EPERM_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBadMatchCode in version 1.2: " + e);
        }
    }

}
