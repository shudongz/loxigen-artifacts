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
import com.google.common.collect.ImmutableSet;
import java.util.List;
import com.google.common.collect.ImmutableList;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFFeaturesReplyVer12 implements OFFeaturesReply {
    private static final Logger logger = LoggerFactory.getLogger(OFFeaturesReplyVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int MINIMUM_LENGTH = 32;

        private final static long DEFAULT_XID = 0x0L;
        private final static DatapathId DEFAULT_DATAPATH_ID = DatapathId.NONE;
        private final static long DEFAULT_N_BUFFERS = 0x0L;
        private final static short DEFAULT_N_TABLES = (short) 0x0;
        private final static Set<OFCapabilities> DEFAULT_CAPABILITIES = ImmutableSet.<OFCapabilities>of();
        private final static long DEFAULT_RESERVED = 0x0L;
        private final static List<OFPortDesc> DEFAULT_PORTS = ImmutableList.<OFPortDesc>of();

    // OF message fields
    private final long xid;
    private final DatapathId datapathId;
    private final long nBuffers;
    private final short nTables;
    private final Set<OFCapabilities> capabilities;
    private final long reserved;
    private final List<OFPortDesc> ports;
//
    // Immutable default instance
    final static OFFeaturesReplyVer12 DEFAULT = new OFFeaturesReplyVer12(
        DEFAULT_XID, DEFAULT_DATAPATH_ID, DEFAULT_N_BUFFERS, DEFAULT_N_TABLES, DEFAULT_CAPABILITIES, DEFAULT_RESERVED, DEFAULT_PORTS
    );

    // package private constructor - used by readers, builders, and factory
    OFFeaturesReplyVer12(long xid, DatapathId datapathId, long nBuffers, short nTables, Set<OFCapabilities> capabilities, long reserved, List<OFPortDesc> ports) {
        this.xid = xid;
        this.datapathId = datapathId;
        this.nBuffers = nBuffers;
        this.nTables = nTables;
        this.capabilities = capabilities;
        this.reserved = reserved;
        this.ports = ports;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.FEATURES_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public DatapathId getDatapathId() {
        return datapathId;
    }

    @Override
    public long getNBuffers() {
        return nBuffers;
    }

    @Override
    public short getNTables() {
        return nTables;
    }

    @Override
    public Set<OFCapabilities> getCapabilities() {
        return capabilities;
    }

    @Override
    public long getReserved() {
        return reserved;
    }

    @Override
    public List<OFPortDesc> getPorts() {
        return ports;
    }

    @Override
    public Set<OFActionType> getActions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property actions not supported in version 1.2");
    }

    @Override
    public short getAuxiliaryId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property auxiliaryId not supported in version 1.2");
    }



    public OFFeaturesReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFFeaturesReply.Builder {
        final OFFeaturesReplyVer12 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean datapathIdSet;
        private DatapathId datapathId;
        private boolean nBuffersSet;
        private long nBuffers;
        private boolean nTablesSet;
        private short nTables;
        private boolean capabilitiesSet;
        private Set<OFCapabilities> capabilities;
        private boolean reservedSet;
        private long reserved;
        private boolean portsSet;
        private List<OFPortDesc> ports;

        BuilderWithParent(OFFeaturesReplyVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.FEATURES_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFFeaturesReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public DatapathId getDatapathId() {
        return datapathId;
    }

    @Override
    public OFFeaturesReply.Builder setDatapathId(DatapathId datapathId) {
        this.datapathId = datapathId;
        this.datapathIdSet = true;
        return this;
    }
    @Override
    public long getNBuffers() {
        return nBuffers;
    }

    @Override
    public OFFeaturesReply.Builder setNBuffers(long nBuffers) {
        this.nBuffers = nBuffers;
        this.nBuffersSet = true;
        return this;
    }
    @Override
    public short getNTables() {
        return nTables;
    }

    @Override
    public OFFeaturesReply.Builder setNTables(short nTables) {
        this.nTables = nTables;
        this.nTablesSet = true;
        return this;
    }
    @Override
    public Set<OFCapabilities> getCapabilities() {
        return capabilities;
    }

    @Override
    public OFFeaturesReply.Builder setCapabilities(Set<OFCapabilities> capabilities) {
        this.capabilities = capabilities;
        this.capabilitiesSet = true;
        return this;
    }
    @Override
    public long getReserved() {
        return reserved;
    }

    @Override
    public OFFeaturesReply.Builder setReserved(long reserved) {
        this.reserved = reserved;
        this.reservedSet = true;
        return this;
    }
    @Override
    public List<OFPortDesc> getPorts() {
        return ports;
    }

    @Override
    public OFFeaturesReply.Builder setPorts(List<OFPortDesc> ports) {
        this.ports = ports;
        this.portsSet = true;
        return this;
    }
    @Override
    public Set<OFActionType> getActions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property actions not supported in version 1.2");
    }

    @Override
    public OFFeaturesReply.Builder setActions(Set<OFActionType> actions) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property actions not supported in version 1.2");
    }
    @Override
    public short getAuxiliaryId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property auxiliaryId not supported in version 1.2");
    }

    @Override
    public OFFeaturesReply.Builder setAuxiliaryId(short auxiliaryId) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property auxiliaryId not supported in version 1.2");
    }


        @Override
        public OFFeaturesReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                DatapathId datapathId = this.datapathIdSet ? this.datapathId : parentMessage.datapathId;
                if(datapathId == null)
                    throw new NullPointerException("Property datapathId must not be null");
                long nBuffers = this.nBuffersSet ? this.nBuffers : parentMessage.nBuffers;
                short nTables = this.nTablesSet ? this.nTables : parentMessage.nTables;
                Set<OFCapabilities> capabilities = this.capabilitiesSet ? this.capabilities : parentMessage.capabilities;
                if(capabilities == null)
                    throw new NullPointerException("Property capabilities must not be null");
                long reserved = this.reservedSet ? this.reserved : parentMessage.reserved;
                List<OFPortDesc> ports = this.portsSet ? this.ports : parentMessage.ports;
                if(ports == null)
                    throw new NullPointerException("Property ports must not be null");

                //
                return new OFFeaturesReplyVer12(
                    xid,
                    datapathId,
                    nBuffers,
                    nTables,
                    capabilities,
                    reserved,
                    ports
                );
        }

    }

    static class Builder implements OFFeaturesReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean datapathIdSet;
        private DatapathId datapathId;
        private boolean nBuffersSet;
        private long nBuffers;
        private boolean nTablesSet;
        private short nTables;
        private boolean capabilitiesSet;
        private Set<OFCapabilities> capabilities;
        private boolean reservedSet;
        private long reserved;
        private boolean portsSet;
        private List<OFPortDesc> ports;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.FEATURES_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFFeaturesReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public DatapathId getDatapathId() {
        return datapathId;
    }

    @Override
    public OFFeaturesReply.Builder setDatapathId(DatapathId datapathId) {
        this.datapathId = datapathId;
        this.datapathIdSet = true;
        return this;
    }
    @Override
    public long getNBuffers() {
        return nBuffers;
    }

    @Override
    public OFFeaturesReply.Builder setNBuffers(long nBuffers) {
        this.nBuffers = nBuffers;
        this.nBuffersSet = true;
        return this;
    }
    @Override
    public short getNTables() {
        return nTables;
    }

    @Override
    public OFFeaturesReply.Builder setNTables(short nTables) {
        this.nTables = nTables;
        this.nTablesSet = true;
        return this;
    }
    @Override
    public Set<OFCapabilities> getCapabilities() {
        return capabilities;
    }

    @Override
    public OFFeaturesReply.Builder setCapabilities(Set<OFCapabilities> capabilities) {
        this.capabilities = capabilities;
        this.capabilitiesSet = true;
        return this;
    }
    @Override
    public long getReserved() {
        return reserved;
    }

    @Override
    public OFFeaturesReply.Builder setReserved(long reserved) {
        this.reserved = reserved;
        this.reservedSet = true;
        return this;
    }
    @Override
    public List<OFPortDesc> getPorts() {
        return ports;
    }

    @Override
    public OFFeaturesReply.Builder setPorts(List<OFPortDesc> ports) {
        this.ports = ports;
        this.portsSet = true;
        return this;
    }
    @Override
    public Set<OFActionType> getActions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property actions not supported in version 1.2");
    }

    @Override
    public OFFeaturesReply.Builder setActions(Set<OFActionType> actions) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property actions not supported in version 1.2");
    }
    @Override
    public short getAuxiliaryId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property auxiliaryId not supported in version 1.2");
    }

    @Override
    public OFFeaturesReply.Builder setAuxiliaryId(short auxiliaryId) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property auxiliaryId not supported in version 1.2");
    }
