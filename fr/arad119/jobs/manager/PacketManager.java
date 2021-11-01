package fr.arad119.jobs.manager;

import net.minecraft.server.v1_7_R4.*;
import net.minecraft.util.com.google.common.collect.*;
import fr.arad119.jobs.packets.*;
import java.lang.reflect.*;
import java.util.*;

public class PacketManager
{
    public PacketManager() {
        try {
            this.setUp();
        }
        catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchFieldException ex2) {
            final Exception ex;
            final Exception e = ex;
            e.printStackTrace();
        }
    }
    
    private void setUp() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        final Class<EnumProtocol> clazz = EnumProtocol.class;
        Field f = null;
        BiMap<Integer, Class<?>> packetsMap = null;
        f = clazz.getDeclaredField("i");
        f.setAccessible(true);
        packetsMap = (BiMap<Integer, Class<?>>)f.get(EnumProtocol.PLAY);
        packetsMap.put((Object)204, (Object)PacketClientJobs.class);
        this.setAsPlayPacket(PacketClientJobs.class);
        f = clazz.getDeclaredField("h");
        f.setAccessible(true);
        packetsMap = (BiMap<Integer, Class<?>>)f.get(EnumProtocol.PLAY);
        packetsMap.put((Object)204, (Object)PacketServerJobs.class);
        this.setAsPlayPacket(PacketServerJobs.class);
    }
    
    private void setAsPlayPacket(final Class<?> clazz) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        final Field f = EnumProtocol.class.getDeclaredField("f");
        f.setAccessible(true);
        final Map<Class<?>, EnumProtocol> map = (Map<Class<?>, EnumProtocol>)f.get(EnumProtocol.PLAY);
        map.put(clazz, EnumProtocol.PLAY);
    }
}
