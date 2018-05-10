/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.nio.file.*;
import javax.swing.*;
/**
 *
 * @author mitchellwong
 */
public class FreeSpacePanel extends JPanel{
    JLabel spaceLabel = new JLabel("Disk Space: ");
    JLabel space = new JLabel();
    
    public FreeSpacePanel(){
        super();
        add(spaceLabel);
        add(space);
        try {
            setValue();
        } catch (IOException ioe) {
            space.setText("Error");
        }
    }
    
    private final void setValue() throws IOException {
        //get current file storage pool
        Path current = Paths.get("");
        FileStore store = Files.getFileStore(current);
        //find free storage space
        long totalSpace = store.getTotalSpace();
        long freeSpace = store.getUsableSpace();
        //get this as a percentage(with 2 digits)
        double percent = (double)freeSpace / (double)totalSpace * 100;
        percent = (int)(percent * 100) / (double)100;
        //set label's text
        space.setText(freeSpace + " free out of " + totalSpace + " (" + 
                percent + "%)");
    }
}
