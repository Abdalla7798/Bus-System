/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussystem;

import java.io.File;

/**
 *
 * @author hp-
 */
public interface ManagerWorks {
    public void DeleteDriver(String first,String last, int ind, File folder);
    public void AddDriver(Driver r);
    public void CancelAllTrip(String ddate,String gtime,String gvehicle,String from,String to,File folder,File folder1,File folder2);
}
