package model;
//A class for holding rooms

import java.util.ArrayList;

public class mainStage {
  private  ArrayList<Room>heldRooms = new ArrayList<Room>();
  private Room starterRoom;

    public Room getStarterRoom() {
        return starterRoom;
    }

    public void setStarterRoom(Room starterRoom) {
        this.starterRoom = starterRoom;
    }


    public ArrayList<Room> getHeldRooms() {
        return heldRooms;
    }

    public void setHeldRooms(ArrayList<Room> heldRooms) {
        this.heldRooms = heldRooms;
    }
 
  
    
    
    
}
