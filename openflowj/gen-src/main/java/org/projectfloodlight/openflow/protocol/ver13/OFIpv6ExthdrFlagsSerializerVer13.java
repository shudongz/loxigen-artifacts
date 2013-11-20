// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFIpv6ExthdrFlags;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFIpv6ExthdrFlagsSerializerVer13 {

    public final static short NONEXT_VAL = (short) 0x1;
    public final static short ESP_VAL = (short) 0x2;
    public final static short AUTH_VAL = (short) 0x4;
    public final static short DEST_VAL = (short) 0x8;
    public final static short FRAG_VAL = (short) 0x10;
    public final static short ROUTER_VAL = (short) 0x20;
    public final static short HOP_VAL = (short) 0x40;
    public final static short UNREP_VAL = (short) 0x80;
    public final static short UNSEQ_VAL = (short) 0x100;

    public static Set<OFIpv6ExthdrFlags> readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, Set<OFIpv6ExthdrFlags> set) {
        bb.writeShort(toWireValue(set));
    }

    public static void putTo(Set<OFIpv6ExthdrFlags> set, PrimitiveSink sink) {
        sink.putShort(toWireValue(set));
    }


    public static Set<OFIpv6ExthdrFlags> ofWireValue(short val) {
        EnumSet<OFIpv6ExthdrFlags> set = EnumSet.noneOf(OFIpv6ExthdrFlags.class);

        if((val & NONEXT_VAL) != 0)
            set.add(OFIpv6ExthdrFlags.NONEXT);
        if((val & ESP_VAL) != 0)
            set.add(OFIpv6ExthdrFlags.ESP);
        if((val & AUTH_VAL) != 0)
            set.add(OFIpv6ExthdrFlags.AUTH);
        if((val & DEST_VAL) != 0)
            set.add(OFIpv6ExthdrFlags.DEST);
        if((val & FRAG_VAL) != 0)
            set.add(OFIpv6ExthdrFlags.FRAG);
        if((val & ROUTER_VAL) != 0)
            set.add(OFIpv6ExthdrFlags.ROUTER);
        if((val & HOP_VAL) != 0)
            set.add(OFIpv6ExthdrFlags.HOP);
        if((val & UNREP_VAL) != 0)
            set.add(OFIpv6ExthdrFlags.UNREP);
        if((val & UNSEQ_VAL) != 0)
            set.add(OFIpv6ExthdrFlags.UNSEQ);
        return Collections.unmodifiableSet(set);
    }

    public static short toWireValue(Set<OFIpv6ExthdrFlags> set) {
        short wireValue = 0;

        for(OFIpv6ExthdrFlags e: set) {
            switch(e) {
                case NONEXT:
                    wireValue |= NONEXT_VAL;
                    break;
                case ESP:
                    wireValue |= ESP_VAL;
                    break;
                case AUTH:
                    wireValue |= AUTH_VAL;
                    break;
                case DEST:
                    wireValue |= DEST_VAL;
                    break;
                case FRAG:
                    wireValue |= FRAG_VAL;
                    break;
                case ROUTER:
                    wireValue |= ROUTER_VAL;
                    break;
                case HOP:
                    wireValue |= HOP_VAL;
                    break;
                case UNREP:
                    wireValue |= UNREP_VAL;
                    break;
                case UNSEQ:
                    wireValue |= UNSEQ_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFIpv6ExthdrFlags in version 1.3: " + e);
            }
        }
        return wireValue;
    }

}
