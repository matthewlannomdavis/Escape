package view;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import model.Room;
import controller.TheGameEngine;
import java.awt.event.*;

public class TheView {
    private TheGameEngine parent;
    
    JFrame mainWindow;
    private StatsPanel statsPanel;
    private ButtonPanel buttonPanel; 
    private BagPanel bagPanel;
    private ProgressPanel progressPane;
    private DescriptionPanel descriptionPanel;



    class movementListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("movementlistenerCalled");
            Object theListenedObject = event.getSource();
            Button aButton = null;
            if(theListenedObject instanceof Button){
                aButton = (Button)theListenedObject;
                System.out.println(aButton.getText());
                parent.movePlayer(aButton.getAttachedRoom());
            }    
        }      
    }
    class moveButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            parent.callMoveSet();
        }
    }
    class objectObservedListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Object theListenedObject = event.getSource();
            Button aButton = null;
            if(theListenedObject instanceof Button){
                aButton = (Button)theListenedObject;
                System.out.println(aButton.getText());
                parent.displayObservedObject(aButton.getGameObject());
        }
       }      
    }
    class newGameListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            parent.startNewGame();
        }
    }
    class loadGameListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            parent.loadGameCall();
        }
    }
    class gameOptionsListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            parent.optionsCall();
        }
    }
    class lookAroundButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            parent.callRoomsObjects();
        }
    }
    public TheView(TheGameEngine ge) {
        parent = ge;
        
        mainWindow = new JFrame("Escape");
        mainWindow.setSize(800, 800);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mainWindow.setResizable(false);
        descriptionPanel = new DescriptionPanel();
        buttonPanel = new ButtonPanel();
        statsPanel = new StatsPanel(); 
        
       
    }

    public void mainScreen() {
        //clear screen
       
        mainWindow.getContentPane().removeAll();
        //holds a basic layout for the screen
        mainWindow.getContentPane().add(BorderLayout.CENTER, descriptionPanel);
        mainWindow.getContentPane().add(BorderLayout.SOUTH, buttonPanel);
        mainWindow.getContentPane().add(BorderLayout.WEST, statsPanel); 
        buttonPanel.getNorthButton().addActionListener(new movementListener());
        buttonPanel.getEastButton().addActionListener(new movementListener());
        buttonPanel.getSouthButton().addActionListener(new movementListener());
        buttonPanel.getWestButton().addActionListener(new movementListener());
        buttonPanel.getOtherButton().addActionListener(new movementListener());
        buttonPanel.getClimbButton().addActionListener(new movementListener());
        buttonPanel.getMoveButton().addActionListener(new moveButtonListener());
        mainWindow.validate();
        mainWindow.setVisible(true);
    }
    public void titleScreenCall(){
        mainWindow.getContentPane().removeAll();
        //add image to cent of screen
        
        //add buttons to start the game here
        buttonPanel.getNewGame().addActionListener(new newGameListener());
        buttonPanel.getLoadGame().addActionListener(new loadGameListener());
        buttonPanel.getGameOptions().addActionListener(new gameOptionsListener());
        mainWindow.getContentPane().add(BorderLayout.SOUTH, buttonPanel);
        buttonPanel.mainMenuButtons();
        mainWindow.validate();
        mainWindow.setVisible(true);
        System.out.println("at the end of views create title screen");
       
    }
    public void basicButtonSet(){
        
        buttonPanel.addBasicButtons();
        
    }
    
    public void movementButtonSet(Room aRoom){
        
        for(int x = 0; x < aRoom.getAdjacentRooms().size(); x++){
            descriptionPanel.updateText(aRoom.getAdjacentRooms().get(x).getEgressDescriptionText());
        }
        buttonPanel.movementButtons(aRoom);
    }
     public void roomObjectButtonSet(Room currentRoom) {
        buttonPanel.roomObjectsButtons(currentRoom);
    }
    public void updateDescription(String description){
        descriptionPanel.updateText(description);    
    }
    public void updatePlayerStats(){
        //updates player states with anychanges will need to be called often
    }
    public void opening() {
        
    }
}
