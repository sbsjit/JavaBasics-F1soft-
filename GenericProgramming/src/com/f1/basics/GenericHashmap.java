/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basics;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Shreejit
 */
public class GenericHashmap {
    
    public static void main(String[] args) {
        
        Map hm=new HashMap();
	//obj.put(key,value);
        hm.put("Employee1", 35000.68);
	hm.put("Employee2", true);
	hm.put(3, "Shreejit");
	/*Unlike list we dont need to use loop to 
	  fetch the value; instead we use key*/
	System.out.println(hm.get("Employee1"));
	System.out.println(hm.get("Employee2"));
	System.out.println(hm.get(3));
        
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "F1Soft");
        map.put(2, "International");
        map.put(3, "Pvt");
        map.put(4, "Ltd");
        //map.put("dafg", 1);//Compile time Error
        System.out.println(map);
        
    }
    
}
