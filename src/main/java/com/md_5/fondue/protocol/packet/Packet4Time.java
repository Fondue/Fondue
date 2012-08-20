package com.md_5.fondue.protocol.packet;

import io.netty.buffer.ByteBuf;

public class Packet4Time extends Packet {

    private long time;

    public Packet4Time() {
    }

    @Override
    public void read(ByteBuf in) {
        time = in.readLong();
    }

    @Override
    public void write(ByteBuf out) {
        out.writeLong(time);
    }
}
