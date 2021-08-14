
package bussystem;

import static bussystem.frmbooks.tbltext2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Customer extends Person implements Reservation {

    @Override
    public void bookTicket(Ticket t,Vehicle b,Customer c) {
        try {
            Object  []Information2={t.getOne_wayOrRoundTrip(), t.getTripType(), t.getSource(), t.getDestination(), t.getDepdate(), t.getRetdate(), b.getGovehicletype(), b.getNum_Stop(), b.getTime(), b.getSeatnumber(), b.getPrice(), c.getFirstName(), c.getLastName(), c.getGender(), c.getNationality(), c.getDateoFBirth(), c.getPhone(), c.getAddress(), b.getRevehicletype(), b.getRetime(), b.getReseatnumber(), b.getReprice()};
            PrintWriter p;
            p = new PrintWriter("Booking\\"+t.getDepdate()+b.getTime()+b.getGovehicletype()+c.getPhone()+".txt");
            for (Object Information21 : Information2) {
                    p.println(Information21);
                }
                    p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmCusInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void CancelTicket(int ind,String gtime ,String gvehicle, String phone,String ddate,File folder,File folder1,File folder2) {
        DefaultTableModel model= (DefaultTableModel) tbltext2.getModel();
      File[] listOfFiles = folder.listFiles();           
        for (File file : listOfFiles) {
           if (file.isFile()) {
               try {
                   
                   if(file.getName().equals(ddate+gtime+gvehicle+phone+".txt")){
                      List<String> fileContent = new ArrayList<>(Files.readAllLines(file.toPath(), StandardCharsets.UTF_8));
                      frmbus.AddSeat(fileContent.get(8),fileContent.get(6),fileContent.get(9), folder1);
                          
                         if(!fileContent.get(5).equals("NoReturn")){
                             frmbus.AddSeat(fileContent.get(19),fileContent.get(18),fileContent.get(20), folder2);
                            }
                    file.delete();
                   }
               } catch (Exception ex) {
                   Logger.getLogger(frmdriver.class.getName()).log(Level.SEVERE, null, ex);
                   }
                 }
             }
        model.removeRow(ind);
  }

    @Override
    public void bookTicket(Ticket t, Vehicle b, Vehicle ret, Customer c) {
       try {
            Object  []Information2={t.getOne_wayOrRoundTrip(), t.getTripType(), t.getSource(), t.getDestination(), t.getDepdate(), t.getRetdate(), b.getGovehicletype(), b.getNum_Stop(), b.getTime(), b.getSeatnumber(), b.getPrice(), c.getFirstName(), c.getLastName(), c.getGender(), c.getNationality(), c.getDateoFBirth(), c.getPhone(), c.getAddress(), ret.getRevehicletype(), ret.getRetime(), ret.getReseatnumber(), ret.getReprice()};
            PrintWriter p;
            p = new PrintWriter("Booking\\"+t.getDepdate()+b.getTime()+b.getGovehicletype()+c.getPhone()+".txt");
            for (Object Information21 : Information2) {
                    p.println(Information21);
                }
                    p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmCusInfo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}

