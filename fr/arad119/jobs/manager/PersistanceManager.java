package fr.arad119.jobs.manager;

import fr.arad119.jobs.*;
import java.util.concurrent.*;
import fr.arad119.jobs.data.*;
import org.bukkit.*;
import org.bukkit.plugin.*;
import java.util.*;

public class PersistanceManager
{
    private final AJobs aJobs;
    private final ConcurrentHashMap<String, JSONPersistentData> jsonPersistentData;
    private int schedulerId;
    private boolean isRunning;
    private static PersistanceManager instance;
    
    public PersistanceManager(final AJobs aJobs) {
        PersistanceManager.instance = this;
        this.aJobs = aJobs;
        this.jsonPersistentData = new ConcurrentHashMap<String, JSONPersistentData>();
        this.start();
    }
    
    public void start() {
        final Iterator<JSONPersistentData> iterator;
        JSONPersistentData jsonPersistentData;
        this.schedulerId = Bukkit.getScheduler().scheduleAsyncRepeatingTask((Plugin)this.elyziumJobs, () -> {
            this.jsonPersistentData.values().iterator();
            while (iterator.hasNext()) {
                jsonPersistentData = iterator.next();
                if (jsonPersistentData.isAutoSavable()) {
                    jsonPersistentData.save(this.aJobs);
                }
            }
            return;
        }, 0L, 100L);
        this.isRunning = true;
    }
    
    private void stop() {
        Bukkit.getScheduler().cancelTask(this.schedulerId);
        this.isRunning = false;
    }
    
    public void add(final JSONPersistentData jsonPersistentObject) {
        this.jsonPersistentData.put(jsonPersistentObject.getPath(), jsonPersistentObject);
    }
    
    public void saveAll() {
        for (final JSONPersistentData value : this.jsonPersistentData.values()) {
            value.save(this.aJobs);
        }
    }
    
    public static PersistanceManager getInstance() {
        return PersistanceManager.instance;
    }
    
    public boolean isRunning() {
        return this.isRunning;
    }
    
    public ConcurrentHashMap<String, JSONPersistentData> getJsonPersistentData() {
        return this.jsonPersistentData;
    }
}
