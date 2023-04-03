package javaweek9Program;
/*
Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Program_7_emptyOrNot {

    public static void main(String[] args) {                //main method
       Program_7_emptyOrNot obj = new Program_7_emptyOrNot();
       obj.emptyOrNot();
    }

        public void emptyOrNot(){
            ArrayList<String> list = new ArrayList();           //declare array list
            list.add("BMW");                                    //Add element in list
            list.add("Audi");
            list.add("Jaguar");
            list.add("Rang Rover");
            list.add("Lamborghini");
            System.out.println("First Array list :" + list);                            //Print statement
            System.out.println("Checking list is empty or not: " + list.isEmpty());     //print statement list is empty
            list.removeAll(list);
            System.out.println("After remove all element :" + list);
            System.out.println("Checking the above list is empty or :" + list.isEmpty());
        }

}
