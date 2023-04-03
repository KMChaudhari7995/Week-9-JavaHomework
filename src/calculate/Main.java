package calculate;

import java.util.Scanner;

/*
Write a “main” method into the main class. It has a scanner that takes user input. Also write the logic that it ask user to “Enter first Number:”, “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user enter + symbol result like “Addition of 5 and 10 is: 15” and respective for other symbols.
5. With the result it’s also print one more message “Would you like to do more calculation Please enter “Y” or “N” :” (Hint use while loop if user enter Y program asking the user to enter First Number, and if user enter N programme should terminate)
 */
public class Main extends Calculator{
    public static void main(String[] args) { //main method
        Scanner scan = new Scanner(System.in); //scanner use
        System.out.println("Enter the First Number:"); //first input
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second Number:");
        int secondNumber = scan.nextInt();
        System.out.println("Please enter one of Symbol +,-,*,/ :");
        char symbol = scan.next().charAt(0);
        Main obj = new Main();
        obj.calculateResult(firstNumber,secondNumber,symbol);
        System.out.println("Would ");
        char character = scan.next().charAt(0);
        while(character == 'y'){
            System.out.println("Enter the First Number:");
             firstNumber = scan.nextInt();
            System.out.println("Enter the second Number:");
            secondNumber = scan.nextInt();
            System.out.println("Please enter one of Symbol +,-,*,/ :");
            symbol = scan.next().charAt(0);
            obj.calculateResult(firstNumber,secondNumber,symbol);
            System.out.println("Would");
            character = scan.next().charAt(0);
        }
        scan.close();
    }

}
