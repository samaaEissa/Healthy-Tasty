/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.DTOClasses;

/**
 *
 * @author Hp
 */
public class Diet {
    private int ID;
    private String Name;
    private int carbPercent;
    private int proutinPercent;
    private int vitaminPercent;
    private int fatPercent;
    private int mineralsPercent;
    private String description;

    @Override
    public String toString() {
        return "Diet{" + "ID=" + ID + ", Name=" + Name + ", carbPercent=" + carbPercent + ", proutinPercent=" + proutinPercent + ", vitaminPercent=" + vitaminPercent + ", fatPercent=" + fatPercent + ", mineralsPercent=" + mineralsPercent + ", description=" + description + '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getCarbPercent() {
        return carbPercent;
    }

    public void setCarbPercent(int carbPercent) {
        this.carbPercent = carbPercent;
    }

    public int getProutinPercent() {
        return proutinPercent;
    }

    public void setProutinPercent(int proutinPercent) {
        this.proutinPercent = proutinPercent;
    }

    public int getVitaminPercent() {
        return vitaminPercent;
    }

    public void setVitaminPercent(int vitaminPercent) {
        this.vitaminPercent = vitaminPercent;
    }

    public int getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(int fatPercent) {
        this.fatPercent = fatPercent;
    }

    public int getMineralsPercent() {
        return mineralsPercent;
    }

    public void setMineralsPercent(int mineralsPercent) {
        this.mineralsPercent = mineralsPercent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
