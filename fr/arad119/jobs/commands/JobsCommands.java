package fr.arad119.jobs.commands;

import fr.arad119.jobs.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_7_R4.entity.*;
import fr.arad119.jobs.packets.*;
import net.minecraft.server.v1_7_R4.*;

public class JobsCommands implements CommandExecutor
{
    private final AJobs aJobs;
    
    public JobsCommands(final ElyziumJobs elyziumJobs) {
        this.aJobs = aJobs;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String msg, final String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        final Player player = (Player)sender;
        if (args.length < 2) {
            player.sendMessage("§c§lSyntaxe incorrect : /metier info {nom}");
            return false;
        }
        if (!args[1].equalsIgnoreCase("Agriculteur") && !args[1].equalsIgnoreCase("Mineur") && !args[1].equalsIgnoreCase("Ingenieur")) {
            player.sendMessage("§c§lErreur, le m\u00e9tier choisi n'existe pas.");
            return false;
        }
        final PlayerConnection connection = ((CraftPlayer)player).getHandle().playerConnection;
        connection.sendPacket((Packet)new PacketClientJobs(player, this.aJobs, args[1]));
        return false;
    }
}