//
        @Override
        public OFFeaturesReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            DatapathId datapathId = this.datapathIdSet ? this.datapathId : DEFAULT_DATAPATH_ID;
            if(datapathId == null)
                throw new NullPointerException("Property datapathId must not be null");
            long nBuffers = this.nBuffersSet ? this.nBuffers : DEFAULT_N_BUFFERS;
            short nTables = this.nTablesSet ? this.nTables : DEFAULT_N_TABLES;
            Set<OFCapabilities> capabilities = this.capabilitiesSet ? this.capabilities : DEFAULT_CAPABILITIES;
            if(capabilities == null)
                throw new NullPointerException("Property capabilities must not be null");
            long reserved = this.reservedSet ? this.reserved : DEFAULT_RESERVED;
            List<OFPortDesc> ports = this.portsSet ? this.ports : DEFAULT_PORTS;
            if(ports == null)
                throw new NullPointerException("Property ports must not be null");


            return new OFFeaturesReplyVer12(
                    xid,
                    datapathId,
                    nBuffers,
                    nTables,
                    capabilities,
                    reserved,
                    ports
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFFeaturesReply> {
        @Override
        public OFFeaturesReply readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 3
            byte version = bb.readByte();
            if(version != (byte) 0x3)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_12(3), got="+version);
            // fixed value property type == 6
            byte type = bb.readByte();
            if(type != (byte) 0x6)
                throw new OFParseError("Wrong type: Expected=OFType.FEATURES_REPLY(6), got="+type);
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
            long xid = U32.f(bb.readInt());
            DatapathId datapathId = DatapathId.of(bb.readLong());
            long nBuffers = U32.f(bb.readInt());
            short nTables = U8.f(bb.readByte());
            // pad: 3 bytes
            bb.skipBytes(3);
            Set<OFCapabilities> capabilities = OFCapabilitiesSerializerVer12.readFrom(bb);
            long reserved = U32.f(bb.readInt());
            List<OFPortDesc> ports = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFPortDescVer12.READER);

            OFFeaturesReplyVer12 featuresReplyVer12 = new OFFeaturesReplyVer12(
                    xid,
                      datapathId,
                      nBuffers,
                      nTables,
                      capabilities,
                      reserved,
                      ports
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", featuresReplyVer12);
            return featuresReplyVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFFeaturesReplyVer12Funnel FUNNEL = new OFFeaturesReplyVer12Funnel();
    static class OFFeaturesReplyVer12Funnel implements Funnel<OFFeaturesReplyVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFFeaturesReplyVer12 message, PrimitiveSink sink) {
            // fixed value property version = 3
            sink.putByte((byte) 0x3);
            // fixed value property type = 6
            sink.putByte((byte) 0x6);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            message.datapathId.putTo(sink);
            sink.putLong(message.nBuffers);
            sink.putShort(message.nTables);
            // skip pad (3 bytes)
            OFCapabilitiesSerializerVer12.putTo(message.capabilities, sink);
            sink.putLong(message.reserved);
            FunnelUtils.putList(message.ports, sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFFeaturesReplyVer12> {
        @Override
        public void write(ChannelBuffer bb, OFFeaturesReplyVer12 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 3
            bb.writeByte((byte) 0x3);
            // fixed value property type = 6
            bb.writeByte((byte) 0x6);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            bb.writeLong(message.datapathId.getLong());
            bb.writeInt(U32.t(message.nBuffers));
            bb.writeByte(U8.t(message.nTables));
            // pad: 3 bytes
            bb.writeZero(3);
            OFCapabilitiesSerializerVer12.writeTo(bb, message.capabilities);
            bb.writeInt(U32.t(message.reserved));
            ChannelUtils.writeList(bb, message.ports);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFFeaturesReplyVer12(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("datapathId=").append(datapathId);
        b.append(", ");
        b.append("nBuffers=").append(nBuffers);
        b.append(", ");
        b.append("nTables=").append(nTables);
        b.append(", ");
        b.append("capabilities=").append(capabilities);
        b.append(", ");
        b.append("reserved=").append(reserved);
        b.append(", ");
        b.append("ports=").append(ports);
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
        OFFeaturesReplyVer12 other = (OFFeaturesReplyVer12) obj;

        if( xid != other.xid)
            return false;
        if (datapathId == null) {
            if (other.datapathId != null)
                return false;
        } else if (!datapathId.equals(other.datapathId))
            return false;
        if( nBuffers != other.nBuffers)
            return false;
        if( nTables != other.nTables)
            return false;
        if (capabilities == null) {
            if (other.capabilities != null)
                return false;
        } else if (!capabilities.equals(other.capabilities))
            return false;
        if( reserved != other.reserved)
            return false;
        if (ports == null) {
            if (other.ports != null)
                return false;
        } else if (!ports.equals(other.ports))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((datapathId == null) ? 0 : datapathId.hashCode());
        result = prime *  (int) (nBuffers ^ (nBuffers >>> 32));
        result = prime * result + nTables;
        result = prime * result + ((capabilities == null) ? 0 : capabilities.hashCode());
        result = prime *  (int) (reserved ^ (reserved >>> 32));
        result = prime * result + ((ports == null) ? 0 : ports.hashCode());
        return result;
    }

}
