package view;

import controller.TheGameEngine;
import java.awt.FlowLayout;
import model.Player;
import model.*;
import javax.swing.JPanel;
import model.Room;

public class ButtonPanel extends JPanel {
    private Button newGame, loadGame, saveGame, gameOptions;
    private Button move, search, bag;
    private Button north, west, east, south, other, climb;
    private Button GO1, GO2, GO3, GO4, GO5, GO6;
    
    public ButtonPanel() {
        super();
        setSize(600, 200);
        north = new Button("North");
        west = new Button("West");
        east = new Button("East");
        south = new Button("South");
        other = new Button("other");
        climb = new Button("Climb");
        move = new Button("Move");
        search = new Button("search");
        bag = new Button("Bag");
        newGame = new Button("Escape this world");
        loadGame = new Button("continue");
        saveGame = new Button("Save");
        gameOptions = new Button("Options");
        validate();
    }
    public void addBasicButtons() {
        clearButtonArea();

        add(move);
        add(search);
        add(bag);
    }
    public void mainMenuButtons() {
        clearButtonArea();
        
        add(newGame);
        add(loadGame);
        add(gameOptions);
    }
    private void clearButtonArea() {
        removeAll();
        repaint();
        validate();
        System.out.println("got though clear button area");
    }
    public void movementButtons(Room aRoom) {
        clearButtonArea();
        for (int x = 0; x < aRoom.getAdjacentRooms().size(); x++) {

            switch (aRoom.getAdjacentRooms().get(x).direction) {
                case North:
                    north.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    if (aRoom.getAdjacentRooms().get(x).getTheCaption() != null) {
                        north.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                    } else {
                        north.setText("North");
                    }
                    add(north);
                    break;
                case East:
                    east.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    if (aRoom.getAdjacentRooms().get(x).getTheCaption() != null) {
                        east.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                    } else {
                        east.setText("East");
                    }
                    add(east);
                    break;
                case South:
                    south.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    if (aRoom.getAdjacentRooms().get(x).getTheCaption() != null) {
                        south.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());

                    } else {
                        south.setText("South");

                    }
                    add(south);
                    break;
                case West:
                    west.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    if (aRoom.getAdjacentRooms().get(x).getTheCaption() != null) {
                        west.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                    } else {
                        west.setText("West");
                    }
                    add(west);
                    break;
                case Climb:
                    climb.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    if (aRoom.getAdjacentRooms().get(x).getTheCaption() != null) {
                        climb.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                    } else {
                        climb.setText("Climb");
                    }
                    add(climb);
                    break;
                case Other:
                    other.setAttachedRoom(aRoom.getAdjacentRooms().get(x).getTargetRoom());
                    other.setText(aRoom.getAdjacentRooms().get(x).getTheCaption());
                    add(other);
                    break;

            }
            this.repaint();
            validate();

        }
    }
    void roomObjectsButtons(Room currentRoom) {
        clearButtonArea();
        for (int x = 0; x < currentRoom.getRoomObjects().size(); x++) {
            switch (x) {
                case 0:
                    GO1 = new Button(currentRoom.getRoomObjects().get(x).getName(), currentRoom.getRoomObjects().get(x));
                    break;
                case 1:
                    GO2 = new Button(currentRoom.getRoomObjects().get(x).getName(), currentRoom.getRoomObjects().get(x));
                    break;
                case 2:
                    GO3 = new Button(currentRoom.getRoomObjects().get(x).getName(), currentRoom.getRoomObjects().get(x));
                    break;
                case 3:
                    GO4 = new Button(currentRoom.getRoomObjects().get(x).getName(), currentRoom.getRoomObjects().get(x));
                    break;
                case 4:
                    GO5 = new Button(currentRoom.getRoomObjects().get(x).getName(), currentRoom.getRoomObjects().get(x));
                    break;
                case 5:
                    GO6 = new Button(currentRoom.getRoomObjects().get(x).getName(), currentRoom.getRoomObjects().get(x));
                    break;
            }
        }
    }
    public void update(Player aPlayer) {

    }
//getters & setters
    public Button getNorthButton() {
        return north;
    }

    public Button getMoveButton() {
        return move;
    }

    public Button getSearchButton() {
        return search;
    }

    public Button getBagButton() {
        return bag;
    }

    public Button getWestButton() {
        return west;
    }

    public Button getEastButton() {
        return east;
    }

    public Button getSouthButton() {
        return south;
    }

    public Button getOtherButton() {
        return other;
    }

    public Button getClimbButton() {
        return climb;
    }
    public Button getNewGame() {
        return newGame;
    }
    public Button getLoadGame() {
        return loadGame;
    }
    public Button getSaveGame() {
        return saveGame;
    }
    public Button getGameOptions() {
        return gameOptions;
    }
   public Button getGO1() {
        return GO1;
    }
    public Button getGO2() {
        return GO2;
    }
    public Button getGO3() {
        return GO3;
    }
   public Button getGO4() {
        return GO4;
    }
  public Button getGO5() {
        return GO5;
    }
   public Button getGO6() {
        return GO6;
    }
}
