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
        repaint();
        validate();
        System.out.println("got though clear button area");
    }
    
    public void movementButtons(Room aRoom){
        clearButtonArea();
        for(int x = 0; x < aRoom.getAdjacentRooms().size(); x++){ 
            
            switch(aRoom.getAdjacentRooms().get(x).direction){
                case North:
                    north.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    if(aRoom.getAdjacentRooms().get(x).getTheCaption() != null){
                        north.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                    }else{
                        north.setText("North");
                    }
                    add(north);
                    break;
                case East:
                     east.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    if(aRoom.getAdjacentRooms().get(x).getTheCaption() != null){
                        east.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                    }else{
                        east.setText("East");
                    }
                    add(east);
                    break;
                case South:
                    south.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    if(aRoom.getAdjacentRooms().get(x).getTheCaption() != null){
                        south.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                       
                    }else{
                        south.setText("South");
                        
                    }
                    add(south);
                    break;
                case West:
                    west.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    if(aRoom.getAdjacentRooms().get(x).getTheCaption() != null){
                        west.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                    }else{
                        west.setText("West");
                    }
                    add(west);
                    break;
                case Climb:
                    climb.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    if(aRoom.getAdjacentRooms().get(x).getTheCaption() != null){
                        climb.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                    }else{
                        climb.setText("Climb");
                    }
                    add(climb);
                    break;
                case Other:
                   other.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    other.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                    add(other);
                    break;
                        
            }
            this.repaint();
            validate();
            
        }
    }
    
    public void update(Player aPlayer) {
        
    }

    public Button getNorthButton() {
        return north;
    }
    public Button getMoveButton() {
        return move;
    }

    public Button getSearchButton() {
        return search;
    }

    public Button getBagButton() {
        return bag;
    }

    public Button getWestButton() {
        return west;
    }

    public Button getEastButton() {
        return east;
    }

    public Button getSouthButton() {
        return south;
    }

    public Button getOtherButton() {
        return other;
    }

    public Button getClimbButton() {
        return climb;
    }
}
    
