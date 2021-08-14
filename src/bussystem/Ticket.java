
package bussystem;


public class Ticket {
   private String One_wayOrRoundTrip;
   private Object tripType;
   private Object Source;
   private Object Destination;
   private String Depdate;
   private String Retdate;

    public String getOne_wayOrRoundTrip() {
        return One_wayOrRoundTrip;
    }

    public void setOne_wayOrRoundTrip(String One_wayOrRoundTrip) {
        this.One_wayOrRoundTrip = One_wayOrRoundTrip;
    }

    public Object getTripType() {
        return tripType;
    }

    public void setTripType(Object tripType) {
        this.tripType = tripType;
    }

    public Object getSource() {
        return Source;
    }

    public void setSource(Object Source) {
        this.Source = Source;
    }

    public Object getDestination() {
        return Destination;
    }

    public void setDestination(Object Destination) {
        this.Destination = Destination;
    }

    public String getDepdate() {
        return Depdate;
    }

    public void setDepdate(String Depdate) {
        this.Depdate = Depdate;
    }

    public String getRetdate() {
        return Retdate;
    }

    public void setRetdate(String Retdate) {
        this.Retdate = Retdate;
    }
   
   
}
