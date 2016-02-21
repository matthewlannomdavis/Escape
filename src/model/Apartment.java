package model;

import java.util.ArrayList;

public class Apartment extends mainStage{
    
    public Apartment(String playerName){
        Room patio = new Room("Patio", "outside of an apartmentlabeled 08. The surrounding space is a plain wood and beyond the patio seems to be nothing. The entrance is a typical"
                + "apartment door red and made of some metal.");
        Room hall1 = new Room("Entrance hallway", "a small entrance way in the shape of a hallway. Theres nothing special about it. The carpet is worn and covered in filth from "
                + "what you can only guess is shoe guff");
        Room hall2 = new Room("Main Hallway", "Unlike the entrance hallway this is a true hallway connecting to several rooms");
        Room livingRoom = new Room("Living Room", "A common area of the apartment."
                + " From the living room you can see into the dinning area and into the entrance hallway."
                + " There is a Tv, a desk, a chair, and a couch.");
        Room diningRoom = new Room("Dining Room", "A space that really could have been anything by the fact its just and open part of the living room divided only by the "
                + "fact that it has a table with which could be eaten at. ");
        Room kitchen = new Room("Kitchen", "A reather small kitchen some would think based on there own. The room could hold several people but that may make cooking hard."
                + "There are many cupboards, a fridge, and a stove all in the room");
        Room bathRoom = new Room("Bathroom", " a simple bathroom with a medicine cabinet, toilet, and shower, A green bathmat covers the floor along with a green toilet seat cover");
        Room playerRoom = new Room(playerName + "'s Room", "You believe this is your room, but somehow it's not. The room is covered in posters of things you've made"
                + "achievments of yours and pictures you liked. Standing in the room feels wrong as much as it feels right. IS this a sanctury or a prison");
        Room bedRoom = new Room("unknown", "A bedroom.....yes...no...It looks to be a bedroom, but it holds something more. Standing in the room makes you feel alone"
                + " and sad. The room hold a bed that hasn't been made in some time. Only had of the bed is covered in a pillow and cover. Theres a dresser with a mirror, and "
                + "two side tables. Nothing is right here");
        //create room egresses
        RoomEgress frontDoorEntrance = new RoomEgress(RoomEgress.directionKey.South, hall1, "A large feeling metal door leading inside the apartment", "Front Door");
        RoomEgress frontDoorExit = new RoomEgress(RoomEgress.directionKey.North, patio, "the front door leads back to the patio outside the apartment.", "Front Door(outside)");
        RoomEgress hallOneToLivingRoom = new RoomEgress(RoomEgress.directionKey.East, livingRoom, "to your east is the living room.");
        RoomEgress hallOneToHallTwo = new RoomEgress(RoomEgress.directionKey.West, hall2, "to the west is the main hallway");
        RoomEgress livingToHallOne = new RoomEgress(RoomEgress.directionKey.West, hall1, "to the west is the entrance hallway");
        RoomEgress livingToDinning = new RoomEgress(RoomEgress.directionKey.South, diningRoom, "to the south is the dinning area");
        RoomEgress DinningToLiving = new RoomEgress(RoomEgress.directionKey.North, livingRoom, "to the north is the living room");
        RoomEgress DinningToKitchen = new RoomEgress(RoomEgress.directionKey.West, kitchen, "to the west is the kitchen");
        RoomEgress kitchenToHallTwo= new RoomEgress(RoomEgress.directionKey.North, hall2, "to the north is the main hallway");
        RoomEgress kitchenToDining = new RoomEgress(RoomEgress.directionKey.East, diningRoom, "to the east lies the dinning room");
        RoomEgress hallTwoToKitchen= new RoomEgress(RoomEgress.directionKey.Other, kitchen, "to the right of the bathroom is the opening that leads to the kitchen", "Path to the Kitchen");
        RoomEgress hallTwoToPlayerRoom = new RoomEgress(RoomEgress.directionKey.North, playerRoom, "to the north is your bedroom");
        RoomEgress hallTwoTobedRoom = new RoomEgress(RoomEgress.directionKey.West, bedRoom, "A door leads into the main bedroom however a immense feeling comes from it leering over you.");
        RoomEgress hallTwoToBath = new RoomEgress(RoomEgress.directionKey.South, bathRoom, "A place where people clean up lies beyond this door");
        RoomEgress hallTwoToHallOne = new RoomEgress(RoomEgress.directionKey.East, hall1, "to the east is the entrance hallway");
        RoomEgress bedRoomToHallTwo = new RoomEgress(RoomEgress.directionKey.East, hall2, "The door you came though leads back to the main hallway");
        RoomEgress playerRoomToHallTwo = new RoomEgress(RoomEgress.directionKey.South, hall2, "the door you came though leads back to the main hallway");
        RoomEgress bathToHallTwo = new RoomEgress(RoomEgress.directionKey.North, hall2, "to the north is back to the main hallway");
        
        //add egress's to their rooms
        patio.addRoomEgress(frontDoorEntrance);
        hall1.addRoomEgress(frontDoorExit);
        hall1.addRoomEgress(hallOneToLivingRoom);
        hall1.addRoomEgress(hallOneToHallTwo);
        livingRoom.addRoomEgress(livingToHallOne);
        livingRoom.addRoomEgress(livingToDinning);
        diningRoom.addRoomEgress(DinningToLiving);
        diningRoom.addRoomEgress(DinningToKitchen);
        kitchen.addRoomEgress(kitchenToHallTwo);
        kitchen.addRoomEgress(kitchenToDining);
        hall2.addRoomEgress(hallTwoToHallOne);
        hall2.addRoomEgress(hallTwoToKitchen);
        hall2.addRoomEgress(hallTwoToPlayerRoom);
        hall2.addRoomEgress(hallTwoToBath);
        playerRoom.addRoomEgress(bedRoomToHallTwo);
        bedRoom.addRoomEgress(bedRoomToHallTwo);
        bathRoom.addRoomEgress(bathToHallTwo);
        
        
        
        
       this.getHeldRooms().add(patio);
       this.getHeldRooms().add(hall1);
       this.getHeldRooms().add(livingRoom);
       this.getHeldRooms().add(diningRoom);
       this.getHeldRooms().add(kitchen);
       this.getHeldRooms().add(hall2);
       this.getHeldRooms().add(playerRoom);
       this.getHeldRooms().add(bedRoom);
       this.getHeldRooms().add(bathRoom);
       
       this.setStarterRoom(patio);
        
    }
    public void generateApartment(){
        
    } 
}
