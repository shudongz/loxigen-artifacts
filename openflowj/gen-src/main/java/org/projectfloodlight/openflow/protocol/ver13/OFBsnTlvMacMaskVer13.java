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
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnTlvMacMaskVer13 implements OFBsnTlvMacMask {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvMacMaskVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 10;

        private final static MacAddress DEFAULT_VALUE = MacAddress.NONE;

    // OF message fields
    private final MacAddress value;
//
    // Immutable default instance
    final static OFBsnTlvMacMaskVer13 DEFAULT = new OFBsnTlvMacMaskVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvMacMaskVer13(MacAddress value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x38;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnTlvMacMask.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvMacMask.Builder {
        final OFBsnTlvMacMaskVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private MacAddress value;

        BuilderWithParent(OFBsnTlvMacMaskVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x38;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFBsnTlvMacMask.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnTlvMacMask build() {
                MacAddress value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvMacMaskVer13(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvMacMask.Builder {
        // OF message fields
        private boolean valueSet;
        private MacAddress value;

    @Override
    public int getType() {
        return 0x38;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFBsnTlvMacMask.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFBsnTlvMacMask build() {
            MacAddress value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvMacMaskVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvMacMask> {
        @Override
        public OFBsnTlvMacMask readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x38
            short type = bb.readShort();
            if(type != (short) 0x38)
                throw new OFParseError("Wrong type: Expected=0x38(0x38), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 10)
                throw new OFParseError("Wrong length: Expected=10(10), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            MacAddress value = MacAddress.read6Bytes(bb);

            OFBsnTlvMacMaskVer13 bsnTlvMacMaskVer13 = new OFBsnTlvMacMaskVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvMacMaskVer13);
            return bsnTlvMacMaskVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvMacMaskVer13Funnel FUNNEL = new OFBsnTlvMacMaskVer13Funnel();
    static class OFBsnTlvMacMaskVer13Funnel implements Funnel<OFBsnTlvMacMaskVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvMacMaskVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x38
            sink.putShort((short) 0x38);
            // fixed value property length = 10
            sink.putShort((short) 0xa);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvMacMaskVer13> {
        @Override
        public void write(ChannelBuffer bb, OFBsnTlvMacMaskVer13 message) {
            // fixed value property type = 0x38
            bb.writeShort((short) 0x38);
            // fixed value property length = 10
            bb.writeShort((short) 0xa);
            message.value.write6Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvMacMaskVer13(");
        b.append("value=").append(value);
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
        OFBsnTlvMacMaskVer13 other = (OFBsnTlvMacMaskVer13) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
