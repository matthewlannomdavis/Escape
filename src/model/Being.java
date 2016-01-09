
package model;

import java.util.ArrayList;

public class Being {

    private String beingName;
    private int beingLevel;
    private String beingDescription;
    private int beingStrength;
    private int beingDefense;
    private int beingSpeed;
    private int beingCurrentLife;
    private int beingMaxLife;
    private int beingCurrentSpirit;
    private int beingDexterity;
    private int beingMind;
    private int beingFlexibility;
    private int level;
    private ArrayList<Skill> skills;
    private model.Room currentRoom;
	
    public model.Room getCurrentRoom() {
		return currentRoom;
	}
	
    public void setCurrentroom(model.Room aRoom) {
		currentRoom = aRoom;
	} 
    
    public String getBeingsName(){
        return beingName;
    }
    public int getBeingsLevel(){
        return beingLevel;
    }
    public String getBeingsDescription(){
    return beingDescription;
    }
    public void setBeingsName(String x){
        beingName = x;
    }

    /**
     * @return the beingSthength
     */
    public int getBeingStrength() {
        return beingStrength;
    }

    /**
     * @param beingSthength the beingSthength to set
     */
    public void setBeingStrength(int beingStrength) {
        this.beingStrength = beingStrength;
    }

    /**
     * @return the beingDefense
     */
    public int getBeingDefense() {
        return beingDefense;
    }

    /**
     * @param beingDefense the beingDefense to set
     */
    public void setBeingDefense(int beingDefense) {
        this.beingDefense = beingDefense;
    }

    /**
     * @return the beingSpeed
     */
    public int getBeingSpeed() {
        return beingSpeed;
    }

    /**
     * @param beingSpeed the beingSpeed to set
     */
    public void setBeingSpeed(int beingSpeed) {
        this.beingSpeed = beingSpeed;
    }

    /**
     * @return the beingCurrentLife
     */
    public int getBeingCurrentLife() {
        return beingCurrentLife;
    }

    /**
     * @param beingCurrentLife the beingCurrentLife to set
     */
    public void setBeingCurrentLife(int beingCurrentLife) {
        this.beingCurrentLife = beingCurrentLife;
    }

    /**
     * @return the beingMaxLife
     */
    public int getBeingMaxLife() {
        return beingMaxLife;
    }

    /**
     * @param beingMaxLife the beingMaxLife to set
     */
    public void setBeingMaxLife(int beingMaxLife) {
        this.beingMaxLife = beingMaxLife;
    }

    /**
     * @return the beingCurrentSpirit
     */
    public int getBeingCurrentSpirit() {
        return beingCurrentSpirit;
    }

    /**
     * @param beingCurrentSpirit the beingCurrentSpirit to set
     */
    public void setBeingCurrentSpirit(int beingCurrentSpirit) {
        this.beingCurrentSpirit = beingCurrentSpirit;
    }

    /**
     * @return the beingDexterity
     */
    public int getBeingDexterity() {
        return beingDexterity;
    }

    /**
     * @param beingDexterity the beingDexterity to set
     */
    public void setBeingDexterity(int beingDexterity) {
        this.beingDexterity = beingDexterity;
    }

    /**
     * @return the beingMind
     */
    public int getBeingMind() {
        return beingMind;
    }

    /**
     * @param beingMind the beingMind to set
     */
    public void setBeingMind(int beingMind) {
        this.beingMind = beingMind;
    }

    /**
     * @return the beingFlexibility
     */
    public int getBeingFlexibility() {
        return beingFlexibility;
    }

    /**
     * @param beingFlexibility the beingFlexibility to set
     */
    public void setBeingFlexibility(int beingFlexibility) {
        this.beingFlexibility = beingFlexibility;
    }
    
}
