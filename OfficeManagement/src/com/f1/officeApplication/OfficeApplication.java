/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.officeApplication;

import com.f1.officeApplication.model.Admin;
import com.f1.officeApplication.model.Employee;
import com.f1.officeApplication.model.FinanceDepartmentStaff;
import com.f1.officeApplication.model.ITTechnician;

/**
 *
 * @author Shreejit
 */
public class OfficeApplication {
    public static void main(String[] args) {
        Employee admin = new Admin( 1, "Hari" , "Manager", 100000.0);
        System.out.println(admin);
        admin.showDetails();
        Employee admin2 = new Admin( 2, "Ronak" , "Assistant Manager", 80000.0);
        System.out.println(admin2);
        admin2.showDetails();
        System.out.println("==============================================");
        Employee itEmployee = new ITTechnician( 1, "Ram" , "Android Developer", 
            50000.0, "Internet Banking", "Java");
        System.out.println(itEmployee);
        itEmployee.showDetails();
        System.out.println("==============================================");
        Employee financeStaff = new FinanceDepartmentStaff( 1, "Som" , "Sr. Accountant", 
            45000.0, "Masters in Accounting", "2485-855");
        System.out.println(financeStaff);
        financeStaff.showDetails();
    }
}
