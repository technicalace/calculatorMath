package calcCode;
import java.util.Scanner;


public class simpEq {
     int x, y, result; 
     /* INDEX:
         X = First Number 
         Y = Second Number 
         Result = Pretty self explainatory 

     */

    void setNums() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        x = userInput.nextInt(); 

        System.out.println("Please enter your second number: ");
        y = userInput.nextInt();   

        setOperatorsAndSolve();
    }

    void setOperatorsAndSolve() {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Choose which operators you would like to select: ");

        char operator = userInput.next().charAt(0);

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

        userInput.close();
    }
}
