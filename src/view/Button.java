package view;
import javax.swing.JButton;
import model.Room;
import model.GameObject;
import model.GameItem;
public class Button extends JButton {
    Room attachedRoom;
    GameObject attachedGameObject;
    GameItem attachedGameItem;
    
    
    public Button(String buttonText){
       super(buttonText);
   }
    public Button(String buttonText, Room targetRoom){
       super(buttonText);
       attachedRoom = targetRoom;
   }
    public Button(String buttonText, GameObject gObject){
        super(buttonText);
        attachedGameObject = gObject;
    }
   public void setAttachedRoom(Room targetRoom){
       attachedRoom = targetRoom;
   }
   
   public Room getAttachedRoom(){
       return attachedRoom;
   }
   public GameObject getGameObject(){
       return attachedGameObject;
   }
   
}
