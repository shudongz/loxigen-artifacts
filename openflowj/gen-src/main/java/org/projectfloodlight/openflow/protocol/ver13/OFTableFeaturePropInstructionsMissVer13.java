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
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFTableFeaturePropInstructionsMissVer13 implements OFTableFeaturePropInstructionsMiss {
    private static final Logger logger = LoggerFactory.getLogger(OFTableFeaturePropInstructionsMissVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 4;

        private final static List<OFInstruction> DEFAULT_INSTRUCTION_IDS = ImmutableList.<OFInstruction>of();

    // OF message fields
    private final List<OFInstruction> instructionIds;
//
    // Immutable default instance
    final static OFTableFeaturePropInstructionsMissVer13 DEFAULT = new OFTableFeaturePropInstructionsMissVer13(
        DEFAULT_INSTRUCTION_IDS
    );

    // package private constructor - used by readers, builders, and factory
    OFTableFeaturePropInstructionsMissVer13(List<OFInstruction> instructionIds) {
        this.instructionIds = instructionIds;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public List<OFInstruction> getInstructionIds() {
        return instructionIds;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFTableFeaturePropInstructionsMiss.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFTableFeaturePropInstructionsMiss.Builder {
        final OFTableFeaturePropInstructionsMissVer13 parentMessage;

        // OF message fields
        private boolean instructionIdsSet;
        private List<OFInstruction> instructionIds;

        BuilderWithParent(OFTableFeaturePropInstructionsMissVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public List<OFInstruction> getInstructionIds() {
        return instructionIds;
    }

    @Override
    public OFTableFeaturePropInstructionsMiss.Builder setInstructionIds(List<OFInstruction> instructionIds) {
        this.instructionIds = instructionIds;
        this.instructionIdsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFTableFeaturePropInstructionsMiss build() {
                List<OFInstruction> instructionIds = this.instructionIdsSet ? this.instructionIds : parentMessage.instructionIds;
                if(instructionIds == null)
                    throw new NullPointerException("Property instructionIds must not be null");

                //
                return new OFTableFeaturePropInstructionsMissVer13(
                    instructionIds
                );
        }

    }

    static class Builder implements OFTableFeaturePropInstructionsMiss.Builder {
        // OF message fields
        private boolean instructionIdsSet;
        private List<OFInstruction> instructionIds;

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public List<OFInstruction> getInstructionIds() {
        return instructionIds;
    }

    @Override
    public OFTableFeaturePropInstructionsMiss.Builder setInstructionIds(List<OFInstruction> instructionIds) {
        this.instructionIds = instructionIds;
        this.instructionIdsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFTableFeaturePropInstructionsMiss build() {
            List<OFInstruction> instructionIds = this.instructionIdsSet ? this.instructionIds : DEFAULT_INSTRUCTION_IDS;
            if(instructionIds == null)
                throw new NullPointerException("Property instructionIds must not be null");


            return new OFTableFeaturePropInstructionsMissVer13(
                    instructionIds
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFTableFeaturePropInstructionsMiss> {
        @Override
        public OFTableFeaturePropInstructionsMiss readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x1
            short type = bb.readShort();
            if(type != (short) 0x1)
                throw new OFParseError("Wrong type: Expected=0x1(0x1), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            List<OFInstruction> instructionIds = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFInstructionVer13.READER);

            OFTableFeaturePropInstructionsMissVer13 tableFeaturePropInstructionsMissVer13 = new OFTableFeaturePropInstructionsMissVer13(
                    instructionIds
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", tableFeaturePropInstructionsMissVer13);
            return tableFeaturePropInstructionsMissVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFTableFeaturePropInstructionsMissVer13Funnel FUNNEL = new OFTableFeaturePropInstructionsMissVer13Funnel();
    static class OFTableFeaturePropInstructionsMissVer13Funnel implements Funnel<OFTableFeaturePropInstructionsMissVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFTableFeaturePropInstructionsMissVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x1
            sink.putShort((short) 0x1);
            // FIXME: skip funnel of length
            FunnelUtils.putList(message.instructionIds, sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFTableFeaturePropInstructionsMissVer13> {
        @Override
        public void write(ChannelBuffer bb, OFTableFeaturePropInstructionsMissVer13 message) {
            int startIndex = bb.writerIndex();
            // fixed value property type = 0x1
            bb.writeShort((short) 0x1);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            ChannelUtils.writeList(bb, message.instructionIds);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFTableFeaturePropInstructionsMissVer13(");
        b.append("instructionIds=").append(instructionIds);
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
        OFTableFeaturePropInstructionsMissVer13 other = (OFTableFeaturePropInstructionsMissVer13) obj;

        if (instructionIds == null) {
            if (other.instructionIds != null)
                return false;
        } else if (!instructionIds.equals(other.instructionIds))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((instructionIds == null) ? 0 : instructionIds.hashCode());
        return result;
    }

}
