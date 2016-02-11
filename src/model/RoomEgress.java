package model;
public class RoomEgress {
	public enum directionKey{
                North, East, South, West, Climb, Other
                }
        public directionKey direction;
	private Room targetRoom;
	private String egressDescriptionText;
	private String otherKey;
        
	public RoomEgress(directionKey aDirectionKey, Room aTargetRoom, String aEgressDescriptionText) {
		this.direction = aDirectionKey;
		targetRoom = aTargetRoom;
		egressDescriptionText = aEgressDescriptionText;
	}
        public RoomEgress(directionKey aDirectionKey, Room aTargetRoom, String aEgressDescriptionText, String anotherKey) {
		this.direction = aDirectionKey;
		targetRoom = aTargetRoom;
		egressDescriptionText = aEgressDescriptionText;
                otherKey = anotherKey;
	}
	
	public String getEgressDescriptionText() {
		return egressDescriptionText;
	}
	
	public String getDirectionKey() {
		switch(direction){
                    case North:
                        return "North";
                    case East:
                        return "East";
                    case South:
                        return "South";
                    case West:
                        return "West";
                    case Climb:
                        return "climb";
                    case Other:
                        return "other";
                    default:
                        return "Error lost in no direction";
                }
	}
	
	public Room getTargetRoom() {
		return targetRoom;
	}
        public String getOtherKey(){
            return otherKey;
        }
}
