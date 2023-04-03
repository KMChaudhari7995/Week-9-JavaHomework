package javaweek9Program;
/*
Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Program_4_addArray {

    public static void main(String[] args) { //main method
        Program_4_addArray obj = new Program_4_addArray();    //instance method calling
        obj.colorAdd();

    }
        public void colorAdd(){ //instance method
            ArrayList<String> list = new ArrayList(); //Arraylist declaration
            list.add("Red"); //Array list adding
            list.add("BLue");
            list.add("Pink");
            list.add("Yellow");
            list.add("White");
           // System.out.println("Before Adding colors Arraylist :"+list);
            for (String colorName  :list) { //For -each loop
                System.out.println(colorName); //print statement
            }
        }
}
