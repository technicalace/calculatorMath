package calcCode.physics;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class basicPhysics {
    char funType, probType; 
    double d, vi, vf, a, t, tt, dt, vAvg;

    public void physics() {
        Scanner userResp = new Scanner(System.in);

        System.out.println("What type of system of functions would you like to solve for? (Type in the letter)");
        System.out.println();
        System.out.println();
        System.out.println("A.) Kinematics\nB.) Uniform Circular Motion\nC.) Vectors\nD.)Projectile Motion");

       
        funType = userResp.next().charAt(0);
        
        switch (funType) {
            case 'A': 
                System.out.println("======================================");
                kinematics();
                break;
            case 'B': 
                System.out.println("======================================");
                uniformCircularM();
                break;
            case 'C': 
                System.out.println("======================================");
                vectors();
                break; 
            case 'D': 
                System.out.println("======================================");   
                projectileMotion();
                break;
            default: 
                System.out.println("======================================");
                System.out.println("That is not a valid input, please try again");
                physics();
        }
    }

    public void kinematics() {
        Scanner userResp = new Scanner(System.in);
        
        System.out.println("What type of equation would you like to use? (Type in a letter): ");
        System.out.println("A.) d = Vt\nB.) Vavg = dt / tt\nC.) Vf = Vi + at\nD.) d = (Vi + Vf)t / 2\nE.) Vf[2] = Vi[2] + 2at");
        System.out.println();
        probType = userResp.next().charAt(0); 

        switch(probType) {
            case 'A': 
                System.out.println("======================================");   
                System.out.println("Enter your velocity (m/s): ");
                System.out.println();
                vAvg = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Enter your time (s): ");
                t = userResp.nextDouble();
                System.out.println("======================================");   
                System.out.println("d" + " = ("+vAvg+")" + "("+t+")");
                d = vAvg*t; 
                System.out.println("D =" + d + "m");
                break;  
            case 'B': 
                System.out.println("======================================");   
                System.out.println("Enter your total distance (m): ");
                System.out.println();
                dt = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Enter your total time (s): ");
                tt = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Vavg" + " = ("+dt+")" + "/" + "("+tt+")");
                vAvg = dt/tt;
                System.out.println("Vavg =" + vAvg + "m/s");
                break;
            case 'C': 
                System.out.println("======================================");   
                System.out.println("Enter your inital velocity (m/s): ");
                System.out.println();
                vi = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Enter your acceleration (m/s[2]): ");
                a = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Enter your time (s): ");
                t = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Vf" + " = " + vi + " + " + "("+a+")"+"("+t+")" );
                vf = vi + (a * t);
                System.out.println("Vf =" + vf + "m/s");
                break;
            case 'D': 
                System.out.println("======================================");   
                System.out.println("Enter your initial velocity (m/s): ");
                System.out.println();
                vi = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Enter your final velocity (m/s): ");
                vf = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Enter your time (s): ");
                t = userResp.nextDouble();
                System.out.println("============ ==========================");   
                System.out.println("d" + " = ("+vi+ " + " +vf+")"+t + " / " + " 2");
                d = (vi + vf) * t / 2;
                System.out.println("D =" + d + "m");
                break;
            case 'E': 
                System.out.println("======================================");   
                System.out.println("Enter your initial velocity (m/s): ");
                vi = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Enter your acceleration (m/s[2]): ");
                a = userResp.nextDouble();
                System.out.println("======================================");   
                System.out.println("Enter your time (s): ");
                t = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Vf[2]" + " = "+vi+"[2] + 2"+"("+a+")"+"("+t+")");
                vf = (vi*2) + (2 * 2 * a * t);
                System.out.println("Vf =" + vf + "m/s");
                break;
            default: 
                System.out.println("Invalid input.");
                kinematics();
            }
    }

    public void uniformCircularM() {

    }

    public void vectors() {

    }

    public void projectileMotion() {

    }
}