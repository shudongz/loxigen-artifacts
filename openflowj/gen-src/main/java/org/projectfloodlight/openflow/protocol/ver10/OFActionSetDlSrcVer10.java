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

class OFActionSetDlSrcVer10 implements OFActionSetDlSrc {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetDlSrcVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int LENGTH = 16;

        private final static MacAddress DEFAULT_DL_ADDR = MacAddress.NONE;

    // OF message fields
    private final MacAddress dlAddr;
//
    // Immutable default instance
    final static OFActionSetDlSrcVer10 DEFAULT = new OFActionSetDlSrcVer10(
        DEFAULT_DL_ADDR
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetDlSrcVer10(MacAddress dlAddr) {
        this.dlAddr = dlAddr;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_DL_SRC;
    }

    @Override
    public MacAddress getDlAddr() {
        return dlAddr;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



    public OFActionSetDlSrc.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetDlSrc.Builder {
        final OFActionSetDlSrcVer10 parentMessage;

        // OF message fields
        private boolean dlAddrSet;
        private MacAddress dlAddr;

        BuilderWithParent(OFActionSetDlSrcVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_DL_SRC;
    }

    @Override
    public MacAddress getDlAddr() {
        return dlAddr;
    }

    @Override
    public OFActionSetDlSrc.Builder setDlAddr(MacAddress dlAddr) {
        this.dlAddr = dlAddr;
        this.dlAddrSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



        @Override
        public OFActionSetDlSrc build() {
                MacAddress dlAddr = this.dlAddrSet ? this.dlAddr : parentMessage.dlAddr;
                if(dlAddr == null)
                    throw new NullPointerException("Property dlAddr must not be null");

                //
                return new OFActionSetDlSrcVer10(
                    dlAddr
                );
        }

    }

    static class Builder implements OFActionSetDlSrc.Builder {
        // OF message fields
        private boolean dlAddrSet;
        private MacAddress dlAddr;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_DL_SRC;
    }

    @Override
    public MacAddress getDlAddr() {
        return dlAddr;
    }

    @Override
    public OFActionSetDlSrc.Builder setDlAddr(MacAddress dlAddr) {
        this.dlAddr = dlAddr;
        this.dlAddrSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

//
        @Override
        public OFActionSetDlSrc build() {
            MacAddress dlAddr = this.dlAddrSet ? this.dlAddr : DEFAULT_DL_ADDR;
            if(dlAddr == null)
                throw new NullPointerException("Property dlAddr must not be null");


            return new OFActionSetDlSrcVer10(
                    dlAddr
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionSetDlSrc> {
        @Override
        public OFActionSetDlSrc readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 4
            short type = bb.readShort();
            if(type != (short) 0x4)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_DL_SRC(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 16)
                throw new OFParseError("Wrong length: Expected=16(16), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            MacAddress dlAddr = MacAddress.read6Bytes(bb);
            // pad: 6 bytes
            bb.skipBytes(6);

            OFActionSetDlSrcVer10 actionSetDlSrcVer10 = new OFActionSetDlSrcVer10(
                    dlAddr
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetDlSrcVer10);
            return actionSetDlSrcVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetDlSrcVer10Funnel FUNNEL = new OFActionSetDlSrcVer10Funnel();
    static class OFActionSetDlSrcVer10Funnel implements Funnel<OFActionSetDlSrcVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetDlSrcVer10 message, PrimitiveSink sink) {
            // fixed value property type = 4
            sink.putShort((short) 0x4);
            // fixed value property length = 16
            sink.putShort((short) 0x10);
            message.dlAddr.putTo(sink);
            // skip pad (6 bytes)
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetDlSrcVer10> {
        @Override
        public void write(ChannelBuffer bb, OFActionSetDlSrcVer10 message) {
            // fixed value property type = 4
            bb.writeShort((short) 0x4);
            // fixed value property length = 16
            bb.writeShort((short) 0x10);
            message.dlAddr.write6Bytes(bb);
            // pad: 6 bytes
            bb.writeZero(6);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetDlSrcVer10(");
        b.append("dlAddr=").append(dlAddr);
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
        OFActionSetDlSrcVer10 other = (OFActionSetDlSrcVer10) obj;

        if (dlAddr == null) {
            if (other.dlAddr != null)
                return false;
        } else if (!dlAddr.equals(other.dlAddr))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((dlAddr == null) ? 0 : dlAddr.hashCode());
        return result;
    }

}
