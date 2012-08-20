package com.md_5.fondue.protocol.packet;

import io.netty.buffer.ByteBuf;

public class PacketEDig extends Packet {

    private byte status;
    private int x;
    private byte y;
    private int z;
    private byte face;

    public PacketEDig() {
    }

    @Override
    public void read(ByteBuf in) {
        status = in.readByte();
        x = in.readInt();
        y = in.readByte();
        z = in.readInt();
        face = in.readByte();
    }

    @Override
    public void write(ByteBuf out) {
        out.writeByte(status);
        out.writeInt(x);
        out.writeByte(y);
        out.writeInt(z);
        out.writeByte(face);
    }
}