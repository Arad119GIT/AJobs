package fr.arad119.jobs.listeners;

import fr.arad119.jobs.*;
import org.bukkit.block.*;
import org.bukkit.entity.*;
import fr.arad119.jobs.utils.*;
import org.bukkit.*;
import fr.arad119.jobs.data.*;
import org.bukkit.event.*;
import org.bukkit.event.player.*;
import org.bukkit.inventory.*;
import org.bukkit.event.inventory.*;
import org.bukkit.event.block.*;

public class GameListener implements Listener
{
    private final AJobs aJobs;
    
    public GameListener(final AJobs aJobs) {
        this.aJobs = aJobs;
    }
    
    public void blockAgri(final Block block, final Player player) {
        final JobsData jobsData = this.aJobs.getPlayerManager().getJobsData(player.getName());
        final Utils utils = new Utils(this.aJobs);
        if (block.getType() == Material.CROPS || block.getType() == Material.CARROT || (block.getType() == Material.POTATO && block.getData() == 7) || (block.getType() == Material.COCOA && block.getData() == 10) || block.getType() == Material.PUMPKIN || block.getType() == Material.MELON_BLOCK) {
            switch (block.getType()) {
                case COCOA:
                case CARROT:
                case CROPS:
                case POTATO:
                case MELON_BLOCK:
                case PUMPKIN:
                case UNIVERSAL_PLANT_BLOCK:
                case RED_SWEET_BERRY_BLOCK:
                case ORANGE_SWEET_BERRY_BLOCK:
                case BLUE_SWEET_BERRY_BLOCK: {
                    jobsData.setLvlAgriculteur(jobsData.getLvlAgriculteur() + 1.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§f[§bJobs§f] §c+1 level Agriculteur ! §f(§c" + jobsData.getLvlAgriculteur() + "/" + utils.getLevelMaxAgriculteur(player) + "§f)");
                    break;
                }
            }
            switch ((int)jobsData.getLvlAgriculteur()) {
                case 10000: {
                    jobsData.setNivAgriculteur(1);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§f§l[§b§lAnnonce§f§l] §a§lFélicitations ! §b§lVous venez de passer §c§lniveau 1 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 20000: {
                    jobsData.setNivAgriculteur(2);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 2 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 35000: {
                    jobsData.setNivAgriculteur(3);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 3 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 45000: {
                    jobsData.setNivAgriculteur(4);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 4 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 55000: {
                    jobsData.setNivAgriculteur(5);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 5 §b§lpour le job §c§lAgriculteur §b§l!");
                    player.sendMessage("§7§l[§b§lJobs§7§l] §b§lVous venez de d\u00e9bloquer de nouvelles fonctions ! Renseignez vous via le /jobs info");
                    break;
                }
                case 75000: {
                    jobsData.setNivAgriculteur(6);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 6 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 90000: {
                    jobsData.setNivAgriculteur(7);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 7 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 110000: {
                    jobsData.setNivAgriculteur(8);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 8 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 130000: {
                    jobsData.setNivAgriculteur(9);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 9 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 150000: {
                    jobsData.setNivAgriculteur(10);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 10 §b§lpour le job §c§lAgriculteur §b§l!");
                    player.sendMessage("§7§l[§b§lJobs§7§l] §b§lVous venez de d\u00e9bloquer de nouvelles fonctions ! Renseignez vous via le /metier info");
                    break;
                }
                case 170000: {
                    jobsData.setNivAgriculteur(11);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 11 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 190000: {
                    jobsData.setNivAgriculteur(12);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 12 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 210000: {
                    jobsData.setNivAgriculteur(13);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 13 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 230000: {
                    jobsData.setNivAgriculteur(14);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 14 §b§lpour le job §c§lAgriculteur §b§l!");
                    break;
                }
                case 250000: {
                    jobsData.setNivAgriculteur(15);
                    jobsData.setLvlAgriculteur(0.0);
                    jobsData.save(this.aJobs);
                    player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 15 §b§lpour le job §c§lAgriculteur §b§l!");
                    player.sendMessage("§7§l[§b§lJobs§7§l] §b§lVous venez de d\u00e9bloquer de nouvelles fonctions ! Renseignez vous via le /metier info");
                    break;
                }
            }
        }
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        if (!this.aJobs.getPlayerManager().cacheContains(player.getName())) {
            this.aJobs.getPlayerManager().registerPlayer(player.getName(), 0, 0, 0, 0.0, 0.0, 0.0);
        }
    }
    
    @EventHandler
    public void onQuit(final PlayerQuitEvent event) {
        final Player player = event.getPlayer();
        this.aJobs.getPlayerManager().getJobsData(player.getName()).save(this.elyziumJobs);
    }
    
    @EventHandler
    public void onItemInventory(final PlayerInteractEvent event) {
        final Player player = event.getPlayer();
        final ItemStack itemStack = player.getInventory().getItemInHand();
        final JobsData jobsData = this.aJobs.getPlayerManager().getJobsData(player.getName());
        if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {
            return;
        }
        if (itemStack.getType() == Material.FARMTOOL_1 && jobsData.getNivAgriculteur() < 5) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 5 pour pouvoir utiliser cet item !");
        }
        if (itemStack.getType() == Material.ACCELERATOR || (itemStack.getType() == Material.FARMTOOL_2 && jobsData.getNivAgriculteur() < 10)) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 10 pour pouvoir utiliser cet item !");
        }
        if (itemStack.getType() == Material.FARMTOOL_3 && jobsData.getNivAgriculteur() < 15) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 15 pour pouvoir utiliser cet item !");
        }
        if (itemStack.getType() == Material.HAMMER && jobsData.getNivMineur() < 3) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 3 pour pouvoir utiliser cet item !");
        }
        if (itemStack.getType() == Material.COIN_GENERATOR && jobsData.getNivIngenieur() < 4) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 4 pour pouvoir utiliser cette machine !");
        }
        if (itemStack.getType() == Material.FOUNDRY && jobsData.getNivIngenieur() < 5) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 5 pour pouvoir utiliser cette machine !");
        }
    }
    
    @EventHandler
    public void onCraft(final CraftItemEvent event) {
        final Player player = (Player)event.getWhoClicked();
        final JobsData jobsData = this.aJobs.getPlayerManager().getJobsData(player.getName());
        final Utils utils = new Utils(this.aJobs);
        if (event.getRecipe().getResult().getType() == Material.HAMMER && jobsData.getNivMineur() < 3) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 3 de ton m\u00e9tier de Mineur pour craft cet outil !");
        }
        if (event.getRecipe().getResult().getType() == Material.FARMTOOL_1 && jobsData.getNivAgriculteur() < 5) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 5 de ton m\u00e9tier d'Agriculteur pour craft cet outil !");
        }
        else if (event.getRecipe().getResult().getType() == Material.FARMTOOL_2 && jobsData.getNivAgriculteur() < 10) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 10 de ton m\u00e9tier d'Agriculteur pour craft cet outil !");
        }
        else if (event.getRecipe().getResult().getType() == Material.FARMTOOL_3 && jobsData.getNivAgriculteur() < 15) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 15 de ton m\u00e9tier d'Agriculteur pour craft cet outil !");
        }
        if (event.getRecipe().getResult().getType() == Material.ADVANCED_CRAFTING_TABLE && jobsData.getNivIngenieur() < 3) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 3 de ton m\u00e9tier d'Ing\u00e9nieur pour craft cet outil !");
        }
        else if (event.getRecipe().getResult().getType() == Material.COIN_GENERATOR && jobsData.getNivIngenieur() < 4) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 4 de ton m\u00e9tier d'Ing\u00e9nieur pour craft cet outil !");
        }
        else if (event.getRecipe().getResult().getType() == Material.FOUNDRY && jobsData.getNivIngenieur() < 5) {
            event.setCancelled(true);
            player.sendMessage("§c§lD\u00e9sol\u00e9, tu dois \u00eatre niveau 5 de ton m\u00e9tier d'Ing\u00e9nieur pour craft cet outil !");
        }
        switch (event.getRecipe().getResult().getType()) {
            case FACTION_BANK:
            case COIN_GENERATOR:
            case FOUNDRY:
            case ACCELERATOR:
            case ADVANCED_CRAFTING_TABLE:
            case HEIST_AXE:
            case BATTLE_AXE:
            case BLUE_STONE:
            case GREEN_STONE:
            case RED_STONE:
            case PURPLE_STONE:
            case YELLOW_STONE:
            case MOLD:
            case FARMTOOL_1:
            case FARMTOOL_2:
            case FARMTOOL_3:
            case IMPROVED_STICK:
            case REINFORCED_STEEL:
            case JADE_CHEST:
            case IRON_LADDER:
            case OBSIDIAN_STICK:
            case UNCLAIM_FINDER: {
                jobsData.setLvlIngenieur(jobsData.getLvlIngenieur() + 1.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+1 level Ing\u00e9nieur ! §7(§f" + jobsData.getLvlIngenieur() + "/" + utils.getLevelMaxIngenieur(player) + "§7)");
                break;
            }
        }
        switch ((int)jobsData.getLvlIngenieur()) {
            case 10000: {
                jobsData.setNivIngenieur(1);
                jobsData.setLvlIngenieur(0.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 1 §b§lpour le job §c§lIng\u00e9nieur §b§l!");
                break;
            }
            case 20000: {
                jobsData.setNivIngenieur(2);
                jobsData.setLvlIngenieur(0.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 2 §b§lpour le job §c§lIng\u00e9nieur §b§l!");
                break;
            }
            case 35000: {
                jobsData.setNivIngenieur(3);
                jobsData.setLvlIngenieur(0.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 3 §b§lpour le job §c§lIng\u00e9nieur §b§l!");
                player.sendMessage("§7§l[§b§lJobs§7§l] §b§lVous venez de d\u00e9bloquer de nouvelles fonctions ! Renseignez vous via le /metier info");
                break;
            }
            case 45000: {
                jobsData.setNivIngenieur(4);
                jobsData.setLvlIngenieur(0.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 4 §b§lpour le job §c§lIng\u00e9nieur §b§l!");
                player.sendMessage("§7§l[§b§lJobs§7§l] §b§lVous venez de d\u00e9bloquer de nouvelles fonctions ! Renseignez vous via le /metier info");
                break;
            }
            case 55000: {
                jobsData.setNivIngenieur(5);
                jobsData.setLvlIngenieur(0.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 5 §b§lpour le job §c§lIng\u00e9nieur §b§l!");
                player.sendMessage("§7§l[§b§lJobs§7§l] §b§lVous venez de d\u00e9bloquer de nouvelles fonctions ! Renseignez vous via le /metier info");
                break;
            }
        }
    }
    
    @EventHandler
    public void onBreak(final BlockBreakEvent event) {
        final Player player = event.getPlayer();
        final JobsData jobsData = this.aJobs.getPlayerManager().getJobsData(player.getName());
        final Utils utils = new Utils(this.aJobs);
        if (jobsData.getNivMineur() == 5 || jobsData.getNivAgriculteur() == 15) {
            return;
        }
        switch (event.getBlock().getType()) {
            case COBBLESTONE:
            case STONE: {
                jobsData.setLvlMineur(jobsData.getLvlMineur() + 2.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+2 d'XP Mineur ! §7(§f" + jobsData.getLvlMineur() + "/" + utils.getLevelMaxMineur(player) + "§7)");
                break;
            }
            case COAL_ORE:
            case REDSTONE_ORE: {
                jobsData.setLvlMineur(jobsData.getLvlMineur() + 3.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+3 d'XP Mineur ! §7(§f" + jobsData.getLvlMineur() + "/" + utils.getLevelMaxMineur(player) + "§7)");
                break;
            }
            case IRON_ORE:
            case GOLD_ORE: {
                jobsData.setLvlMineur(jobsData.getLvlMineur() + 4.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+4 d'XP Mineur ! §7(§f" + jobsData.getLvlMineur() + "/" + utils.getLevelMaxMineur(player) + "§7)");
                break;
            }
            case DIAMOND_ORE: {
                jobsData.setLvlMineur(jobsData.getLvlMineur() + 5.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+5 d'XP Mineur ! §7(§f" + jobsData.getLvlMineur() + "/" + utils.getLevelMaxMineur(player) + "§7)");
                break;
            }
            case EMERALD_ORE: {
                jobsData.setLvlMineur(jobsData.getLvlMineur() + 6.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+6 d'XP Mineur ! §7(§f" + jobsData.getLvlMineur() + "/" + utils.getLevelMaxMineur(player) + "§7)");
                break;
            }
            case TOPAZE_ORE: {
                jobsData.setLvlMineur(jobsData.getLvlMineur() + 8.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+8 d'XP Mineur ! §7(§f" + jobsData.getLvlMineur() + "/" + utils.getLevelMaxMineur(player) + "§7)");
                break;
            }
            case SAPHIR_ORE: {
                jobsData.setLvlMineur(jobsData.getLvlMineur() + 11.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+11 d'XP Mineur ! §7(§f" + jobsData.getLvlMineur() + "/" + utils.getLevelMaxMineur(player) + "§7)");
                break;
            }
            case XP_ORE:
            case RANDOM_ORE: {
                jobsData.setLvlMineur(jobsData.getLvlMineur() + 12.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+12 d'XP Mineur ! §7(§f" + jobsData.getLvlMineur() + "/" + utils.getLevelMaxMineur(player) + "§7)");
                break;
            }
            case JADE_ORE: {
                jobsData.setLvlMineur(jobsData.getLvlMineur() + 15.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+15 d'XP Mineur ! §7(§f" + jobsData.getLvlMineur() + "/" + utils.getLevelMaxMineur(player) + "§7)");
                break;
            }
            case PLATINE_ORE: {
                jobsData.setLvlMineur(jobsData.getLvlMineur() + 25.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7[§bJobs§7] §c+25 level Mineur ! §7(§f" + jobsData.getLvlMineur() + "/" + utils.getLevelMaxMineur(player) + "§7)");
                break;
            }
        }
        switch ((int)jobsData.getLvlMineur()) {
            case 10000: {
                jobsData.setNivMineur(1);
                jobsData.setLvlMineur(0.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 1 §b§lpour le job §c§lMineur §b§l!");
                break;
            }
            case 20000: {
                jobsData.setNivMineur(2);
                jobsData.setLvlMineur(0.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 2 §b§lpour le job §c§lMineur §b§l!");
                break;
            }
            case 35000: {
                jobsData.setNivMineur(3);
                jobsData.setLvlMineur(0.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 3 §b§lpour le job §c§lMineur §b§l!");
                player.sendMessage("§7§l[§b§lJobs§7§l] §b§lVous venez de d\u00e9bloquer de nouvelles fonctions ! Renseignez vous via le /metier info");
                break;
            }
            case 45000: {
                jobsData.setNivMineur(4);
                jobsData.setLvlMineur(0.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 4 §b§lpour le job §c§lMineur §b§l!");
                break;
            }
            case 55000: {
                jobsData.setNivMineur(5);
                jobsData.setLvlMineur(0.0);
                jobsData.save(this.aJobs);
                player.sendMessage("§7§l[§b§lAnnonce§7§l] §a§lF\u00e9licitations ! §b§lVous venez de passer §c§lniveau 5 §b§lpour le job §c§lMineur §b§l!");
                player.sendMessage("§7§l[§b§lJobs§7§l] §b§lVous venez de d\u00e9bloquer de nouvelles fonctions ! Renseignez vous via le /metier info");
                break;
            }
        }
        this.blockAgri(event.getBlock(), player);
    }
}
