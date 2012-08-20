package com.md_5.fondue.protocol.packet;

import io.netty.buffer.ByteBuf;

public class Packet65CloseWindow extends Packet {

    private byte windowId;

    public Packet65CloseWindow() {
    }

    @Override
    public void read(ByteBuf in) {
        windowId = in.readByte();
    }

    @Override
    public void write(ByteBuf out) {
        out.writeByte(windowId);
    }
}