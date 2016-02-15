package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import model.*;
import model.RoomEgress.directionKey;
import view.*;

public class TheGameEngine {
    //init basic needed objects
    //gui, player, rooms, and other calls
    TheView view;
    Player player;
    
    //generate gui
    public void startGame(){
	// 1. Generate map
	// TODO: Make this gooder. Right now, just adding a house and a "room" to the south of it.
	Room room = new Room("Outside House", "You are standing outside of a house. It is white and made of brick. The front door is locked, but a window seems to be ajar. Before you is a closed mailbox.");
	Room roomToTheSouth = new Room("South of House", "You are standing in a field south of the house. There's really nothing here.");
	RoomEgress pathToTheSouth = new RoomEgress(directionKey.South, roomToTheSouth, "There is a path leading to the south.");
	RoomEgress pathToTheNorth = new RoomEgress(directionKey.North, room, "There's an inviting path leading to the north. Much more interesting than what you see here.");
	room.addRoomEgress(pathToTheSouth);
	roomToTheSouth.addRoomEgress(pathToTheNorth);

        // 2. Create character
	player = new Player();

        // 3. Place character @ start location
        player.setCurrentroom(room);

        view = new TheView(this);	
	view.updateDescription("Welcome to Escape!");
//        view.getNorthButton().addActionListener(new northButton());
    }
    
    public void movePlayer(String movementPath){
        // Goes north
        for(int x = 0; x < player.getCurrentRoom().getAdjacentRooms().size(); x++){
            if(player.getCurrentRoom().getAdjacentRooms().get(x).getTheCaption() != null){
                if(player.getCurrentRoom().getAdjacentRooms().get(x).getTheCaption() == movementPath){
                    player.setCurrentroom(player.getCurrentRoom().getAdjacentRooms().get(x).getTargetRoom());
                    roomEntranceEvent();
                }else{
                  //was not  a match continue the loop  
                }
            }else if(player.getCurrentRoom().getAdjacentRooms().get(x).direction == RoomEgress.directionKey.North && movementPath == "North"){
                player.setCurrentroom(player.getCurrentRoom().getAdjacentRooms().get(x).getTargetRoom());
                roomEntranceEvent();
            }else if(player.getCurrentRoom().getAdjacentRooms().get(x).direction == RoomEgress.directionKey.East && movementPath == "East"){
                player.setCurrentroom(player.getCurrentRoom().getAdjacentRooms().get(x).getTargetRoom());
                roomEntranceEvent();
            }else if(player.getCurrentRoom().getAdjacentRooms().get(x).direction == RoomEgress.directionKey.South && movementPath == "South"){
                player.setCurrentroom(player.getCurrentRoom().getAdjacentRooms().get(x).getTargetRoom());
                roomEntranceEvent();
            }else if(player.getCurrentRoom().getAdjacentRooms().get(x).direction == RoomEgress.directionKey.West && movementPath == "West"){
                player.setCurrentroom(player.getCurrentRoom().getAdjacentRooms().get(x).getTargetRoom());
                roomEntranceEvent();
            }else if(player.getCurrentRoom().getAdjacentRooms().get(x).direction == RoomEgress.directionKey.Climb && movementPath == "Climb"){
                player.setCurrentroom(player.getCurrentRoom().getAdjacentRooms().get(x).getTargetRoom()); 
                roomEntranceEvent();
            }else{
                //somthing went wrong continue the loop
            }
               
                
                /*
                switch(player.getCurrentRoom().getAdjacentRooms().get(x).direction){
                case North:
                    if(movementPath == "North"){
                        
                    }
                    //if not beeak the switch and continue the loop
                    break;
                case East:
                    if(movementPath == "East"){
                        
                    }
                    break;
                case West:
                    if(movementPath == "West"){
                        
                    }
                    break;
                case South:
                    if(movementPath == "South"){
                        
                    }
                    break;
                case Climb:
                    if(movementPath == "Climb"){
                        
                    }
                    break;
                default:
                    view.updateDescription("opps an error occured in moving the player");
                    break;
                }*/
            
    }
}

    private void roomEntranceEvent() {
        view.updateDescription(player.getCurrentRoom().getDescription());
        view.basicButtonSet();
    }

    public void callMoveSet() {
        view.movementButtonSet(player.getCurrentRoom());
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

