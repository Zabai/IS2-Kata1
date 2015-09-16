package person;


import java.util.Date;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Person {
    private final String name;
    private final String surname;
    private final Date birthday;

    public Person(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getFullName(){
        return (name + " " + surname);
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
       Date today = new Date();
       return (int) ((today.getTime() - birthday.getTime())/(1000*60*60*24*365.25));
    }
    
}
