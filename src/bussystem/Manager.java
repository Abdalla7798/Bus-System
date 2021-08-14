
package bussystem;

import static bussystem.frmdriver.tbltext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Manager implements ManagerWorks {

    @Override
    public void DeleteDriver(String first, String last, int ind, File folder) {
       DefaultTableModel model= (DefaultTableModel) tbltext.getModel();
        File[] listOfFiles = folder.listFiles();
        model.removeRow(ind);
        for (File file : listOfFiles) {
           if (file.isFile()) {
               if (file.getName().equals(first+last+".txt")){
                  try {
                 if(file.delete())
                  {
                   JOptionPane.showMessageDialog(null,"Driver deleted successfully");
                  }
                 else
                  {
                   JOptionPane.showMessageDialog(null,"Failed to delete the Driver");
                  }  
                } 
                catch (Exception ex) {
                   Logger.getLogger(frmdriver.class.getName()).log(Level.SEVERE, null, ex);
                 } 
           }
        }
     } 
    }

    @Override
    public void AddDriver(Driver r) {
        DefaultTableModel model= (DefaultTableModel) tbltext.getModel();
        Object []driInfo={r.getFirstName(), r.getLastName(), r.getGender(), r.getNationality(), r.getDateoFBirth(), r.getPhone(), r.getAddress()};
        try {
            PrintWriter p =new PrintWriter("DriverInfo\\"+r.getFirstName()+r.getLastName()+".txt");
            for(Object j :driInfo){
                p.println(j);
            }
            p.close();
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmdriver.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addRow(driInfo);
    }

    @Override
    public void CancelAllTrip(String ddate, String gtime, String gvehicle, String from, String to, File folder, File folder1, File folder2) {
      int temp=0;
        File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    
                    if(file.getName().contains(ddate+gtime+gvehicle)){
                        try {
                            List<String> fileContent = new ArrayList<>(Files.readAllLines(file.toPath(), StandardCharsets.UTF_8));
                            if (fileContent.get(2).equals(from)&&fileContent.get(3).equals(to)){
                                temp=1;
                                frmbus.AddSeat(fileContent.get(8),fileContent.get(6) ,fileContent.get(9), folder1);
                             
                         if(!fileContent.get(5).equals("NoReturn")){
                            frmbus.AddSeat(fileContent.get(19),fileContent.get(18) ,fileContent.get(20), folder2);
                            
                            } 
                            file.delete();
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(frmbooks.class.getName()).log(Level.SEVERE, null, ex);
                        }
                      
                     }
                  }
          }
            if(temp==1){
               JOptionPane.showMessageDialog(null, "Trip is deleted successfully..."); 
            }
            else{
               JOptionPane.showMessageDialog(null, "No trip can be deleted for this information...");  
            } 
    }
    
}
