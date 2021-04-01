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

    protected ArrayList<Person> persons;

    public Bubble(ArrayList<Person> persons) {
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
        for(Person person: persons){
            System.out.println((i++) + ". Name: "+person.getName()+" Age: "+person.getAge()+" Gender: "+person.getGender());
        }
    }

}
