package javaweek9Program;
/*
Write a Java program to reverse an array of integer values.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Program_3_reverse {
    public static void main(String[] args) {                                //main method
        reverseArray();//static method
    }

    public static void reverseArray(){
        ArrayList<Integer> list = new ArrayList();                           //Array list declaration
        list.add(10);                                                  //Add element in list
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Before the Reverse:" + list);           //print statement
        Collections.reverse(list);
        System.out.println("After reverse of element :" + list);

    }



}

