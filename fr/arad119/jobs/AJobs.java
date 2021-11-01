package fr.arad119.jobs;

import org.bukkit.plugin.java.*;
import fr.arad119.jobs.utils.*;
import java.io.*;
import fr.arad119.jobs.manager.*;
import fr.arad119.jobs.commands.*;
import org.bukkit.command.*;
import fr.arad119.jobs.listeners.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;

public class AJobs extends JavaPlugin
{
    private final FileUtil fileUtil;
    private final JSONUtil jsonUtil;
    private PersistanceManager persistanceManager;
    private PlayerManager playerManager;
    
    public AJobs() {
        this.fileUtil = new FileUtil();
        this.jsonUtil = new JSONUtil();
    }
    
    public void onEnable() {
        this.persistanceManager = new PersistanceManager(this);
        this.playerManager = new PlayerManager(this);
        final File userData = new File(this.getDataFolder() + "/users");
        if (!userData.exists()) {
            userData.mkdirs();
        }
        new PacketManager();
        this.getCommand("metier").setExecutor((CommandExecutor)new JobsCommands(this));
        this.getServer().getPluginManager().registerEvents((Listener)new GameListener(this), (Plugin)this);
    }
    
    public void onDisable() {
    }
    
    public FileUtil getFileUtil() {
        return this.fileUtil;
    }
    
    public JSONUtil getJsonUtil() {
        return this.jsonUtil;
    }
    
    public PlayerManager getPlayerManager() {
        return this.playerManager;
    }
}
