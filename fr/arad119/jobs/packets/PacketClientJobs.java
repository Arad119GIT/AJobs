package fr.arad119.jobs.packets;

import org.bukkit.entity.*;
import fr.arad119.jobs.*;
import java.io.*;
import fr.arad119.jobs.utils.*;
import fr.arad119.jobs.data.*;
import net.minecraft.server.v1_7_R4.*;

public class PacketClientJobs extends Packet
{
    private Player playerName;
    private final AJobs aJobs;
    private String guiName;
    
    public PacketClientJobs(final Player playerName, final AJobs aJobs, final String guiName) {
        this.playerName = playerName;
        this.aJobs = aJobs;
        this.guiName = guiName;
    }
    
    public void a(final PacketDataSerializer packetDataSerializer) throws IOException {
    }
    
    public void b(final PacketDataSerializer packetDataSerializer) throws IOException {
        final JobsData jobsData = this.elyziumJobs.getPlayerManager().getJobsData(this.playerName.getName());
        final Utils utils = new Utils(this.elyziumJobs);
        final double xpJobs = this.guiName.equals("Agriculteur") ? jobsData.getLvlAgriculteur() : (this.guiName.equals("Mineur") ? jobsData.getLvlMineur() : (this.guiName.equals("Ingenieur") ? jobsData.getLvlIngenieur() : 0.0));
        final int nivJobs = this.guiName.equals("Agriculteur") ? jobsData.getNivAgriculteur() : (this.guiName.equals("Mineur") ? jobsData.getNivMineur() : (this.guiName.equals("Ingenieur") ? jobsData.getNivIngenieur() : 0));
        final int levelMax = this.guiName.equals("Agriculteur") ? utils.getLevelMaxAgriculteur(this.playerName) : (this.guiName.equals("Mineur") ? utils.getLevelMaxMineur(this.playerName) : (this.guiName.equals("Ingenieur") ? utils.getLevelMaxIngenieur(this.playerName) : 0));
        packetDataSerializer.a(this.guiName);
        packetDataSerializer.writeDouble(xpJobs);
        packetDataSerializer.writeInt(nivJobs);
        packetDataSerializer.writeInt(levelMax);
    }
    
    public void handle(final PacketListener packetListener) {
    }
}
