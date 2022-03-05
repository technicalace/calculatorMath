package calcCode;
import java.util.Scanner;


public class mathCalc {
    
    public static void main(String[] args) {
        // introduction 
        Scanner userInput = new Scanner(System.in); 
        simpEq se = new simpEq(); 

        se.setNums();
        se.setOperatorsAndSolve();

        /*System.out.println("Hello, welcome to the program. What is your name: ");

        name = userInput.nextLine(); 
        System.out.println("Hello " + name + " welcome to the program.");

        // entering number values 
        System.out.println("Choose your first number: ");
        x = userInput.nextInt(); 
        System.out.println("Choose your second number: ");
        y = userInput.nextInt();

        System.out.println( "What form of operation would you like to use?: ");
        char operator = userInput.next().charAt(0); 

        // equations
        switch (operator) {
            case '+': 
                result = x + y;
                System.out.println(x + " + " + y + " = " + result);
                break; 
            case '-': 
                result = x - y; 
                System.out.println(x + " - " + y + " = " + result);
                break;
            case '*': 
                result = x * y; 
                System.out.println(x + " * " + y + " = " + result);
                break; 
            case '/': 
                result = x / y; 
                System.out.println(x + " / " + y + " = " + result);
                break; 
            case '%': 
                result = x % y; 
                System.out.println(x + " % " + y + " = " + result);
                break; 
            default: 
                System.out.println("That is not a valid character, try again.");
        }

        userInput.close();*/
    }
}