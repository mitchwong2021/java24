/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author mitchellwong
 */
public class SalutonFrame extends JFrame{   //contains nothing
    public SalutonFrame(){
        super("Saluton mondo!");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            
        }
    }
    
    public static void main(String[] arguments){
        SalutonFrame box = new SalutonFrame();
    }
}
