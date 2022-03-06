package calcCode;

import java.util.Scanner;
import java.lang.Math;


public class soaCahToa {
    String funType, probType;
    double x, y, angle, result1, result2; 
    boolean sin,cos,tan; 

    void selectFun() {
        Scanner userResp = new Scanner(System.in); 

        System.out.println("Solving for: \n1.) Missing side\n2.) Missing angle\n");
        probType = userResp.nextLine().toLowerCase(); 

        System.out.println("Which function would you like to use? (sin, cos, tan)");
        funType = userResp.nextLine().toLowerCase();

        switch (funType) {
            case "sin": 
                sin = true;
                cos = false;
                tan = false; 
                break; 
            case "cos": 
                sin = false; 
                cos = true; 
                tan = false;
                break; 
            case "tan":
                sin = false; 
                cos = false; 
                tan = true;
                break; 
            default: 
                System.out.println("That is not a valid input, try again");
                selectFun();
        }

        if (probType.equals("missing side")) {
            inputValuesMissingSide();
        } else if (probType.equals("missing angle")) {
            inputValueMissingAngle();
        } else {
            System.out.println("That's not a valid input you dumb dumb boi try again, and go cry about it.");
        }
    
        userResp.close();
    }

   

    void inputValuesMissingSide() {
        Scanner userResp = new Scanner(System.in);
        
        System.out.println("Input your angle (0.0): ");
        angle = userResp.nextDouble(); 

        System.out.println("Input first number: ");
        x = userResp.nextInt(); 

        System.out.println("Input second number: ");
        y = userResp.nextInt(); 

        if (sin = true) {
            result1 = Math.sin(x/y); 
        } else if (cos = true) {

        }

        userResp.close();
    }

    void inputValueMissingAngle() {
       Scanner userResp = new Scanner(System.in);
       
        System.out.println("Input first number: ");
        x = userResp.nextInt(); 

        System.out.println("Input second number: ");
        y = userResp.nextInt(); 
    }
}
