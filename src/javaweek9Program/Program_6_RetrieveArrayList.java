package javaweek9Program;
/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Program_6_RetrieveArrayList {
    public static void main(String[] args) {        //main method
        Program_6_RetrieveArrayList obj = new Program_6_RetrieveArrayList();        //create object
        obj.specificIndex(); //calling instance method
    }
    public void specificIndex(){ //instance method
        ArrayList <String> list = new ArrayList<>(); //declaration of arraylist
        list.add("India"); //add value in array list
        list.add("United Kingdom");
        list.add("Canada");
        list.add("Australia");
        list.add("USA");

        Iterator<String> countryName =list.iterator(); //iterator
        while (countryName.hasNext()){
            System.out.println(countryName.next());
        }

        System.out.println("The value of 1st index :"+list.get(1)); //print statement for specific value
        System.out.println("The value of 2nd index :"+list.get(2));
        System.out.println("The value of 0 index :"+list.get(0));
    }

}
