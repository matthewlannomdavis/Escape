package view;
import javax.swing.JButton;
import model.Room;
import model.GameObject;
public class Button extends JButton {
    Room attachedRoom;
    GameObject attachedGameObject;
    
    
    public Button(String buttonText){
       super(buttonText);
   }
    public Button(String buttonText, Room targetRoom){
       super(buttonText);
       attachedRoom = targetRoom;
   }
   public void setAttachedRoom(Room targetRoom){
       attachedRoom = targetRoom;
   }
   
   public Room getAttachedRoom(){
       return attachedRoom;
   }
   
}
