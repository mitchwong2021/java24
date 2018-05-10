/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author mitchellwong
 */
public class KeyViewer extends JFrame implements KeyListener{
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text field.");
    
    public KeyViewer() {
        super("KeyViewer");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(this);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }
    
    public void keyTyped(KeyEvent input) {
        char key = input.getKeyChar();
        keyLabel.setText("You pressed " + key);
    }
    
    public void keyPressed(KeyEvent txt) {
       
    }
    
    public void keyReleased(KeyEvent txt) {
       
    }
    
    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc){
            
        }
    }
    
    public static void main(String[] args){
        KeyViewer prog = new KeyViewer();
    }
    
}
