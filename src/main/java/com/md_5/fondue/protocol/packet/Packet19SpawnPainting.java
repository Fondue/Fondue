package com.md_5.fondue.protocol.packet;

import com.md_5.fondue.protocol.PacketHandler;
import io.netty.buffer.ByteBuf;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class Packet19SpawnPainting extends Packet1EEntity {

    private String title;
    private int x;
    private int y;
    private int z;
    private int direction;

    public Packet19SpawnPainting() {
    }

    @Override
    public void read(ByteBuf in) {
        super.write(in);
        title = readString(in);
        x = in.readInt();
        y = in.readInt();
        z = in.readInt();
        direction = in.readInt();
    }

    @Override
    public void write(ByteBuf out) {
        super.read(out);
        writeString(out, title);
        out.writeInt(x);
        out.writeInt(y);
        out.writeInt(z);
        out.writeInt(direction);
    }

    @Override
    public void handle(PacketHandler handler) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
