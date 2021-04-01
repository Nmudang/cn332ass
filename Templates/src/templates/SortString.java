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
public class SortString extends Bubble {

    public SortString(ArrayList<Object> persons) {
        super(persons);
    }

    @Override
    // s1 > s2 return 1
    public int compareTo(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        try {
            Integer.parseInt(s1);
            Integer.parseInt(s2);
            if (Integer.parseInt(s1) > Integer.parseInt(s2)) {
                return 1;
            } else {
                return 0;
            }
        } catch (NumberFormatException e) {
            int len = Math.min(s1.length(), s2.length());
            for (int i = 0; i < len; i++) {
                int c1 = (int) s1.charAt(i);
                int c2 = (int) s2.charAt(i);
                if (c1 > c2) {
                    return 1;
                } else if (c1 < c2) {
                    return -1;
                }
            }
            return 0;
        }
    }

    @Override
    public void sortAge() {
        for (int i = 0; i < persons.size() - 1; i++) {
            for (int j = 0; j < persons.size() - 1 - i; j++) {
                Class p = persons.get(j).getClass();
                for (Field f : p.getDeclaredFields()) {
                    f.setAccessible(true);
                    try {
                        if (f.getName().contains("age")) {
                            if (compareTo(f.get(persons.get(j)), f.get(persons.get(j + 1))) == 1) {
                                Collections.swap(persons, j, j + 1);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("");
                    }
                }
            }
        }
    }

    @Override
    public void sortName() {
        for (int i = 0; i < persons.size() - 1; i++) {
            for (int j = 0; j < persons.size() - 1 - i; j++) {
                Class p = persons.get(j).getClass();
                for (Field f : p.getDeclaredFields()) {
                    f.setAccessible(true);
                    try {
                        if (f.getName().contains("name")) {
                            if (compareTo(f.get(persons.get(j)), f.get(persons.get(j + 1))) == 1) {
                                Collections.swap(persons, j, j + 1);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("");
                    }
                }
            }
        }

    }
}
