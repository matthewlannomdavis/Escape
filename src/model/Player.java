/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Being;

public class Player extends Being {
    private int currentExperiance;
    private int neededExperiance;

    public int getCurrentExperiance() {
        return currentExperiance;
    }

    public void setCurrentExperiance(int currentExperiance) {
        this.currentExperiance = currentExperiance;
    }

    public int getNeededExperiance() {
        return neededExperiance;
    }

    public void setNeededExperiance(int neededExperiance) {
        this.neededExperiance = neededExperiance;
    }
    
    
    
}
