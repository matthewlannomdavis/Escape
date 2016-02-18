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
        Room playersRoom = new Room(playerName + "'s Room", "You believe this is your room, but somehow it's not. The room is covered in posters of things you've made"
                + "achievments of yours and pictures you liked. Standing in the room feels wrong as much as it feels right. IS this a sanctury or a prison");
        Room bedRoom = new Room("unknown", "A bedroom.....yes...no...It looks to be a bedroom, but it holds something more. Standing in the room makes you feel alone"
                + " and sad. The room hold a bed that hasn't been made in some time. Only had of the bed is covered in a pillow and cover. Theres a dresser with a mirror, and "
                + "two side tables. Nothing is right here");
        //add room egresses
    }
    public void generateApartment(){
        
    } 
}
