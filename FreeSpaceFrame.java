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
public class FreeSpaceFrame extends JFrame {
    public FreeSpaceFrame(){
        super ("Disk Free Space");
        setLookAndFeel();
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        FreeSpacePanel freePanel = new FreeSpacePanel();
        add(freePanel);
        setVisible(true);
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            
        }
    }
    
    public static void main(String[] args){
        FreeSpaceFrame box = new FreeSpaceFrame();
    }
}
