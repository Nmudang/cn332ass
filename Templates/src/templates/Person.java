/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates;

/**
 *
 * @author User
 */
public class Person {
    private String name;
    private String ages;
    private String gender;
    
    public Person(String name,String ages,String gender){
        this.name = name;
        this.ages = ages;
        this.gender = gender.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return ages;
    }

    public String getGender() {
        return gender;
    }
    
    
    
}
