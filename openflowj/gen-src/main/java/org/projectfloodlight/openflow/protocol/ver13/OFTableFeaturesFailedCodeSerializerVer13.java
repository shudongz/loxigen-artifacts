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
import org.projectfloodlight.openflow.protocol.OFTableFeaturesFailedCode;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFTableFeaturesFailedCodeSerializerVer13 {

    public final static short BAD_TABLE_VAL = (short) 0x0;
    public final static short BAD_METADATA_VAL = (short) 0x1;
    public final static short BAD_TYPE_VAL = (short) 0x2;
    public final static short BAD_LEN_VAL = (short) 0x3;
    public final static short BAD_ARGUMENT_VAL = (short) 0x4;
    public final static short EPERM_VAL = (short) 0x5;

    public static OFTableFeaturesFailedCode readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFTableFeaturesFailedCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFTableFeaturesFailedCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFTableFeaturesFailedCode ofWireValue(short val) {
        switch(val) {
            case BAD_TABLE_VAL:
                return OFTableFeaturesFailedCode.BAD_TABLE;
            case BAD_METADATA_VAL:
                return OFTableFeaturesFailedCode.BAD_METADATA;
            case BAD_TYPE_VAL:
                return OFTableFeaturesFailedCode.BAD_TYPE;
            case BAD_LEN_VAL:
                return OFTableFeaturesFailedCode.BAD_LEN;
            case BAD_ARGUMENT_VAL:
                return OFTableFeaturesFailedCode.BAD_ARGUMENT;
            case EPERM_VAL:
                return OFTableFeaturesFailedCode.EPERM;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFTableFeaturesFailedCode in version 1.3: " + val);
        }
    }


    public static short toWireValue(OFTableFeaturesFailedCode e) {
        switch(e) {
            case BAD_TABLE:
                return BAD_TABLE_VAL;
            case BAD_METADATA:
                return BAD_METADATA_VAL;
            case BAD_TYPE:
                return BAD_TYPE_VAL;
            case BAD_LEN:
                return BAD_LEN_VAL;
            case BAD_ARGUMENT:
                return BAD_ARGUMENT_VAL;
            case EPERM:
                return EPERM_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFTableFeaturesFailedCode in version 1.3: " + e);
        }
    }

}
