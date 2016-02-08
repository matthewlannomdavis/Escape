package view;
import controller.TheGameEngine;
import java.awt.FlowLayout;
import model.Player;

import javax.swing.JPanel;
import model.Room;

public class ButtonPanel extends JPanel {
   
    private Button move, search, bag; 
    private Button north, west, east, south;
    
    public ButtonPanel() {
        super();
        setSize(600, 200);
        north = new Button("North");
        west = new Button("West");
        east = new Button("East");
        south = new Button("South");
        // move = new Button("Move");
        search = new Button("search");
        bag = new Button("Bag");

        add(move);
        add(north);
        add(west);
        add(east);
        add(south);
       
        add(search);
        add(bag);
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
    
    public void movementButtons(Room aRoom){
        
        
        for(int x = 0; x > aRoom.getAdjacentRooms().size(); x++){
            
        }
    }
    
    public void update(Player aPlayer) {
        
    }

    public Button getNorthButton() {
        return north;
    }

}
    
