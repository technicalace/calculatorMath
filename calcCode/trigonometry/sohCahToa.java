package calcCode.trigonometry;

import java.util.InputMismatchException;
import java.util.Scanner;


import java.lang.Math;


public class sohCahToa {
    String funType, probType;
    int x, y, angle, result1, result2; 
    boolean sin,cos,tan; 
    /* INDEX: 
        X = First Number 
        Y = Second Number 
        Angle = Self explainatory 
    */

    // selecting mode for calculator 
    public void selectFun() {
        Scanner userResp = new Scanner(System.in); 

       System.out.println("Would you like to choose radian or degree mode?");
       probType = userResp.nextLine(); 
       
       if (probType.equalsIgnoreCase("degree")) {
            System.out.println("\nYou are now in degree mode: ");
            funTypeD();
       } else if (probType.equalsIgnoreCase("radian")) {
            System.out.println("\nYou are now in radian mode: ");
            funTypeR();
        } else {
           System.out.println("That is not a valid type.");
           selectFun();
       }
    }

   

    void degSolve() { // DEGREE SOLVE
        Scanner userResp = new Scanner(System.in);

        System.out.println("You are in degree mode, what function would you like to use? ");
        System.out.println("(sin, cos, tan): ");
        funType = userResp.nextLine().toLowerCase(); 

        try {
        switch (funType) {
            case "sin": 
                System.out.println("You have chosen sin\nChoose your number: ");
                try {
                    x = userResp.nextInt(); 
                    System.out.println(Math.sin(Math.toRadians(x)));
                } catch (InputMismatchException ie) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again.");
                    degSolve();
                }
                break; 
            case "cos": 
                System.out.println("You have chosen cos\nChoose your number: ");
                try {
                    x = userResp.nextInt();
                    System.out.println(Math.cos(Math.toRadians(x)));
                } catch (InputMismatchException ie) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again.");
                    degSolve();
                }
                break; 
            case "tan": 
                System.out.println("You have chosen tan\nChoose your number: ");
                try {
                x = userResp.nextInt(); 
                System.out.println(Math.tan(Math.toRadians(x)));
                } catch (InputMismatchException ie) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again.");
                    degSolve();
                }
        }
        }catch (InputMismatchException e ) {
            System.out.println("That is not a valid input, please try again.");
        }
        
        userResp.close();
    }
    
    void radSolve() {
       Scanner userResp = new Scanner(System.in);
       
       System.out.println("You are in radian mode, what function would you like to use? ");
       System.out.println("(sin, cos, tan): ");
       funType = userResp.nextLine().toLowerCase(); 

       switch (funType) { // RADIAN SOLVE 
        case "sin": 
            System.out.println("You have chosen sin\nChoose your number: ");
            try {
                x = userResp.nextInt(); 
                System.out.println(Math.sin(x));
            } catch (InputMismatchException ie) {
                System.out.println("======================================");   
                System.out.println("That is not a valid input, please try again.");
                radSolve();
            } 
            break; 
        case "cos": 
            System.out.println("You have chosen cos\nChoose your number: ");
            try {
                x = userResp.nextInt();
                System.out.println(Math.cos(x));
            } catch (InputMismatchException ie) {
                System.out.println("======================================");   
                System.out.println("That is not a valid input, please try again.");
                radSolve();
            }
            break; 
        case "tan": 
            System.out.println("You have chosen tan\nChoose your number: ");
            try {
                x = userResp.nextInt(); 
                System.out.println(Math.tan(x));
            } catch (InputMismatchException ie) {
                System.out.println("======================================");   
                System.out.println("That is not a valid input, please try again.");
                radSolve();
            }
    }
    userResp.close();

    }

    // sohcahtoa for degree mode 
    void sinD() {
        Scanner userResp = new Scanner(System.in);

        System.out.println("You have chosen sin\nChoose your number: "); // generates error when wrong number input is given, create path in case of error
        x = userResp.nextInt(); 
        if (!userResp.hasNextInt()) {
            System.out.println("That is not a valid input, please try again.");
            sinD();
        } else {
            System.out.println(Math.sin(Math.toRadians(x)));
        }
        userResp.close();
    }

    void cosD() {
        Scanner userResp = new Scanner(System.in);

        System.out.println("You have chosen cos\nChoose your number: ");
        x = userResp.nextInt();
        if (!userResp.hasNextInt()) {
            System.out.println("That is not a valid input, please try again.");
            cosD();
        } else {
            System.out.println(Math.cos(Math.toRadians(x)));
        }
        userResp.close();
    }

    void tanD() {
        Scanner userResp = new Scanner(System.in);

        System.out.println("You have chosen tan\nChoose your number: ");
        x = userResp.nextInt(); 
        if (!userResp.hasNextInt()) {
            System.out.println("That is not a valid input, please try again.");
            tanD();
        } else {
            System.out.println(Math.tan(x));
        }
        userResp.close();
    }
 }
