/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author mitchellwong
 */
public class Crisis extends JFrame{
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;
    
    public Crisis(){
        super("Crisis");
        setLookAndFeel();
        setSize(348, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //FlowLayout flo = new FlowLayout();        //resizable layout
        //setLayout(flo);
        //GridLayout grid = new GridLayout(2,3);    //2 rows, 3 columns
        //setLayout(grid);
        BorderLayout crisislayout = new BorderLayout(); //place buttons in 5 directions
        setLayout(crisislayout);
        
        panicButton = new JButton("Panic");
        dontPanicButton = new JButton("Don't Panic");
        blameButton = new JButton("Blame others");
        mediaButton = new JButton("Notify the Media");
        saveButton = new JButton("Save Yourself");
        add(panicButton);
        add(dontPanicButton);
        add(blameButton);
        add(mediaButton);
        add(saveButton);
        
        //for stacking buttons
        JPanel pane = new JPanel();
        BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
        pane.setLayout(box);
        pane.add(panicButton);
        pane.add(dontPanicButton);
        pane.add(blameButton);
        pane.add(mediaButton);
        pane.add(saveButton);
        add(pane);
        
        /*
        add(panicButton, BorderLayout.NORTH);   //used with BorderLayout
        add(mediaButton, BorderLayout.WEST);
        add(saveButton, BorderLayout.CENTER);
        add(blameButton, BorderLayout.EAST);
        add(dontPanicButton, BorderLayout.SOUTH);
        */
                
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc){
            
        }
    }
    
    public static void main(String[] args){
        Crisis frame = new Crisis();
    }
}
