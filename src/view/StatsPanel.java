package View;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import model.Player;


public class StatsPanel extends JPanel {
    JLabel name, strength, speed, defense, dextarity, mind, flexibility, spirit, health;
    public StatsPanel(){
        name = new JLabel("nobody");
        strength = new JLabel("0");
        speed = new JLabel("0");
        
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
    }
    public void update(Player aPlayer){
        
    }
}
