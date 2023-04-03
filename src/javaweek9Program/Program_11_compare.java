package javaweek9Program;

import java.util.ArrayList;
/*
Declare following two arraylist and compare it.
ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink");
 */
public class Program_11_compare {
    public static void main(String[] args) {  //main method
        compareArray(); //static method calling
    }

    public static void compareArray(){ //Static method
        ArrayList <String> c1 = new ArrayList<>(); //Arraylist 1
        c1.add("Red"); //add element in to array list 1
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<>(); //Array list 2
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        ArrayList<String> c3 = new ArrayList<>(); //Arraylist declaration for compare two array
        for (String c: c1) {
            c3.add(c2.contains(c) ? "Yes" : "No" ); //Compare between two Arraylist
        }
        System.out.println(c3); //Print statement
    }

}
