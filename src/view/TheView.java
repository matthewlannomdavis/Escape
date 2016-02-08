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
            Object theListenedObject = event.getSource();
            Button aButton = null;
            if(theListenedObject instanceof Button){
                aButton = (Button)theListenedObject;
                parent.movePlayer(aButton.getText());
        }
            
        }
        
    }
    
    public TheView(TheGameEngine ge) {
        parent = ge;
        
        mainWindow = new JFrame("Escape");
        mainWindow.setSize(800, 800);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(false);
        descriptionPanel = new DescriptionPanel();
        buttonPanel = new ButtonPanel();
        statsPanel = new StatsPanel();
        mainWindow.getContentPane().add(BorderLayout.CENTER, descriptionPanel);
        mainWindow.getContentPane().add(BorderLayout.SOUTH, buttonPanel);
        mainWindow.getContentPane().add(BorderLayout.WEST, statsPanel); 
        buttonPanel.getNorthButton().addActionListener(new movementListener());
        mainWindow.validate();
        mainWindow.setVisible(true);
    }

    public void createScreen() {
        //holds a basic layout for the screen
        mainWindow.getContentPane().add(BorderLayout.CENTER, descriptionPanel);
        mainWindow.getContentPane().add(BorderLayout.SOUTH, buttonPanel);
        mainWindow.getContentPane().add(BorderLayout.WEST, statsPanel);
        mainWindow.validate();
    }
    
    public void basicButtonSet(){
        
        buttonPanel.addBasicButtons();
        
    }
    
    public void movementButtonSet(Room aRoom){
        
    }
    
    public void updateDescription(String description){
        descriptionPanel.updateText(description);
        
    }
    
    public void updatePlayerStats(){
        
    }
}
