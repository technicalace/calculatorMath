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

    // DEGREE MODE (selecting function)
    void funTypeD() {
        Scanner userResp = new Scanner(System.in);

        System.out.println("You are in degree mode, what function would you like to use? ");
        System.out.println("(sin, cos, tan): ");
        funType = userResp.nextLine().toLowerCase(); 

        try {
        switch (funType) {
            case "sin":
                System.out.println("You have chosen sin\nChoose your number: "); // generates error when wrong number input is given, create path in case of error
                x = userResp.nextInt(); 
               
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
                funTypeD();
        }
        }catch (InputMismatchException e ) {
            System.out.println("That is not a valid input, please try again.");
        }
        
        userResp.close();
    }

    // RADIAN MODE (selecting function mode)
    void funTypeR() {
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
            funTypeR();
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

    // sohcahtoa for radian mode
    void sinR() {
        Scanner userResp = new Scanner(System.in);

    }

    void cosR() {
        Scanner userResp = new Scanner(System.in);

    }

    void tanR() {
        Scanner userResp = new Scanner(System.in);

    }
 }
