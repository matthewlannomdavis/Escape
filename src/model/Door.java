package model;

public class Door extends GameObject{
   
    private Room alphaTargetRoom;
    private Room betaTargetRoom;
    private boolean isDoorLocked;
    private String nameOfNeededKey;
    
    public Room getAlphaTargetRoom() {
        return alphaTargetRoom;
    }

    public void setAlphaTargetRoom(Room alphaTargetRoom) {
        this.alphaTargetRoom = alphaTargetRoom;
    }

    public Room getBetaTargetRoom() {
        return betaTargetRoom;
    }

    public void setBetaTargetRoom(Room betaTargetRoom) {
        this.betaTargetRoom = betaTargetRoom;
    }

    public boolean isIsDoorLocked() {
        return isDoorLocked;
    }

    public void setIsDoorLocked(boolean isDoorLocked) {
        this.isDoorLocked = isDoorLocked;
    }

    public String getNameOfNeededKey() {
        return nameOfNeededKey;
    }

    public void setNameOfNeededKey(String nameOfNeededKey) {
        this.nameOfNeededKey = nameOfNeededKey;
    }

    
}
