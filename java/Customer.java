/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Customer {
    private ArrayList<ICustom> custom;
    WriteLogFile log;
    GoogleFile google;
    public Customer() throws IOException, GeneralSecurityException{
        custom = new ArrayList<ICustom>(); 
        log = new WriteLogFile();
        google = new GoogleFile();
        
    }
    public void add(ICustom name) throws IOException, GeneralSecurityException{
        custom.add(name);
        System.out.println("add" + name.getName());
        log.wirte("add " + name.getName());
        google.write("add " + name.getName());
        
        
    }
    public void editCus(ICustom name) throws IOException, GeneralSecurityException{
        System.out.println("editCus");
        log.wirte("edit " +name.getBefor() + " to "+name.getName());
        google.write("edit " +name.getBefor() + " to "+name.getName());
    }

    public void saveGoogle(String name){
        System.out.println("saveGoogle" + name);
    }
    public void notifyCus(){
         for (ICustom i : custom) {
            i.notifytoCus();
         }
    }
}
