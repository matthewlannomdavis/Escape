package view;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;


public class TheView {
    JFrame mainWindow;
    private StatsPanel statsPanel;
    private ButtonPanel buttonPanel; 
    private BagPanel bagPanel;
    private ProgressPanel progressPane;
    private DescriptionPanel descriptionPanel;
    
    
    
    public TheView(){
       mainWindow = new JFrame("Escape");
       mainWindow.setSize(600, 800);
       mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       descriptionPanel = new DescriptionPanel();
       buttonPanel = new ButtonPanel();
       statsPanel = new StatsPanel();
       //this is for nothing
       mainWindow.getContentPane().add(BorderLayout.CENTER, descriptionPanel);
       mainWindow.getContentPane().add(BorderLayout.SOUTH, buttonPanel);
       mainWindow.getContentPane().add(BorderLayout.WEST, statsPanel);
       
    }
    
}
