package view;
import java.awt.Dimension;
import javax.swing.*;
import model.Player;
import model.Room;
import model.RoomEgress;

public class DescriptionPanel extends JPanel {
    JScrollPane scroller;
    JTextArea textArea;
    public DescriptionPanel(){
    textArea= new JTextArea(25, 40);
    textArea.setEditable(false);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    scroller = new JScrollPane(textArea);
    scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    scroller.setPreferredSize(new Dimension(450, 110));
    scroller.validate();
}

    public void updateText(String text){
        textArea.append("\n" + text );
        scroller.revalidate();
    }
    public void clearAndUpdate(String text){
        textArea.setText(text);
    }
    public void clearText(){
        textArea.setText("");
    }
    public void update(Player aPlayer) {
	Room room = aPlayer.getCurrentRoom();
	System.out.println(room.getDescription());
	for (RoomEgress re : room.getAdjacentRooms()) {
            System.out.println(re.getEgressDescriptionText());
	}
    }    
}
