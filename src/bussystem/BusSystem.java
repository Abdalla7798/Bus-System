
package bussystem;

import java.io.File;

public class BusSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File f=new File("Booking");
        if(!f.exists()){
            f.mkdir();
        }
        File f1=new File("GoingSeats");
        if(!f1.exists()){
            f1.mkdir();
        }
        File f2=new File("ReturnSeats");
        if(!f2.exists()){
            f2.mkdir();
        }
        File f3=new File("DriverInfo");
        if(!f3.exists()){
            f3.mkdir();
        }
        frmadmin d = new frmadmin();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }
    
}
