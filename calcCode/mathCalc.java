package calcCode;
import java.util.Scanner;

import calcCode.basic_math.basicMath;
import calcCode.numberPlayground.numberPlay;
import calcCode.physics.physics;
import calcCode.trigonometry.trig;

public class mathCalc {
 
    public static void main(String[] args) {
        int input;
        Scanner userInput = new Scanner(System.in); 

        basicMath bm = new basicMath(); 
        numberPlay nplay = new numberPlay(); 
        physics phys = new physics(); 
        trig trig = new trig(); 
        
        System.out.println("What tyoe of function would you like to use?\n1.) Basic Math\n2.) Trigonometry\n3.) Physics\n4.) Number Playground");
        
        input = userInput.nextInt();

        if (input == 1) {
            System.out.println("======================================");
            bm.basicM(); 
        } else if (input == 2) {
            System.out.println("======================================");
            phys.phy();
        } else if (input == 3) {
            System.out.println("======================================");
            trig.trig();
        } else if (input == 4) {
            System.out.println("======================================");
            nplay.numPlay(); 
        } else {
            System.out.println("======================================");
            System.out.println("Not a valid input, please try again.");
            main(args);
        }

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