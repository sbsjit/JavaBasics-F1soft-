/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.employee;

/**
 *
 * @author Shreejit
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager= new Manager("Ab Cd", 50000.0);
        manager.setBonus(5000);
        
        Staff staff[]=new Staff[3];
        staff[0] = manager;// Filling the staff array with the Manager object
        /*Makes use of the is-a substitution principle
          variable staff[0] and manager refers to the same object.
          However, staff[0] is considered only to be the object of Staff object 
          by the compiler.
          so, boss= setBonus(5000); OK
              staff[0] = setBonus(5000); ERROR
          Because, the declared type of the staff[0] is Staff, and the setBonus 
          method is not a method of the Staff Class.
]
        */
        
        staff[1] = new Staff("Raj", 23000.5);//with staff object
        staff[2] = new Staff("Hari", 28000.0);
        
        for(Staff s:staff){
            System.out.println("Name = "+ s.getName() + " Salary = " + s.getSalary());
        }
        
    }
}
