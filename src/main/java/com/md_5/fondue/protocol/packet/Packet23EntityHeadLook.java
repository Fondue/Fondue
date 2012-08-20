package com.md_5.fondue.protocol.packet;

import io.netty.buffer.ByteBuf;

public class Packet23EntityHeadLook extends Packet1EEntity {

    private byte headYaw;

    public Packet23EntityHeadLook() {
    }

    @Override
    public void read(ByteBuf in) {
        super.read(in);
        headYaw = in.readByte();
    }

    @Override
    public void write(ByteBuf out) {
        super.write(out);
        out.writeByte(headYaw);
    }
}