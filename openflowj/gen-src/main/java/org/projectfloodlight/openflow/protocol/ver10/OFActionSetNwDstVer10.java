// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionSetNwDstVer10 implements OFActionSetNwDst {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetNwDstVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int LENGTH = 8;

        private final static long DEFAULT_NW_ADDR = 0x0L;

    // OF message fields
    private final long nwAddr;
//
    // Immutable default instance
    final static OFActionSetNwDstVer10 DEFAULT = new OFActionSetNwDstVer10(
        DEFAULT_NW_ADDR
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetNwDstVer10(long nwAddr) {
        this.nwAddr = nwAddr;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_DST;
    }

    @Override
    public long getNwAddr() {
        return nwAddr;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



    public OFActionSetNwDst.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetNwDst.Builder {
        final OFActionSetNwDstVer10 parentMessage;

        // OF message fields
        private boolean nwAddrSet;
        private long nwAddr;

        BuilderWithParent(OFActionSetNwDstVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_DST;
    }

    @Override
    public long getNwAddr() {
        return nwAddr;
    }

    @Override
    public OFActionSetNwDst.Builder setNwAddr(long nwAddr) {
        this.nwAddr = nwAddr;
        this.nwAddrSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



        @Override
        public OFActionSetNwDst build() {
                long nwAddr = this.nwAddrSet ? this.nwAddr : parentMessage.nwAddr;

                //
                return new OFActionSetNwDstVer10(
                    nwAddr
                );
        }

    }

    static class Builder implements OFActionSetNwDst.Builder {
        // OF message fields
        private boolean nwAddrSet;
        private long nwAddr;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_DST;
    }

    @Override
    public long getNwAddr() {
        return nwAddr;
    }

    @Override
    public OFActionSetNwDst.Builder setNwAddr(long nwAddr) {
        this.nwAddr = nwAddr;
        this.nwAddrSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

//
        @Override
        public OFActionSetNwDst build() {
            long nwAddr = this.nwAddrSet ? this.nwAddr : DEFAULT_NW_ADDR;


            return new OFActionSetNwDstVer10(
                    nwAddr
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionSetNwDst> {
        @Override
        public OFActionSetNwDst readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 7
            short type = bb.readShort();
            if(type != (short) 0x7)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_NW_DST(7), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long nwAddr = U32.f(bb.readInt());

            OFActionSetNwDstVer10 actionSetNwDstVer10 = new OFActionSetNwDstVer10(
                    nwAddr
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetNwDstVer10);
            return actionSetNwDstVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetNwDstVer10Funnel FUNNEL = new OFActionSetNwDstVer10Funnel();
    static class OFActionSetNwDstVer10Funnel implements Funnel<OFActionSetNwDstVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetNwDstVer10 message, PrimitiveSink sink) {
            // fixed value property type = 7
            sink.putShort((short) 0x7);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putLong(message.nwAddr);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetNwDstVer10> {
        @Override
        public void write(ChannelBuffer bb, OFActionSetNwDstVer10 message) {
            // fixed value property type = 7
            bb.writeShort((short) 0x7);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeInt(U32.t(message.nwAddr));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetNwDstVer10(");
        b.append("nwAddr=").append(nwAddr);
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
        OFActionSetNwDstVer10 other = (OFActionSetNwDstVer10) obj;

        if( nwAddr != other.nwAddr)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (nwAddr ^ (nwAddr >>> 32));
        return result;
    }

}
