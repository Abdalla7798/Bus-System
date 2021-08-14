/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussystem;

import java.io.File;
import javax.swing.JComboBox;

/**
 *
 * @author hp-
 */
public abstract class Vehicle {
    private Object Govehicletype;
    private String num_Stop;
    private String time;
    private Object seatnumber;
    private Object price;
    private Object Revehicletype;
    private String Retime;
    private Object Reseatnumber;
    private Object Reprice;
    
    public abstract void AddSeats(JComboBox c1,JComboBox c2,JComboBox c3,File f1,File f2,File f3);

    public Object getGovehicletype() {
        return Govehicletype;
    }

    public void setGovehicletype(Object Govehicletype) {
        this.Govehicletype = Govehicletype;
    }

    public String getNum_Stop() {
        return num_Stop;
    }

    public void setNum_Stop(String num_Stop) {
        this.num_Stop = num_Stop;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Object getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(Object seatnumber) {
        this.seatnumber = seatnumber;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public Object getRevehicletype() {
        return Revehicletype;
    }

    public void setRevehicletype(Object Revehicletype) {
        this.Revehicletype = Revehicletype;
    }

    public String getRetime() {
        return Retime;
    }

    public void setRetime(String Retime) {
        this.Retime = Retime;
    }

    public Object getReseatnumber() {
        return Reseatnumber;
    }

    public void setReseatnumber(Object Reseatnumber) {
        this.Reseatnumber = Reseatnumber;
    }

    public Object getReprice() {
        return Reprice;
    }

    public void setReprice(Object Reprice) {
        this.Reprice = Reprice;
    }
    
    
}
