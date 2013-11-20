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
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionIdVer13 implements OFActionId {
    private static final Logger logger = LoggerFactory.getLogger(OFActionIdVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 8;


    // OF message fields
    private final OFActionType type;
//

    // package private constructor - used by readers, builders, and factory
    OFActionIdVer13(OFActionType type) {
        this.type = type;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return type;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFActionId.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionId.Builder {
        final OFActionIdVer13 parentMessage;

        // OF message fields
        private boolean typeSet;
        private OFActionType type;

        BuilderWithParent(OFActionIdVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return type;
    }

    @Override
    public OFActionId.Builder setType(OFActionType type) {
        this.type = type;
        this.typeSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFActionId build() {
                OFActionType type = this.typeSet ? this.type : parentMessage.type;
                if(type == null)
                    throw new NullPointerException("Property type must not be null");

                //
                return new OFActionIdVer13(
                    type
                );
        }

    }

    static class Builder implements OFActionId.Builder {
        // OF message fields
        private boolean typeSet;
        private OFActionType type;

    @Override
    public OFActionType getType() {
        return type;
    }

    @Override
    public OFActionId.Builder setType(OFActionType type) {
        this.type = type;
        this.typeSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFActionId build() {
            if(!this.typeSet)
                throw new IllegalStateException("Property type doesn't have default value -- must be set");
            if(type == null)
                throw new NullPointerException("Property type must not be null");


            return new OFActionIdVer13(
                    type
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionId> {
        @Override
        public OFActionId readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            OFActionType type = OFActionTypeSerializerVer13.readFrom(bb);
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
            // pad: 4 bytes
            bb.skipBytes(4);

            OFActionIdVer13 actionIdVer13 = new OFActionIdVer13(
                    type
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionIdVer13);
            return actionIdVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionIdVer13Funnel FUNNEL = new OFActionIdVer13Funnel();
    static class OFActionIdVer13Funnel implements Funnel<OFActionIdVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionIdVer13 message, PrimitiveSink sink) {
            OFActionTypeSerializerVer13.putTo(message.type, sink);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            // skip pad (4 bytes)
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionIdVer13> {
        @Override
        public void write(ChannelBuffer bb, OFActionIdVer13 message) {
            OFActionTypeSerializerVer13.writeTo(bb, message.type);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            // pad: 4 bytes
            bb.writeZero(4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionIdVer13(");
        b.append("type=").append(type);
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
        OFActionIdVer13 other = (OFActionIdVer13) obj;

        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

}