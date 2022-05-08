package calcCode;
import java.util.Scanner;

import calcCode.physics.basicPhysics;



public class mathCalc {
 
    public static void main(String[] args) {
        String input;
        Scanner userInput = new Scanner(System.in); 

        simpEq se = new simpEq();
        soaCahToa sct = new soaCahToa();
        basicPhysics bPhysics = new basicPhysics();
        dieRoller droller = new dieRoller();
        numberPlayground np = new numberPlayground();
        
        System.out.println("What tyoe of equation/function would you like to use?\n1.) Simple Equation\n2.) SOHCOHTOA\n3.) Basic Physics\n4.) Die Roller\n5.) Number Playground");
        
        input = userInput.nextLine();

        if (input.equalsIgnoreCase("simple equation")) {
            System.out.println("======================================");
            se.setNums();
        } else if (input.equalsIgnoreCase("sohcohtoa")) {
            System.out.println("======================================");
            sct.selectFun();
        } else if (input.equalsIgnoreCase("basic physics")) {
            System.out.println("======================================");
            bPhysics.physics();
        } else if (input.equalsIgnoreCase("Die Roller")) {
            System.out.println("======================================");
            droller.dChoice();
        } else if (input.equalsIgnoreCase("number playground")) {
            System.out.println("======================================");
            np.introduction();
        } else {
            System.out.println("======================================");
            System.out.println("That is not a valid input, please try again.");
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