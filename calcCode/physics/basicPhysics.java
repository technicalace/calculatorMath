package calcCode.physics;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class basicPhysics {
    char funType, probType; 
    double d, vi, vf, a, t, tt, dt, vAvg, x1, x2, result;
    /* INDEX: 
        D = Distance (m)
        Vi = Initial Velocity (m/s)
        Vf = Final Velocity (m/s)
        A = Acceleration (m/s[2])
        T = Time (s)
        Tt = Total Time (s)
        Dt = Total Distance (m)
        Vavg = Average Velocity (m/s)
        X = System Number
    */

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
                x1 = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Enter your acceleration (m/s[2]): ");
                a = userResp.nextDouble();
                System.out.println("======================================");   
                System.out.println("Enter your time (s): ");
                t = userResp.nextDouble(); 
                System.out.println("======================================");   
                System.out.println("Vf[2]" + " = "+vi+"[2] + 2"+"("+a+")"+"("+t+")");
                vi = Math.pow(x1, 2); // initial velocty is rose to the second power 
                x2 = 2 * a * t; 
                vf = vi + x2; // initial velocity times second num 
                result = Math.sqrt(vf);
                System.out.println("Vf =" + result + "m/s");
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

    /*public double getSquare1() {
        return userNum * userNum;
    }*/

    public double getSquare2() {
        return x2 * x2;
    }
}
