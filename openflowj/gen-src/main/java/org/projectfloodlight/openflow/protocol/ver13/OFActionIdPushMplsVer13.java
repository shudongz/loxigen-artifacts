// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionIdPushMplsVer13 implements OFActionIdPushMpls {
    private static final Logger logger = LoggerFactory.getLogger(OFActionIdPushMplsVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 6;


    // OF message fields
//
    // Immutable default instance
    final static OFActionIdPushMplsVer13 DEFAULT = new OFActionIdPushMplsVer13(

    );

    final static OFActionIdPushMplsVer13 INSTANCE = new OFActionIdPushMplsVer13();
    // private empty constructor - use shared instance!
    private OFActionIdPushMplsVer13() {
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.PUSH_MPLS;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    // no data members - do not support builder
    public OFActionIdPushMpls.Builder createBuilder() {
        throw new UnsupportedOperationException("OFActionIdPushMplsVer13 has no mutable properties -- builder unneeded");
    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionIdPushMpls> {
        @Override
        public OFActionIdPushMpls readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 19
            short type = bb.readShort();
            if(type != (short) 0x13)
                throw new OFParseError("Wrong type: Expected=OFActionType.PUSH_MPLS(19), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 6)
                throw new OFParseError("Wrong length: Expected=6(6), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // pad: 2 bytes
            bb.skipBytes(2);

            if(logger.isTraceEnabled())
                logger.trace("readFrom - returning shared instance={}", INSTANCE);
            return INSTANCE;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionIdPushMplsVer13Funnel FUNNEL = new OFActionIdPushMplsVer13Funnel();
    static class OFActionIdPushMplsVer13Funnel implements Funnel<OFActionIdPushMplsVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionIdPushMplsVer13 message, PrimitiveSink sink) {
            // fixed value property type = 19
            sink.putShort((short) 0x13);
            // fixed value property length = 6
            sink.putShort((short) 0x6);
            // skip pad (2 bytes)
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionIdPushMplsVer13> {
        @Override
        public void write(ChannelBuffer bb, OFActionIdPushMplsVer13 message) {
            // fixed value property type = 19
            bb.writeShort((short) 0x13);
            // fixed value property length = 6
            bb.writeShort((short) 0x6);
            // pad: 2 bytes
            bb.writeZero(2);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionIdPushMplsVer13(");
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;

        return result;
    }

}
