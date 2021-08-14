
package bussystem;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;


public class Limousine extends Vehicle{

    @Override
    public void AddSeats(JComboBox c1, JComboBox c2, JComboBox c3, File f1, File f2, File f3) {
        try {
            c1.removeAllItems();
            List<String> fileContent;
            fileContent = new ArrayList<>(Files.readAllLines(f1.toPath(), StandardCharsets.UTF_8));
             c1.addItem("select...");
            for (int i =0 ; i<fileContent.size() ; i++){
               c1.addItem(fileContent.get(i));
            }
            
           
           c2.removeAllItems();
           List<String> fileContent1 = new ArrayList<>(Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8));
            c2.addItem("select...");
           for (int i =0 ; i<fileContent1.size() ; i++){
               c2.addItem(fileContent1.get(i));
            }
            
        
            
            c3.removeAllItems();
            List<String> fileContent3 = new ArrayList<>(Files.readAllLines(f3.toPath(), StandardCharsets.UTF_8));
            c3.addItem("select...");
            for (int i =0 ; i<fileContent3.size() ; i++){
               c3.addItem(fileContent3.get(i));
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Minibus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
