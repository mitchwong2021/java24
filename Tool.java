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
public class Tool extends JFrame{
    public Tool() {
        super("Tool");
        setLookAndFeel();
        setSize(370, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //build toolbar buttons
        ImageIcon image1 = new ImageIcon("11051758_1160160194010231_1437363953517738462_n.jpg");
        JButton button1 = new JButton(image1);
        ImageIcon image2 = new ImageIcon("11051758_1160160194010231_1437363953517738462_n.jpg");
        JButton button2 = new JButton(image2);
        ImageIcon image3 = new ImageIcon("11051758_1160160194010231_1437363953517738462_n.jpg");
        JButton button3 = new JButton(image3);
        
        //build toolbar 
        JToolBar bar = new JToolBar();
        bar.add(button1);
        bar.add(button2);
        bar.add(button3);
        
        //build text area
        JTextArea edit = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(edit);
        
        //create frame
        BorderLayout border = new BorderLayout();
        setLayout(border);
        add("North", bar);
        add("Center", scroll);
        setVisible(true);
    
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc){
            //ignore
        }
        
    }
    public static void main(String[] arguments){
        Tool frame = new Tool();
    }
    
}
