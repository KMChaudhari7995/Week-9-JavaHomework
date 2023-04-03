package javaweek9Program;
/*
Write a Java program to iterate through all elements in an array list using Iterator
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Program_5_ArraylistIterator {
    public static void main(String[] args) { //main method
        useIterator(); //static method calling
    }
    public static void useIterator() {
        ArrayList<String> list = new ArrayList(); //Arraylist declaration
        list.add("Java"); //Array list adding
        list.add("Python");
        list.add("SQL");
        list.add("C++");
        list.add("C#");
        Iterator language = list.iterator(); //use of iterator
        while (language.hasNext()){ //use of while
            System.out.println(language.next()); //print statement
        }
    }
}