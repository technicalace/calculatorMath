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
        String sideName;

        if (sin == true && cos == false && tan == false) {
            System.out.println("What side value do you have(opposite/hypotonuse): ");
            sideName = userResp.nextLine().toLowerCase(); 
            if (sideName.equals("opposite")) {
                System.out.println("Enter your opposite value to find your hypotonuse: ");
                x = userResp.nextDouble(); 

                System.out.println("Enter your angle: ");
                angle = userResp.nextDouble();

                result1 = Math.sin(angle); 
                result2 = x * result1; 
                Math.toDegrees(result2); 

                System.out.println("Your hypotonuse of your triangle is:\n" + result2);
            
            } else if (sideName.equals("hypotonuse")) {
                System.out.println("Enter your hypotonuse value to find your opposite: ");
                y = userResp.nextDouble();

                System.out.println("Enter your angle: ");
                angle = userResp.nextDouble(); 

                result1 = (Math.sin(angle)); 
                

                System.out.println("The opposite of your triangle is:\n" + result1);
            }
        } else if (sin == false && cos == true && tan == false) {
            System.out.println("What side value do you have(adjacant/hypotonuse): ");
            sideName = userResp.nextLine().toLowerCase(); 
            if (sideName.equals("adjacant")) {
                System.out.println("Enter your adjacant value to find your hypotonuse: ");
                x = userResp.nextDouble(); 

                System.out.println("Enter your angle: ");
                angle = userResp.nextDouble(); 
            } 
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
