package model;
public class RoomEgress {
	private String directionKey;
	private Room targetRoom;
	private String egressDescriptionText;
	
	public RoomEgress(String aDirectionKey, Room aTargetRoom, String aEgressDescriptionText) {
		directionKey = aDirectionKey;
		targetRoom = aTargetRoom;
		egressDescriptionText = aEgressDescriptionText;
	}
	
	public String getEgressDescriptionText() {
		return egressDescriptionText;
	}
	
	public String getDirectionKey() {
		return directionKey;
	}
	
	public Room getTargetRoom() {
		return targetRoom;
	}
}
