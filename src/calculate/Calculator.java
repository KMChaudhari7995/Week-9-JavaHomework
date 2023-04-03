package calculate;
/*
Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”, and “multiplication”. All methods are instance methods and it doesn’t return anything. But it has two parameters with the names “int a” and “int b”. Also each method has System.out.println(). This prints the result. Also create one more method with the name “calculateResult” with three parameters with name int a, int b and char symbol. Write the logic in the calculateResult method that when the user enters first number and second number and symbol based on symbol it does calculate
 */

public class Calculator {

    public void addition(int a,int b){
        System.out.println("Addition of" +a + "And " +b+ "is : " +(a+b));
    }
    public void subtraction(int a, int b){
        System.out.println("Subtraction of" +a + "And " +b + "is : " +(a-b));
    }
    public void division(int a ,int b){
        System.out.println("Division of" +a + "And " +b+ "is : " +(a/b));
    }
    public void multiplication(int a, int b){
        System.out.println("Multiplication of" +a + "And " +b+ "is : " +(a*b));
    }
    public void calculateResult(int a,int b,char symbol){
        if(symbol== '+'){
            addition(a,b);
        } else if (symbol =='-') {
            subtraction(a,b);
        } else if (symbol == '/') {
            division(a,b);
        } else if (symbol == '*') {
            multiplication(a,b);
        }else {
            System.out.println("Invalid input");
        }
        //  System.out.println("Would you like to do more calculation Please enter 'Y'or 'N':");
       // while (char == 'y'){
            //    System.out.println("Enter the first Number :");
            //}
        }
    }

