// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver11;

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

class OFActionSetNwTosVer11 implements OFActionSetNwTos {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetNwTosVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 8;

        private final static short DEFAULT_NW_TOS = (short) 0x0;

    // OF message fields
    private final short nwTos;
//
    // Immutable default instance
    final static OFActionSetNwTosVer11 DEFAULT = new OFActionSetNwTosVer11(
        DEFAULT_NW_TOS
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetNwTosVer11(short nwTos) {
        this.nwTos = nwTos;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_TOS;
    }

    @Override
    public short getNwTos() {
        return nwTos;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    public OFActionSetNwTos.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetNwTos.Builder {
        final OFActionSetNwTosVer11 parentMessage;

        // OF message fields
        private boolean nwTosSet;
        private short nwTos;

        BuilderWithParent(OFActionSetNwTosVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_TOS;
    }

    @Override
    public short getNwTos() {
        return nwTos;
    }

    @Override
    public OFActionSetNwTos.Builder setNwTos(short nwTos) {
        this.nwTos = nwTos;
        this.nwTosSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



        @Override
        public OFActionSetNwTos build() {
                short nwTos = this.nwTosSet ? this.nwTos : parentMessage.nwTos;

                //
                return new OFActionSetNwTosVer11(
                    nwTos
                );
        }

    }

    static class Builder implements OFActionSetNwTos.Builder {
        // OF message fields
        private boolean nwTosSet;
        private short nwTos;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_NW_TOS;
    }

    @Override
    public short getNwTos() {
        return nwTos;
    }

    @Override
    public OFActionSetNwTos.Builder setNwTos(short nwTos) {
        this.nwTos = nwTos;
        this.nwTosSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

//
        @Override
        public OFActionSetNwTos build() {
            short nwTos = this.nwTosSet ? this.nwTos : DEFAULT_NW_TOS;


            return new OFActionSetNwTosVer11(
                    nwTos
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionSetNwTos> {
        @Override
        public OFActionSetNwTos readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 7
            short type = bb.readShort();
            if(type != (short) 0x7)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_NW_TOS(7), got="+type);
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
            short nwTos = U8.f(bb.readByte());
            // pad: 3 bytes
            bb.skipBytes(3);

            OFActionSetNwTosVer11 actionSetNwTosVer11 = new OFActionSetNwTosVer11(
                    nwTos
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetNwTosVer11);
            return actionSetNwTosVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetNwTosVer11Funnel FUNNEL = new OFActionSetNwTosVer11Funnel();
    static class OFActionSetNwTosVer11Funnel implements Funnel<OFActionSetNwTosVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetNwTosVer11 message, PrimitiveSink sink) {
            // fixed value property type = 7
            sink.putShort((short) 0x7);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putShort(message.nwTos);
            // skip pad (3 bytes)
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetNwTosVer11> {
        @Override
        public void write(ChannelBuffer bb, OFActionSetNwTosVer11 message) {
            // fixed value property type = 7
            bb.writeShort((short) 0x7);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeByte(U8.t(message.nwTos));
            // pad: 3 bytes
            bb.writeZero(3);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetNwTosVer11(");
        b.append("nwTos=").append(nwTos);
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
        OFActionSetNwTosVer11 other = (OFActionSetNwTosVer11) obj;

        if( nwTos != other.nwTos)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + nwTos;
        return result;
    }

}
