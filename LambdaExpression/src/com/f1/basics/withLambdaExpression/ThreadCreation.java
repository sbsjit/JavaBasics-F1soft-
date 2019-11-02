/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basics.withLambdaExpression;

/**
 *
 * @author Shreejit
 */


public class ThreadCreation {
    
    public static void main(String[] args) {
        //Thread Example without lambda  
        Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("Thread 1 is running...");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();  
        /* Thread creation using Lambda Expression */
        Runnable r2=()->{  
                System.out.println("Thread 2 is running...");  
        };  
        Thread t2=new Thread(r2);  
        t2.start();  
    }  
    }
    
}
