/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TemplatesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // fix getName and getAge String type
        Person p1 = new Person("Kim Teayeon","27","Female");
        Person p2 = new Person("Kim Mingyu","25","Male");
        Person p3 = new Person("Jeon Wonwoo","26","Male");
        Person p4 = new Person("Jeon Wonmeow","26","Female");
        Person p5 = new Person("Kwon Soonyong","26","Male");
        Person p6 = new Person("Shon Seung-wan","27","Female");
        
        ArrayList<Person> persons =  new ArrayList<Person>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
    SortString s = new SortString(persons);
    }
    
}
