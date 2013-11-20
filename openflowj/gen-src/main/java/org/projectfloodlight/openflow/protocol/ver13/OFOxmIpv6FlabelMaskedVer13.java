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

class OFOxmIpv6FlabelMaskedVer13 implements OFOxmIpv6FlabelMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmIpv6FlabelMaskedVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 12;

        private final static IPv6FlowLabel DEFAULT_VALUE = IPv6FlowLabel.NONE;
        private final static IPv6FlowLabel DEFAULT_VALUE_MASK = IPv6FlowLabel.NONE;

    // OF message fields
    private final IPv6FlowLabel value;
    private final IPv6FlowLabel mask;
//
    // Immutable default instance
    final static OFOxmIpv6FlabelMaskedVer13 DEFAULT = new OFOxmIpv6FlabelMaskedVer13(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmIpv6FlabelMaskedVer13(IPv6FlowLabel value, IPv6FlowLabel mask) {
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80003908L;
    }

    @Override
    public IPv6FlowLabel getValue() {
        return value;
    }

    @Override
    public IPv6FlowLabel getMask() {
        return mask;
    }

    @Override
    public MatchField<IPv6FlowLabel> getMatchField() {
        return MatchField.IPV6_FLABEL;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<IPv6FlowLabel> getCanonical() {
        if (IPv6FlowLabel.NO_MASK.equals(mask)) {
            return new OFOxmIpv6FlabelVer13(value);
        } else if(IPv6FlowLabel.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmIpv6FlabelMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmIpv6FlabelMasked.Builder {
        final OFOxmIpv6FlabelMaskedVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IPv6FlowLabel value;
        private boolean maskSet;
        private IPv6FlowLabel mask;

        BuilderWithParent(OFOxmIpv6FlabelMaskedVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80003908L;
    }

    @Override
    public IPv6FlowLabel getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6FlabelMasked.Builder setValue(IPv6FlowLabel value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public IPv6FlowLabel getMask() {
        return mask;
    }

    @Override
    public OFOxmIpv6FlabelMasked.Builder setMask(IPv6FlowLabel mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<IPv6FlowLabel> getMatchField() {
        return MatchField.IPV6_FLABEL;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<IPv6FlowLabel> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmIpv6FlabelMasked build() {
                IPv6FlowLabel value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                IPv6FlowLabel mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmIpv6FlabelMaskedVer13(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmIpv6FlabelMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private IPv6FlowLabel value;
        private boolean maskSet;
        private IPv6FlowLabel mask;

    @Override
    public long getTypeLen() {
        return 0x80003908L;
    }

    @Override
    public IPv6FlowLabel getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6FlabelMasked.Builder setValue(IPv6FlowLabel value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public IPv6FlowLabel getMask() {
        return mask;
    }

    @Override
    public OFOxmIpv6FlabelMasked.Builder setMask(IPv6FlowLabel mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<IPv6FlowLabel> getMatchField() {
        return MatchField.IPV6_FLABEL;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<IPv6FlowLabel> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmIpv6FlabelMasked build() {
            IPv6FlowLabel value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            IPv6FlowLabel mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmIpv6FlabelMaskedVer13(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmIpv6FlabelMasked> {
        @Override
        public OFOxmIpv6FlabelMasked readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x80003908L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80003908)
                throw new OFParseError("Wrong typeLen: Expected=0x80003908L(0x80003908L), got="+typeLen);
            IPv6FlowLabel value = IPv6FlowLabel.read4Bytes(bb);
            IPv6FlowLabel mask = IPv6FlowLabel.read4Bytes(bb);

            OFOxmIpv6FlabelMaskedVer13 oxmIpv6FlabelMaskedVer13 = new OFOxmIpv6FlabelMaskedVer13(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmIpv6FlabelMaskedVer13);
            return oxmIpv6FlabelMaskedVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmIpv6FlabelMaskedVer13Funnel FUNNEL = new OFOxmIpv6FlabelMaskedVer13Funnel();
    static class OFOxmIpv6FlabelMaskedVer13Funnel implements Funnel<OFOxmIpv6FlabelMaskedVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmIpv6FlabelMaskedVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80003908L
            sink.putInt((int) 0x80003908);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmIpv6FlabelMaskedVer13> {
        @Override
        public void write(ChannelBuffer bb, OFOxmIpv6FlabelMaskedVer13 message) {
            // fixed value property typeLen = 0x80003908L
            bb.writeInt((int) 0x80003908);
            message.value.write4Bytes(bb);
            message.mask.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmIpv6FlabelMaskedVer13(");
        b.append("value=").append(value);
        b.append(", ");
        b.append("mask=").append(mask);
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
        OFOxmIpv6FlabelMaskedVer13 other = (OFOxmIpv6FlabelMaskedVer13) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        return result;
    }

}
