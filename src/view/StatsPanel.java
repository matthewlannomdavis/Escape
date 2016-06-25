package view;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import model.Player;

public class StatsPanel extends JPanel {
    JLabel name, strength, speed, defense, dextarity, mind, flexibility, spirit, health, exp;
    
    public StatsPanel() {
        name = new JLabel("nobody");
        strength = new JLabel("0");
        speed = new JLabel("0");
        defense = new JLabel("0");
        dextarity = new JLabel("0");
        mind = new JLabel("0");
        flexibility = new JLabel("0");
        spirit = new JLabel("0");
        health = new JLabel("0");
        exp = new JLabel("0");
        
        setSize(200,600);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(new EmptyBorder(10,10,10,10));
        this.add(name);
        this.add(new JLabel("Health"));
        this.add(health);
        this.add(new JLabel("Spirit"));
        this.add(spirit);
        this.add(new JLabel("Strength"));
        this.add(strength);
        this.add(new JLabel("Defense"));
        this.add(defense);
        this.add(new JLabel("Speed"));
        this.add(speed);
        this.add(new JLabel("Dextarity"));
        this.add(dextarity);
        this.add(new JLabel("Mind"));
        this.add(mind);
        this.add(new JLabel("Flexibilty"));
        this.add(flexibility);
        this.add(new JLabel("Experiance"));
        this.add(exp);
    }
    
    public void update(Player aPlayer){
        health.setText(aPlayer.getBeingCurrentLife() + " /" + aPlayer.getBeingCurrentLife());
        spirit.setText(aPlayer.getBeingCurrentSpirit() + " /"+ aPlayer.getBeingMaxSpirit());
        strength.setText("" + aPlayer.getBeingStrength());
        defense.setText(""+ aPlayer.getBeingDefense());
        speed.setText("" + aPlayer.getBeingSpeed());
        mind.setText(""+ aPlayer.getBeingMind());
        dextarity.setText("" + aPlayer.getBeingDexterity());
        flexibility.setText("" + aPlayer.getBeingFlexibility());
        exp.setText(aPlayer.getCurrentExperiance()+ " /" + aPlayer.getNeededExperiance());
        
        
    }
}
