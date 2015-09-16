/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class MainClass {
    public static void main(String[] args) {
        Person p1 = new Person("Jason", "Hernandez", new Date(64, 7, 3));
        System.out.println("Nombre de P1: " + p1.getFullName());
        System.out.println("Edad de P1: " + p1.getAge() + " años");
    }
}
