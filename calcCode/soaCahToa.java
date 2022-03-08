package calcCode;

import java.util.Scanner;


import java.lang.Math;


public class soaCahToa {
    String funType, probType;
    int x, y, angle, result1, result2; 
    boolean sin,cos,tan; 

    void selectFun() {
        Scanner userResp = new Scanner(System.in); 

       System.out.println("Would you like to choose radian or degree mode?");
       probType = userResp.nextLine(); 
       
       if (probType.equalsIgnoreCase("degree")) {
            System.out.println("\nYou are now in degree mode: ");
            degSolve();
       } else if (probType.equalsIgnoreCase("radian")) {
            System.out.println("\nYou are now in radian mode: ");
            radSolve();
       } else {
           System.out.println("That is not a valid type.");
           selectFun();
       }
    }

   

    void degSolve() {
        Scanner userResp = new Scanner(System.in);

        System.out.println("You are in degree mode, what function would you like to use? ");
        System.out.println("(sin, cos, tan): ");
        funType = userResp.nextLine().toLowerCase(); 

        switch (funType) {
            case "sin": 
                System.out.println("You have chosen sin\nChoose your number: ");
                x = userResp.nextInt(); 
                System.out.println(Math.sin(Math.toRadians(x)));
                break; 
            case "cos": 
                System.out.println("You have chosen cos\nChoose your number: ");
                x = userResp.nextInt();
                System.out.println(Math.cos(Math.toRadians(x)));
                break; 
            case "tan": 
                System.out.println("You have chosen tan\nChoose your number: ");
                x = userResp.nextInt(); 
                System.out.println(Math.tan(Math.toRadians(x)));
            default: 
                System.out.println("That is not a valid input.");
                degSolve();
        }
        userResp.close();
    }

    void radSolve() {
       Scanner userResp = new Scanner(System.in);
       
       System.out.println("You are in radian mode, what function would you like to use? ");
       System.out.println("(sin, cos, tan): ");
       funType = userResp.nextLine().toLowerCase(); 

       switch (funType) {
        case "sin": 
            System.out.println("You have chosen sin\nChoose your number: ");
            x = userResp.nextInt(); 
            System.out.println(Math.sin(x));
            break; 
        case "cos": 
            System.out.println("You have chosen cos\nChoose your number: ");
            x = userResp.nextInt();
            System.out.println(Math.cos(x));
            break; 
        case "tan": 
            System.out.println("You have chosen tan\nChoose your number: ");
            x = userResp.nextInt(); 
            System.out.println(Math.tan(x));
        default: 
            System.out.println("That is not a valid input.");
            radSolve();
    }
    userResp.close();

    }
}
