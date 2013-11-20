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

class OFMeterBandDropVer13 implements OFMeterBandDrop {
    private static final Logger logger = LoggerFactory.getLogger(OFMeterBandDropVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 16;

        private final static long DEFAULT_RATE = 0x0L;
        private final static long DEFAULT_BURST_SIZE = 0x0L;

    // OF message fields
    private final long rate;
    private final long burstSize;
//
    // Immutable default instance
    final static OFMeterBandDropVer13 DEFAULT = new OFMeterBandDropVer13(
        DEFAULT_RATE, DEFAULT_BURST_SIZE
    );

    // package private constructor - used by readers, builders, and factory
    OFMeterBandDropVer13(long rate, long burstSize) {
        this.rate = rate;
        this.burstSize = burstSize;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public long getRate() {
        return rate;
    }

    @Override
    public long getBurstSize() {
        return burstSize;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFMeterBandDrop.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFMeterBandDrop.Builder {
        final OFMeterBandDropVer13 parentMessage;

        // OF message fields
        private boolean rateSet;
        private long rate;
        private boolean burstSizeSet;
        private long burstSize;

        BuilderWithParent(OFMeterBandDropVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public long getRate() {
        return rate;
    }

    @Override
    public OFMeterBandDrop.Builder setRate(long rate) {
        this.rate = rate;
        this.rateSet = true;
        return this;
    }
    @Override
    public long getBurstSize() {
        return burstSize;
    }

    @Override
    public OFMeterBandDrop.Builder setBurstSize(long burstSize) {
        this.burstSize = burstSize;
        this.burstSizeSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFMeterBandDrop build() {
                long rate = this.rateSet ? this.rate : parentMessage.rate;
                long burstSize = this.burstSizeSet ? this.burstSize : parentMessage.burstSize;

                //
                return new OFMeterBandDropVer13(
                    rate,
                    burstSize
                );
        }

    }

    static class Builder implements OFMeterBandDrop.Builder {
        // OF message fields
        private boolean rateSet;
        private long rate;
        private boolean burstSizeSet;
        private long burstSize;

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public long getRate() {
        return rate;
    }

    @Override
    public OFMeterBandDrop.Builder setRate(long rate) {
        this.rate = rate;
        this.rateSet = true;
        return this;
    }
    @Override
    public long getBurstSize() {
        return burstSize;
    }

    @Override
    public OFMeterBandDrop.Builder setBurstSize(long burstSize) {
        this.burstSize = burstSize;
        this.burstSizeSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFMeterBandDrop build() {
            long rate = this.rateSet ? this.rate : DEFAULT_RATE;
            long burstSize = this.burstSizeSet ? this.burstSize : DEFAULT_BURST_SIZE;


            return new OFMeterBandDropVer13(
                    rate,
                    burstSize
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFMeterBandDrop> {
        @Override
        public OFMeterBandDrop readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x1
            short type = bb.readShort();
            if(type != (short) 0x1)
                throw new OFParseError("Wrong type: Expected=0x1(0x1), got="+type);
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
            long rate = U32.f(bb.readInt());
            long burstSize = U32.f(bb.readInt());
            // pad: 4 bytes
            bb.skipBytes(4);

            OFMeterBandDropVer13 meterBandDropVer13 = new OFMeterBandDropVer13(
                    rate,
                      burstSize
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", meterBandDropVer13);
            return meterBandDropVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFMeterBandDropVer13Funnel FUNNEL = new OFMeterBandDropVer13Funnel();
    static class OFMeterBandDropVer13Funnel implements Funnel<OFMeterBandDropVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFMeterBandDropVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x1
            sink.putShort((short) 0x1);
            // fixed value property length = 16
            sink.putShort((short) 0x10);
            sink.putLong(message.rate);
            sink.putLong(message.burstSize);
            // skip pad (4 bytes)
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFMeterBandDropVer13> {
        @Override
        public void write(ChannelBuffer bb, OFMeterBandDropVer13 message) {
            // fixed value property type = 0x1
            bb.writeShort((short) 0x1);
            // fixed value property length = 16
            bb.writeShort((short) 0x10);
            bb.writeInt(U32.t(message.rate));
            bb.writeInt(U32.t(message.burstSize));
            // pad: 4 bytes
            bb.writeZero(4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFMeterBandDropVer13(");
        b.append("rate=").append(rate);
        b.append(", ");
        b.append("burstSize=").append(burstSize);
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
        OFMeterBandDropVer13 other = (OFMeterBandDropVer13) obj;

        if( rate != other.rate)
            return false;
        if( burstSize != other.burstSize)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (rate ^ (rate >>> 32));
        result = prime *  (int) (burstSize ^ (burstSize >>> 32));
        return result;
    }

}
