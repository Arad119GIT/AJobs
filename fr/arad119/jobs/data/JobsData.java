package fr.arad119.jobs.data;

public class JobsData extends JSONPersistentData
{
    private String name;
    private int nivAgriculteur;
    private int nivMineur;
    private int nivIngenieur;
    private double lvlAgriculteur;
    private double lvlMineur;
    private double lvlIngenieur;
    
    public JobsData(final String name, final int nivAgriculteur, final int nivMineur, final int nivIngenieur, final double lvlAgriculteur, final double lvlMineur, final double lvlIngenieur) {
        super("/users/" + name);
        this.name = name;
        this.nivAgriculteur = nivAgriculteur;
        this.nivMineur = nivMineur;
        this.nivIngenieur = nivIngenieur;
        this.lvlAgriculteur = lvlAgriculteur;
        this.lvlMineur = lvlMineur;
        this.lvlIngenieur = lvlIngenieur;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public int getNivAgriculteur() {
        return this.nivAgriculteur;
    }
    
    public void setNivAgriculteur(final int nivAgriculteur) {
        this.nivAgriculteur = nivAgriculteur;
    }
    
    public int getNivMineur() {
        return this.nivMineur;
    }
    
    public void setNivMineur(final int nivMineur) {
        this.nivMineur = nivMineur;
    }
    
    public int getNivIngenieur() {
        return this.nivIngenieur;
    }
    
    public void setNivIngenieur(final int nivIngenieur) {
        this.nivIngenieur = nivIngenieur;
    }
    
    public double getLvlAgriculteur() {
        return this.lvlAgriculteur;
    }
    
    public void setLvlAgriculteur(final double lvlAgriculteur) {
        this.lvlAgriculteur = lvlAgriculteur;
    }
    
    public double getLvlMineur() {
        return this.lvlMineur;
    }
    
    public void setLvlMineur(final double lvlMineur) {
        this.lvlMineur = lvlMineur;
    }
    
    public double getLvlIngenieur() {
        return this.lvlIngenieur;
    }
    
    public void setLvlIngenieur(final double lvlIngenieur) {
        this.lvlIngenieur = lvlIngenieur;
    }
}
