package fr.arad119.jobs.manager;

import fr.arad119.jobs.*;
import fr.arad119.jobs.data.*;
import java.io.*;
import java.util.*;

public class PlayerManager
{
    private final AJobs aJobs;
    private final Map<String, JobsData> cache;
    
    public PlayerManager(final AJobs aJobs) {
        this.aJobs = aJobs;
        this.cache = new HashMap<String, JobsData>();
        this.loadCache();
    }
    
    public void loadCache() {
        for (final File file : this.aJobs.getFileUtil().getFilesOfDirectory(this.aJobs.getDataFolder() + "/users/")) {
            final String json = this.aJobs.getFileUtil().getFileContent(file);
            final JobsData jobsData = (JobsData)this.elyziumJobs.getJsonUtil().deserialize(json, JobsData.class);
            this.cache.put(jobsData.getName(), jobsData);
        }
    }
    
    public JobsData getJobsData(final String playerName) {
        return this.cache.get(playerName);
    }
    
    public void registerPlayer(final String name, final int nivAgriculteur, final int nivMineur, final int nivIngenieur, final double lvlAgriculteur, final double lvlMineur, final double lvlIngenieur) {
        final JobsData jobsData = new JobsData(name, nivAgriculteur, nivMineur, nivIngenieur, lvlAgriculteur, lvlMineur, lvlIngenieur);
        jobsData.save(this.aJobs);
        this.cache.put(jobsData.getName(), jobsData);
    }
    
    public boolean cacheContains(final String playerName) {
        return this.cache.containsKey(playerName);
    }
}
