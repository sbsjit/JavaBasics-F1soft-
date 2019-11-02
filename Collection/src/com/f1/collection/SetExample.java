/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Shreejit
 */
public class SetExample {
    public static void main(String[] args) {
       Student s1 = new Student(1, "Hari");
       Student s2 = new Student(2, "Ram");
       Student s3 = new Student(1, "Hari");
       
       
       List<Student> list = new ArrayList<>();
       list.add(s1);
       list.add(s2);
       list.add(s3);
       
       Set<Student> set =  new HashSet<>(list);
//       set.add(s3);
//       set.add(s1);
       System.out.println(set.toString());
       
       
       
    }
}
