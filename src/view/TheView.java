package view;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;


public class TheView {
    JFrame mainWindow;
    //Button start, load, options, save;
    Button move, search, bag; 
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
       
       
       
       move = new Button("Move");
       search = new Button("search");
       bag = new Button("Bag");

       
    }
    
}
