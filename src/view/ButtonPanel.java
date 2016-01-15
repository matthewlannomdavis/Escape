package view;
import java.awt.FlowLayout;
import model.Player;

import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
   
   private Button move, search, bag; 
   public ButtonPanel(){
       super();
       setSize(400, 200);
       move = new Button("Move");
       search = new Button("search");
       bag = new Button("Bag");
       validate();
   }
    public void addBasicButtons() {
        clearButtonArea();
        add(move);
        add(search);
        add(bag);
    }
    private void clearButtonArea(){
        removeAll();
        validate();
    }
    
    public void update(Player aPlayer) {
        
    }
}
