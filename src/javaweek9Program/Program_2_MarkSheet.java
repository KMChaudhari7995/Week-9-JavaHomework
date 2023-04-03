package javaweek9Program;
/*
 Rewrite the student mark sheet programme (From java-homework-week3 programmes) using if else and while loop
 */

import java.util.Scanner;

public class Program_2_MarkSheet {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // scanner class declared and scan object created for input
        System.out.println("Enter the student name: ");
        String sName = scan.nextLine(); //input
        System.out.println("Enter the student roll number:");
        int sRollNumber=scan.nextInt();//input
        System.out.println("Enter the Math's marks:");

        int mathsMarks = scan.nextInt();//input
        while(mathsMarks<0 || mathsMarks>=100)
        {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Enter the valid marks");
            mathsMarks = scan.nextInt();

        }
        System.out.println("Enter the Science's marks:");
        int scienceMarks = scan.nextInt();
        while(scienceMarks<0 || scienceMarks>=100)
        {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Enter the valid marks");
            scienceMarks = scan.nextInt();
        }

        System.out.println("Enter the English's marks:");
        int englishMarks = scan.nextInt();
        while(englishMarks<0 || englishMarks>=100)//Ask again till you not correct enter value
        {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Enter the valid marks");
            englishMarks = scan.nextInt();
        }
        Program_2_MarkSheet obj = new Program_2_MarkSheet(); // obj object created to call the instance method
        obj.markSheet(sName,sRollNumber,mathsMarks,scienceMarks,englishMarks); // calling instance method
        scan.close();

    }
    public void markSheet(String name,int rollNumber,int maths,int science,int english ) //declaring instance method
    {

        int total = maths + science +english; // calculating the total marks of all 3 subject
        double percentage = (total*100)/300; // calculating the percentage
        String result;
        //calculation for pass or fail
        if(percentage>=35 && percentage<=100)
        {
            result = "Pass";
            // System.out.println(result); //output if the condition is true
        }
        else {
            result = "Fail";
            //System.out.println(result); //output if the condition is false
        }
        //calculation for grade
        String g="";
        if (percentage >= 80 && percentage <= 100)
        {
            //System.out.println("Grade = A+");
            g="A+";
        }
        else if (percentage < 80 && percentage >= 60)
        {
            //System.out.println("Grade = A");
            g="A";
        }
        else if (percentage < 60 && percentage >= 50)
        {
            //System.out.println("Grade = B");
            g="B";
        }
        else if(percentage>=35 && percentage<50)
        {
            //System.out.println("Grade = c");
            g="C";
        }
        else
        {
            g= "Fail";
            System.out.println(g);
        }


        //printing the Mark sheet
        System.out.println("|-------------------------------------|");
        System.out.println("|                                   |");
        System.out.println("|          Mark sheet               |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Name        :" + name + "         |");
        System.out.println("| Roll Number :" + rollNumber +"    |");
        System.out.println("|                                   |");
        System.out.println("------------------------------------");
        System.out.println("| Subject     :    Marks            |");
        System.out.println("------------------------------------");
        System.out.println("| Maths       :    " + maths+"      |");
        System.out.println("| Science     :    " + science+"    |");
        System.out.println("| English     :    " + english+"    |");
        System.out.println("------------------------------------");
        System.out.println("| Total       :    " + total+"      |");
        System.out.println("------------------------------------");
        System.out.println("| Percentage  :    " + percentage+" |");
        System.out.println("| Result      :    " + result + "    |");
        System.out.println("| Grade       :    "+ g +"          |");
        System.out.println("|------------------------------------|");

    }


}