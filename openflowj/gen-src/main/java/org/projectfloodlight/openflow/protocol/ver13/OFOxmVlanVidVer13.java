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

class OFOxmVlanVidVer13 implements OFOxmVlanVid {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmVlanVidVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 6;

        private final static OFVlanVidMatch DEFAULT_VALUE = OFVlanVidMatch.NONE;

    // OF message fields
    private final OFVlanVidMatch value;
//
    // Immutable default instance
    final static OFOxmVlanVidVer13 DEFAULT = new OFOxmVlanVidVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmVlanVidVer13(OFVlanVidMatch value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80000c02L;
    }

    @Override
    public OFVlanVidMatch getValue() {
        return value;
    }

    @Override
    public MatchField<OFVlanVidMatch> getMatchField() {
        return MatchField.VLAN_VID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<OFVlanVidMatch> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public OFVlanVidMatch getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmVlanVid.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmVlanVid.Builder {
        final OFOxmVlanVidVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFVlanVidMatch value;

        BuilderWithParent(OFOxmVlanVidVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80000c02L;
    }

    @Override
    public OFVlanVidMatch getValue() {
        return value;
    }

    @Override
    public OFOxmVlanVid.Builder setValue(OFVlanVidMatch value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFVlanVidMatch> getMatchField() {
        return MatchField.VLAN_VID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFVlanVidMatch> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVlanVidMatch getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmVlanVid build() {
                OFVlanVidMatch value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmVlanVidVer13(
                    value
                );
        }

    }

    static class Builder implements OFOxmVlanVid.Builder {
        // OF message fields
        private boolean valueSet;
        private OFVlanVidMatch value;

    @Override
    public long getTypeLen() {
        return 0x80000c02L;
    }

    @Override
    public OFVlanVidMatch getValue() {
        return value;
    }

    @Override
    public OFOxmVlanVid.Builder setValue(OFVlanVidMatch value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFVlanVidMatch> getMatchField() {
        return MatchField.VLAN_VID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFVlanVidMatch> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVlanVidMatch getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmVlanVid build() {
            OFVlanVidMatch value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmVlanVidVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmVlanVid> {
        @Override
        public OFOxmVlanVid readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x80000c02L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80000c02)
                throw new OFParseError("Wrong typeLen: Expected=0x80000c02L(0x80000c02L), got="+typeLen);
            OFVlanVidMatch value = OFVlanVidMatch.read2Bytes(bb);

            OFOxmVlanVidVer13 oxmVlanVidVer13 = new OFOxmVlanVidVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmVlanVidVer13);
            return oxmVlanVidVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmVlanVidVer13Funnel FUNNEL = new OFOxmVlanVidVer13Funnel();
    static class OFOxmVlanVidVer13Funnel implements Funnel<OFOxmVlanVidVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmVlanVidVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80000c02L
            sink.putInt((int) 0x80000c02);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmVlanVidVer13> {
        @Override
        public void write(ChannelBuffer bb, OFOxmVlanVidVer13 message) {
            // fixed value property typeLen = 0x80000c02L
            bb.writeInt((int) 0x80000c02);
            message.value.write2Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmVlanVidVer13(");
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
        OFOxmVlanVidVer13 other = (OFOxmVlanVidVer13) obj;

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
