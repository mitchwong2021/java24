/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author mitchellwong
 */
public class TableFrame extends JFrame{
    
    public TableFrame(){
        
        super("Table Frame");
        String[] columnLabels = { "First Name", "Last Name", 
            "Job", "Age" };
        
        Object [][] tableData = {
            { //row 1
              "Frankie", "Heck", "dental hygienist", 50  
            },
            { //row 2
                "Mitchell", "Wong", "wanker", 15
            }, 
            { //row 3
                "Chris", "Brown", "Beater", 40
            },
            { //row 4
                "Jack", "Hoffalot", "Biologist", 21
            }, 
            {
                "Master", "Bates", "Pharmacist", 93
            }
        };
        JTable table = new JTable(tableData, columnLabels);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        add(scrollPane);
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] arguments){
        TableFrame frame = new TableFrame();
    }
}
