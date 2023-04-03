package javaweek9Program;
/*
Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map
 */

import java.util.HashMap;
import java.util.Map;

public class Program_9_Map {

    public static void main(String[] args) { //main method
        hashmap(); //static method
    }

    public static void hashmap(){ //static method
        HashMap<String,Integer> map = new HashMap<>(); //HashMap declaration
        map.put("Mish",1); //adding element to map
        map.put("Smit",2);
        map.put("Khushi",3);
        map.put("Mihir",4);
        map.put("Harsh",5);
        map.put("Shiven",6);

        //logic for iterating from map
        for (Map.Entry<String,Integer> people: map.entrySet()) { //for each loop
            System.out.println(people.getKey() + " " + people.getValue());  //print statement
        }




    }
}
