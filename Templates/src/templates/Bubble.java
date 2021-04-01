/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
abstract class Bubble {

    protected ArrayList<Object> persons;

    public Bubble(ArrayList<Object> persons) {
        this.persons = persons;
        sortAge();
        sortName();
        printPerson();
    }

    public abstract int compareTo(Object o1, Object o2);
    public abstract void sortAge();
    public abstract void sortName();
    public void printPerson() {
        int i = 1;
        for (Object person : persons) {
            Class p = person.getClass();
            for (Field f : p.getDeclaredFields()) {
                f.setAccessible(true);
                try {
                    System.out.print(f.getName() + ": " + f.get(person) + " ");
                } catch (Exception e) {
                    System.out.println("");
                }
            }
            System.out.println("");

        }
    }

}
