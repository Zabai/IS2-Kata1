/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class MainClass {
    public static void main(String[] args) {
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1995, 8, 3);
        Person p1 = new Person("Zabai", "Armas Herrera", f1);
        System.out.println("Nombre de P1: " + p1.getFullName());
        System.out.println("Edad de P1: " + p1.getAge() + " años");
    }
}
