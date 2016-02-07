package view;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import model.Room;


public class TheView {
    JFrame mainWindow;
    private StatsPanel statsPanel;
    private ButtonPanel buttonPanel; 
    private BagPanel bagPanel;
    private ProgressPanel progressPane;
    private DescriptionPanel descriptionPanel;
    
    
    
    public TheView(){
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
       
       mainWindow.validate();
       mainWindow.setVisible(true);
    }
    public void createScreen(){
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
    public void updatePlayerStates(){
        
    }
}
