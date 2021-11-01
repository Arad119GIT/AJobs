package fr.arad119.jobs.packets;

import java.io.*;
import net.minecraft.server.v1_7_R4.*;

public class PacketServerJobs extends Packet
{
    private String guiName;
    private double xpJobs;
    private int nivJobs;
    private int levelMax;
    
    public void a(final PacketDataSerializer packetDataSerializer) throws IOException {
    }
    
    public void b(final PacketDataSerializer packetDataSerializer) throws IOException {
        this.guiName = packetDataSerializer.c(32333);
        this.xpJobs = packetDataSerializer.readDouble();
        this.nivJobs = packetDataSerializer.readInt();
        this.levelMax = packetDataSerializer.readInt();
    }
    
    public void handle(final PacketListener packetListener) {
    }
}
