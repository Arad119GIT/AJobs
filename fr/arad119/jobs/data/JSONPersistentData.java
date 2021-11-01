package fr.arad119.jobs.data;

import fr.arad119.jobs.manager.*;
import fr.arad119.jobs.*;
import java.io.*;

public abstract class JSONPersistentData
{
    private final String path;
    
    public JSONPersistentData(final String path) {
        this.path = path;
        PersistanceManager.getInstance().add(this);
    }
    
    public void save(final AJobs aJobs) {
        final File file = aJobs.getFileUtil().createFile(aJobs.getDataFolder() + this.path, "json");
        final String json = aJobs.getJsonUtil().serialize(this);
        aJobs.getFileUtil().setFileContent(file, json);
    }
    
    public String getPath() {
        return this.path;
    }
    
    public boolean isAutoSavable() {
        return false;
    }
}
