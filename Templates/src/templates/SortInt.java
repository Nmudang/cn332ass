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
public class SortInt extends Bubble {

    public SortInt(ArrayList<Person> persons) {
        super(persons);
    }

    @Override
    // i1 > i2 return 1
    public int compareTo(Object o1, Object o2) {
        Integer i1 =  (Integer)o1;
        Integer i2 =  (Integer)o2;
        return i1.compareTo(i2);
    }

   

}
