package model;

public class Door extends GameObject{
   
    private Room alphaTargetRoom;
    private Room betaTargetRoom;
    private boolean isDoorLocked;
    private String nameOfNeededKey;
    
    public Door(String doorName, String doorDescription, int integraty, boolean lock, String neededKey){
        this.setName(doorName);
        this.setDescription(doorDescription);
        this.setObjectIntegraty(integraty);
        isDoorLocked = lock;
        nameOfNeededKey = neededKey;
    }
    public Door(String doorName, String doorDescription, int integraty, boolean lock, String neededKey, Room alphaTarget, Room betaTarget){
        this.setName(doorName);
        this.setDescription(doorDescription);
        this.setObjectIntegraty(integraty);
        isDoorLocked = lock;
        nameOfNeededKey = neededKey;
        alphaTargetRoom = alphaTarget;
        betaTargetRoom = betaTarget;
    }
    
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

    public boolean isTheDoorLocked() {
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
    
    public Room objectAction(Room currentRoom){
        if(currentRoom == alphaTargetRoom){
            return betaTargetRoom;
        }else if(currentRoom == betaTargetRoom){
            return alphaTargetRoom;
        }else{
            return currentRoom;
        }
    }
    
}
