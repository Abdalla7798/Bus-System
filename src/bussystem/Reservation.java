
package bussystem;

import java.io.File;


public interface Reservation {
    public void bookTicket(Ticket t,Vehicle b,Customer c);
    public void CancelTicket(int ind,String gtime ,String gvehicle, String phone,String ddate,File folder,File folder1,File folder2);
    public void bookTicket(Ticket t,Vehicle b,Vehicle ret,Customer c);
}
