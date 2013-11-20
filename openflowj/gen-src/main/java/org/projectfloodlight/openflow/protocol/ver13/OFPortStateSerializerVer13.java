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
import org.projectfloodlight.openflow.protocol.OFPortState;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFPortStateSerializerVer13 {

    public final static int LINK_DOWN_VAL = 0x1;
    public final static int BLOCKED_VAL = 0x2;
    public final static int LIVE_VAL = 0x4;

    public static Set<OFPortState> readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readInt());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, Set<OFPortState> set) {
        bb.writeInt(toWireValue(set));
    }

    public static void putTo(Set<OFPortState> set, PrimitiveSink sink) {
        sink.putInt(toWireValue(set));
    }


    public static Set<OFPortState> ofWireValue(int val) {
        EnumSet<OFPortState> set = EnumSet.noneOf(OFPortState.class);

        if((val & LINK_DOWN_VAL) != 0)
            set.add(OFPortState.LINK_DOWN);
        if((val & BLOCKED_VAL) != 0)
            set.add(OFPortState.BLOCKED);
        if((val & LIVE_VAL) != 0)
            set.add(OFPortState.LIVE);
        return Collections.unmodifiableSet(set);
    }

    public static int toWireValue(Set<OFPortState> set) {
        int wireValue = 0;

        for(OFPortState e: set) {
            switch(e) {
                case LINK_DOWN:
                    wireValue |= LINK_DOWN_VAL;
                    break;
                case BLOCKED:
                    wireValue |= BLOCKED_VAL;
                    break;
                case LIVE:
                    wireValue |= LIVE_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFPortState in version 1.3: " + e);
            }
        }
        return wireValue;
    }

}
