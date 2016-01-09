package controller;

import java.util.Scanner;
import model.*;
import view.*;

public class TheGameEngine {
    

    //init basic needed objects
    //gui, player, rooms, and other calls
    TheView View;
    Player ThePlayer;
    
    //generate gui
    public void startGame(){
        // 0. Print banner
		System.out.println("Welcome to Escape!");
		
		// 1. Create character
		Player player = new Player();
		
		// Generate map
		// TODO: Make this gooder. Right now, just adding a house and a "room" to the south of it.
		Room room = new Room("Outside House", "You are standing outside of a house. It is white and made of brick. The front door is locked, but a window seems to be ajar. Before you is a closed mailbox.");
		Room roomToTheSouth = new Room("South of House", "You are standing in a field south of the house. There's really nothing here.");
		RoomEgress pathToTheSouth = new RoomEgress("s", roomToTheSouth, "There is a path leading to the south.");
		RoomEgress pathToTheNorth = new RoomEgress("n", room, "There's an inviting path leading to the north. Much more interesting than what you see here.");
		room.addRoomEgress(pathToTheSouth);
		roomToTheSouth.addRoomEgress(pathToTheNorth);

		// Place character @ start location
		player.setCurrentroom(room);
		
		ScreenLayout screenLayout = new ScreenLayout();

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
	}
   
 //call introduction
    
    //call character creation
    
    //give starting room description
    
    //call basic play area
    
    //player input
    //is subaction requared? if yes wait for proceeding action
    //AI reacts
    //is a end condition met?
    //if not return to waiting for player input



}
   

