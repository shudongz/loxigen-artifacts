// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFQueuePropMaxRateVer12 implements OFQueuePropMaxRate {
    private static final Logger logger = LoggerFactory.getLogger(OFQueuePropMaxRateVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 16;

        private final static int DEFAULT_RATE = 0x0;

    // OF message fields
    private final int rate;
//
    // Immutable default instance
    final static OFQueuePropMaxRateVer12 DEFAULT = new OFQueuePropMaxRateVer12(
        DEFAULT_RATE
    );

    // package private constructor - used by readers, builders, and factory
    OFQueuePropMaxRateVer12(int rate) {
        this.rate = rate;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFQueuePropMaxRate.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFQueuePropMaxRate.Builder {
        final OFQueuePropMaxRateVer12 parentMessage;

        // OF message fields
        private boolean rateSet;
        private int rate;

        BuilderWithParent(OFQueuePropMaxRateVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public OFQueuePropMaxRate.Builder setRate(int rate) {
        this.rate = rate;
        this.rateSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFQueuePropMaxRate build() {
                int rate = this.rateSet ? this.rate : parentMessage.rate;

                //
                return new OFQueuePropMaxRateVer12(
                    rate
                );
        }

    }

    static class Builder implements OFQueuePropMaxRate.Builder {
        // OF message fields
        private boolean rateSet;
        private int rate;

    @Override
    public int getType() {
        return 0x2;
    }

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public OFQueuePropMaxRate.Builder setRate(int rate) {
        this.rate = rate;
        this.rateSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFQueuePropMaxRate build() {
            int rate = this.rateSet ? this.rate : DEFAULT_RATE;


            return new OFQueuePropMaxRateVer12(
                    rate
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFQueuePropMaxRate> {
        @Override
        public OFQueuePropMaxRate readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x2
            short type = bb.readShort();
            if(type != (short) 0x2)
                throw new OFParseError("Wrong type: Expected=0x2(0x2), got="+type);
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
            // pad: 4 bytes
            bb.skipBytes(4);
            int rate = U16.f(bb.readShort());
            // pad: 6 bytes
            bb.skipBytes(6);

            OFQueuePropMaxRateVer12 queuePropMaxRateVer12 = new OFQueuePropMaxRateVer12(
                    rate
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", queuePropMaxRateVer12);
            return queuePropMaxRateVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFQueuePropMaxRateVer12Funnel FUNNEL = new OFQueuePropMaxRateVer12Funnel();
    static class OFQueuePropMaxRateVer12Funnel implements Funnel<OFQueuePropMaxRateVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFQueuePropMaxRateVer12 message, PrimitiveSink sink) {
            // fixed value property type = 0x2
            sink.putShort((short) 0x2);
            // fixed value property length = 16
            sink.putShort((short) 0x10);
            // skip pad (4 bytes)
            sink.putInt(message.rate);
            // skip pad (6 bytes)
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFQueuePropMaxRateVer12> {
        @Override
        public void write(ChannelBuffer bb, OFQueuePropMaxRateVer12 message) {
            // fixed value property type = 0x2
            bb.writeShort((short) 0x2);
            // fixed value property length = 16
            bb.writeShort((short) 0x10);
            // pad: 4 bytes
            bb.writeZero(4);
            bb.writeShort(U16.t(message.rate));
            // pad: 6 bytes
            bb.writeZero(6);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFQueuePropMaxRateVer12(");
        b.append("rate=").append(rate);
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
        OFQueuePropMaxRateVer12 other = (OFQueuePropMaxRateVer12) obj;

        if( rate != other.rate)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + rate;
        return result;
    }

}
