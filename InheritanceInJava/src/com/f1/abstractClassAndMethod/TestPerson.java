/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.abstractClassAndMethod;

/**
 *
 * @author Shreejit
 */
public class TestPerson {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        //filling the peoples array with the student and employee objects
        people[0] = new Student("Shyam", "Marketing");
        people[1] = new Employee("Hari", 40000.0);
           
        for(Person p: people){
            System.out.println(p.getName()+ " :: " + p.getDescription());
        }
    }
}
