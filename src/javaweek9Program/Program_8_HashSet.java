package javaweek9Program;

import java.util.HashSet;

/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets. Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Program_8_HashSet {
    public static void main(String[] args) {        //main method
        Program_8_HashSet obj = new Program_8_HashSet(); //object creation
        obj.numberHashSet();
    }

    public void numberHashSet() { //instace method

        HashSet<Integer> set = new HashSet<>(); //create hashset
        set.add(4);// adding element to hashset
        set.add(7);
        set.add(8);
        set.add(10);
        set.add(11);
        set.add(9);
        System.out.println("Print the number between 1 to 10:"); //print statement
        for (Integer number :set) { //for each loop
            if(number>=1 && number<=10){
                System.out.print(number +","); //print statement
            }

        }


    }


}
