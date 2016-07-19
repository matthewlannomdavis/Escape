package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import model.*;
import model.RoomEgress.directionKey;
import view.*;

public class TheGameEngine {
    //init basic needed objects
    TheView view;
    Player player;
    Apartment yourApartment;
    
    //generate gui
    public void startGame(){
       player = new Player();
       titleScreenCall();
        
    }
    public void titleScreenCall(){
        view = new TheView(this);
        view.titleScreenCall();
        System.out.println("title screen called");
    }
    public void startNewGame(){
        view.mainScreen();
        view.opening();
    }
    public void createCharacter(){
        
    }
    public void enterfirstStage(){
        yourApartment = new Apartment(player.getBeingsName());
        player.setCurrentroom(yourApartment.getStarterRoom());
    }
    public void loadGameCall(){
        //for later use when loading from a save file will be possible
    }
    public void optionsCall(){
        //for possible later use when there are different options to deal with
    }
    
    public void movePlayer(Room targetRoom){
       System.out.println("move player called");
        player.setCurrentroom(targetRoom); 
        roomEntranceEvent();
    }

    private void roomEntranceEvent() {
       System.out.println("plaer should be going to " + player.getCurrentRoom().getName());
        view.updateDescription(player.getCurrentRoom().getName());
        view.updateDescription(player.getCurrentRoom().getDescription());
        view.basicButtonSet();
    }

    public void callMoveSet() {
        view.movementButtonSet(player.getCurrentRoom());
    }
    public void callRoomsObjects(){
        view.roomObjectButtonSet(player.getCurrentRoom());
    }

    public void displayObservedObject(GameObject gameObject) {
       view.updateDescription(gameObject.getDescription());
       
    }
}

/*
//        ScreenLayout screenLayout = new ScreenLayout();

        while (true) {
            // Update panels
            screenLayout.Update(player);

            // Accept user input
            // TODO: Expand this into a lexical parser (more or less) to handle more than just navigation
            // TODO: OR buttonize this so no parsing is necessary!
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your move > ");
            String userInput = scanner.next();
            System.out.println();

            if (userInput.equals("quit") || userInput.equals("exit")) {
                    System.exit(0);
            }

            boolean roomFound = false;
            for (RoomEgress re : player.getCurrentRoom().getAdjacentRooms()) {
                    if (userInput.equals(re.getDirectionKey())) {
                            player.setCurrentroom(re.getTargetRoom());
                            roomFound = true;
                    }
            }
            if (!roomFound) {
                    System.out.println("That's not a valid direction at the moment.");
            }
                    // TODO: Implement sub-actions - for now, simple navigation.
                    // If input not a "leaf" action:
                    // Render new buttons
                    // Accept user input
                    // Perform sub-action

            // Perform AI reaction
            // TODO: Make this gooder; nothing for now.
        }
*/
    
//call introduction
    
    //call character creation
    
    //give starting room description
    
    //call basic play area
    
    //player input
    //is subaction requared? if yes wait for proceeding action
    //AI reacts
    //is a end condition met?
    //if not return to waiting for player input

