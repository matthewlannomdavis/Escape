package model;
import java.util.ArrayList;

public class Room {
	private String name;
	private String description;
	private ArrayList<RoomEgress> adjacentRooms = new ArrayList<RoomEgress>();
	private ArrayList<GameObject> objectsInRoom = new ArrayList<GameObject>();
        
	public Room(String aName, String aDescription) {
		name = aName;
		description = aDescription;
	}

	public void addRoomEgress(RoomEgress aRoomEgress) {
		adjacentRooms.add(aRoomEgress);
	}
	
	public void addRoomEgress(model.RoomEgress.directionKey aDirectionKey, Room aTargetRoom, String aEgressDescriptionText) {
		adjacentRooms.add(new RoomEgress(aDirectionKey, aTargetRoom, aEgressDescriptionText));
	}
	
	public ArrayList<RoomEgress> getAdjacentRooms() {
		return adjacentRooms;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
        public void addObjectToRoom(GameObject gObject){
            
        }
        public ArrayList<GameObject> getRoomObjects(){
            return objectsInRoom;
        }
}
