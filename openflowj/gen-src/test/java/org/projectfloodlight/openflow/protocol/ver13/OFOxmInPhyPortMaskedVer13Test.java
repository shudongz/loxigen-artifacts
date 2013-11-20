// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
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
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.hamcrest.CoreMatchers;



public class OFOxmInPhyPortMaskedVer13Test {
    OFOxms factory;

    final static byte[] OXM_IN_PHY_PORT_MASKED_SERIALIZED =
        new byte[] { (byte) 0x80, 0x0, 0x3, 0x8, 0x0, 0x0, 0x0, 0x2a, (byte) 0xaa, (byte) 0xbb, (byte) 0xcc, (byte) 0xdd };

    @Before
    public void setup() {
        factory = OFOxmsVer13.INSTANCE;
    }

   // FIXME: No java stanza in test_data for this class. Add for more comprehensive unit testing

   @Test
   public void testReadWrite() throws Exception {
       ChannelBuffer input = ChannelBuffers.copiedBuffer(OXM_IN_PHY_PORT_MASKED_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFOxmInPhyPortMasked oxmInPhyPortMasked = OFOxmInPhyPortMaskedVer13.READER.readFrom(input);
       assertEquals(OXM_IN_PHY_PORT_MASKED_SERIALIZED.length, input.readerIndex());

       // write message again
       ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
       oxmInPhyPortMasked.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(OXM_IN_PHY_PORT_MASKED_SERIALIZED));
   }

}
