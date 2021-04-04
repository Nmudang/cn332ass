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
    public void setBubble(ArrayList<Person> persons){
        this.persons = persons;
        sortAge();
        sortName();
        printPerson();
    }

    public abstract int compareTo(Object o1, Object o2);
    public void sortAge(){
        {
            for (int i = 0; i < persons.size() - 1; i++) {
                for (int j = 0; j < persons.size() - 1 - i; j++) {
                    if (compareTo(persons.get(j).getAge(), persons.get(j + 1).getAge()) == 1) {
                        Collections.swap(persons, j, j + 1);
                    }
                }
            }
        }
    }
    public void sortName()  {
        
        for (int i = 0; i<persons.size()-1; i++){
            for(int j = 0; j < persons.size() -1-i; j++){
                if(compareTo(persons.get(j).getName().toLowerCase(),persons.get(j+1).getName().toLowerCase()) == 1)
                    if (persons.get(j).getAge() == persons.get(j+1).getAge())
                        Collections.swap(persons, j, j+1);
            }
        }
    }
    public void printPerson() {
        int i = 1;
        for(Person person: persons){
            System.out.println((i++) + ". Name: "+person.getName()+" Age: "+person.getAge()+" Gender: "+person.getGender());
        }
    }

}
