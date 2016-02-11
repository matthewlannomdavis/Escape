package view;
import controller.TheGameEngine;
import java.awt.FlowLayout;
import model.Player;
import model.*;
import javax.swing.JPanel;
import model.Room;

public class ButtonPanel extends JPanel {
   
    private Button move, search, bag; 
    private Button north, west, east, south, other, climb;
    
    public ButtonPanel() {
        super();
        setSize(600, 200);
        north = new Button("North");
        west = new Button("West");
        east = new Button("East");
        south = new Button("South");
        other = new Button("other");
        climb = new Button("Climb");
        move = new Button("Move");
        search = new Button("search");
        bag = new Button("Bag");
        add(move);      
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
        clearButtonArea();
        
        for(int x = 0; x > aRoom.getAdjacentRooms().size(); x++){
            switch(aRoom.getAdjacentRooms().get(x).direction){
                case North:
                    add(north);
                    break;
                case East:
                    add(east);
                    break;
                case South:
                    add(south);
                    break;
                case West:
                    add(west);
                    break;
                case Climb:
                    add(climb);
                    break;
                case Other:
                    other.setText(aRoom.getAdjacentRooms().get(x).getOtherKey());
                    add(other);
                    break;
                        
            }
        }
    }
    
    public void update(Player aPlayer) {
        
    }

    public Button getNorthButton() {
        return north;
    }

}
    
