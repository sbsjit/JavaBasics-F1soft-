/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basics.withLambdaExpression;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shreejit
 */
public class ForEachInLamdaExpression {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Hello");
        list.add("from");
        list.add("Nepal");
        list.forEach((n)->
                System.out.println(n)
        );
    }
}
