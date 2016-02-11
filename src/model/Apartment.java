package model;

import java.util.ArrayList;

public class Apartment {
    private boolean isAMainStage = true;
    private ArrayList<Room>rooms = new ArrayList<Room>();
    
    
    public Apartment(){
    
    
    }
    public void generateApartment(){
        
    }
    /*come back to this
        public Room getRoomByName(String roomName){
        return rooms.indexOf()
        
    }
    */
    public Room getARoomByPlace(int roomPlace){
        return rooms.get(roomPlace);
    }
    
    
}
