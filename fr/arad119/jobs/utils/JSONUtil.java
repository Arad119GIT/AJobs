package fr.arad119.jobs.utils;

import com.google.gson.*;

public class JSONUtil
{
    private final Gson gson;
    
    public JSONUtil() {
        this.gson = new Gson();
    }
    
    public String serialize(final Object object) {
        return this.gson.toJson(object);
    }
    
    public Object deserialize(final String json, final Class<?> objectClass) {
        return this.gson.fromJson(json, objectClass);
    }
}
