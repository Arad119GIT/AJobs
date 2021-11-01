package fr.arad119.jobs.utils;

import fr.arad119.jobs.*;
import org.bukkit.entity.*;
import fr.arad119.jobs.data.*;

public class Utils
{
    private final AJobs aJobs;
    
    public Utils(final AJobs AJobs) {
        this.aJobs = aJobs;
    }
    
    public int getLevelMaxIngenieur(final Player player) {
        final JobsData jobsData = this.aJobs.getPlayerManager().getJobsData(player.getName());
        switch (jobsData.getNivIngenieur()) {
            case 0: {
                return 10000;
            }
            case 1: {
                return 20000;
            }
            case 2: {
                return 35000;
            }
            case 3: {
                return 45000;
            }
            case 4: {
                return 55000;
            }
            default: {
                return 0;
            }
        }
    }
    
    public int getLevelMaxMineur(final Player player) {
        final JobsData jobsData = this.aJobs.getPlayerManager().getJobsData(player.getName());
        switch (jobsData.getNivMineur()) {
            case 0: {
                return 10000;
            }
            case 1: {
                return 20000;
            }
            case 2: {
                return 35000;
            }
            case 3: {
                return 45000;
            }
            case 4: {
                return 55000;
            }
            case 5: {
                return 75000;
            }
            case 6: {
                return 90000;
            }
            case 7: {
                return 110000;
            }
            case 8: {
                return 130000;
            }
            case 9: {
                return 150000;
            }
            case 10: {
                return 170000;
            }
            case 11: {
                return 190000;
            }
            case 12: {
                return 210000;
            }
            case 13: {
                return 230000;
            }
            case 14: {
                return 250000;
            }
            default: {
                return 0;
            }
        }
    }
    
    public int getLevelMaxAgriculteur(final Player player) {
        final JobsData jobsData = this.aJobs.getPlayerManager().getJobsData(player.getName());
        switch (jobsData.getNivAgriculteur()) {
            case 0: {
                return 10000;
            }
            case 1: {
                return 20000;
            }
            case 2: {
                return 35000;
            }
            case 3: {
                return 45000;
            }
            case 4: {
                return 55000;
            }
            case 5: {
                return 75000;
            }
            case 6: {
                return 90000;
            }
            case 7: {
                return 110000;
            }
            case 8: {
                return 130000;
            }
            case 9: {
                return 150000;
            }
            case 10: {
                return 170000;
            }
            case 11: {
                return 190000;
            }
            case 12: {
                return 210000;
            }
            case 13: {
                return 230000;
            }
            case 14: {
                return 250000;
            }
            default: {
                return 0;
            }
        }
    }
}
