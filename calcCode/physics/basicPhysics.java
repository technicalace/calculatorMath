package calcCode.physics;

import java.util.Scanner;


public class basicPhysics { // primary variables 
    char funType, probType; 
    double d, vi, vf, a, t, tt, dt, vAvg, r, x1, x2, result;
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

    public void physics() { // user entering program 
        Scanner userResp = new Scanner(System.in); 
        
        // using a switch case statement for user to select function
        System.out.println("What type of system of functions would you like to solve for? (Type in the letter)");
        System.out.println();
        System.out.println();
        System.out.println("A.) Kinematics\nB.) Uniform Circular Motion\nC.) Vectors\nD.)Projectile Motion");

       
        funType = userResp.next().charAt(0);
        
        switch (funType) { 
            case 'A': // kinematics 
                System.out.println("======================================"); 
                kinematics();
                break;
            case 'B': // uniform circular motion 
                System.out.println("======================================");
                uniformCircularM();
                break;
            case 'C': // vectors 
                System.out.println("======================================");
                vectors();
                break; 
            case 'D': // projectile motion 
                System.out.println("======================================");   
                projectileMotion();
                break;
            default: // default function (ERROR)
                System.out.println("======================================");
                System.out.println("That is not a valid input, please try again");
                physics();
        }
    }

    public void kinematics() { // kinematics functions 
        Scanner userResp = new Scanner(System.in); // scanner is used for the user input
    
        // selecting equation using a switch case statement
        System.out.println("What type of equation would you like to use for Kinematics? (Type in a letter): ");
        System.out.println("A.) d = Vt\nB.) Vavg = dt / tt\nC.) Vf = Vi + at\nD.) d = (Vi + Vf)t / 2\nE.) Vf[2] = Vi[2] + 2at");
        System.out.println();
        probType = userResp.next().charAt(0); 

        switch(probType) { // using a try catch so that the program catches exceptions from the user
            case 'A': 
               try {
                    System.out.println("======================================"); // catching error algorithim (lines 70-79)
                    System.out.println("Enter your velocity (m/s): ");

                    vAvg = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Enter your time (s): ");

                    t = userResp.nextDouble();
                    System.out.println("======================================");   
                    System.out.println("d" + " = ("+vAvg+")" + "("+t+")");

                    d = vAvg*t; 

                    System.out.println("D =" + d + "m");
               } catch (Exception e) { // catches exceptions from user 
                   System.out.println("======================================");   
                   System.out.println("That input is not valid, please try again");
                   System.out.println("======================================");   
                   kinematics();
               }
                break;  
            case 'B': 
                try {
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
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    kinematics();
                }
                break;
            case 'C': 
               try {
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
               } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    kinematics();
               }
                break;
            case 'D': 
                try {
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
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    kinematics();
                }
                break;
            case 'E': 
                try {
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
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    kinematics();
                }
                break;
            }
    }

    public void uniformCircularM() { 
        Scanner userResp = new Scanner(System.in);

        System.out.println("What type of equation would you like to use for Uniform Circular Motion? (Type in a letter): ");
        System.out.println("A.) V = 2πR / T\nB.) Ac = V[2] / R\nC.) V = (# of rpms)(2πR) / 60");
        System.out.println();
        probType = userResp.next().charAt(0);

        switch (probType) {
            case 'A': 
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your radius (m): ");

                    r = userResp.nextDouble();
                    System.out.println("======================================");   
                    System.out.println("Enter your time (s): ");

                    t = userResp.nextDouble();
                    System.out.println("V = 2π"+r+ " / " + t);

                    vAvg = 2 * Math.PI * r;
                    result = vAvg / t;

                    System.out.println("V = "+result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    uniformCircularM();
                }
                break;
            case 'B':
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your velocity (m/s: )");

                    vAvg = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Enter your radius (m): ");

                    r = userResp.nextDouble(); 
                    System.out.println("Ac = " + vAvg + "[2] / " + r);

                    x1 = Math.pow(vAvg, 2); 
                    result = x1 / r; 

                    System.out.println("======================================");   
                    System.out.println("Ac = " + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    uniformCircularM();
                }
                break; 
            case 'C': 
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your RPMs (rpm): ");

                    x1 = userResp.nextDouble();
                    System.out.println("======================================");   
                    System.out.println("Enter your radius (m): ");

                    r = userResp.nextDouble();
                    System.out.println("V = ("+x1+")"+"(2π"+r+") / 60"); 

                    x2 = 2 * Math.PI * r;
                    vAvg = x2 * x1; 
                    result = vAvg / 60; 

                    System.out.println("V = " + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    uniformCircularM();
                }
                break;
            default: 
                System.out.println("======================================");   
                System.out.println("That input is not valid, please try again.");
                uniformCircularM();
                break; 
        }
    }
    
    public void vectors() {
        Scanner userResp = new Scanner(System.in); 

        double vector1, vector2;

        System.out.println("What type of equation would you like to use for Vectors? (Type in a letter): ");
        System.out.println("A.) Xcomp = RcosAng\nB.) Ycomp = RsinAng\bC.) X[2] + Y[2] = R[2]\nD.) Ang = tan[-1](y/x)");
        System.out.println();
        probType = userResp.next().charAt(0); 

        switch (probType) {
            case 'A': 
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your Radius (m): ");

                    r = userResp.nextDouble();
                    System.out.println("======================================");   
                    System.out.println("Enter your angle (%): ");

                    x1 = userResp.nextDouble();
                    System.out.println("======================================");   
                    System.out.println("Xcomp =" + r +"cos" + x1);

                    x2 = Math.cos(x1);
                    result = r * x2;

                    System.out.println("Xcomp =" + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    vectors();
                }
                break;
            case 'B':
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your radius (m): ");

                    r = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Enter your angle (%): ");

                    x1 = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Ycomp =" + r + "sin" + x1);

                    x2 = Math.sin(x1); 
                    result = r * x2; 

                    System.out.println("Ycomp =" + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    vectors();
                }
                
                break; 
            case 'C': 
                try {
                    System.out.println("======================================");
                    System.out.println("Enter your X vector (m): ");
                
                    x1 = userResp.nextDouble();
                    System.out.println("======================================");   
                    System.out.println("Enter your Y vector (m): ");

                    x2 = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("R[2] =" + x1 + "[2]" + " + " + x2  + "[2]");

                    vector1 = Math.pow(x1, 2); 
                    vector2 = Math.pow(x2, 2); 
                    double initalRt = (vector1 + vector2); 
                    result = Math.pow(initalRt, 2); 

                    System.out.println("R =" + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    vectors();
                }
                break;
            case 'D': 
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your y: ");

                    vector2 = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Enter your x: ");

                    vector1 = userResp.nextDouble();
                    System.out.println("======================================");   
                    System.out.println("Ang = tan[-1]("+vector2+"/"+vector1+")");

                    x1 = vector2 / vector1; 
                    result = Math.atan(x1); 

                    System.out.println("Ang =" + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    vectors();
                }
                break; 
            default:
                System.out.println("======================================");   
                System.out.println("Not a valid input, please try again.");
                vectors();
                break;
        }
    }

    public void projectileMotion() {
        Scanner userResp = new Scanner(System.in);

        double x3;

        System.out.println("What type of equation would you like to use for Projectile Motion? (Type in a letter): ");
        System.out.println("A.) Vx = VcosAng\nB.) Viy = VsinAng\bC.) Dx = Vxt\nD.) Vfy = Viy - 9.80t\nE.) Dx = V[2](Sin2Ang) / 9.80\nF.) t = √dy / √4.90\nG.) t = 2Viy / 9.80");
        System.out.println();
        probType = userResp.next().charAt(0); 

        switch (probType) {
            case 'A': 
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your Velocity (m/s): ");
                
                    vAvg = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Enter your Angle (%): ");

                    x1 = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Vx = "+vAvg+"cos"+x1);

                    x2 = Math.cos(x1); 
                    result = vAvg * x2; 

                    System.out.println("Vx =" + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    projectileMotion();
                }
                break; 
            case 'B': 
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your Velocity (m/s): ");
    
                    vAvg = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Enter your Angle (%): ");
    
                    x1 = userResp.nextDouble();
                    System.out.println("======================================");   
                    System.out.println("Viy = " + vAvg+"sin"+x1);
    
                    x2 = Math.sin(x1); 
                    result = vAvg * x2; 
    
                    System.out.println("Viy = " + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    projectileMotion();
                }
                break; 
            case 'C': 
                try { 
                    System.out.println("======================================");   
                    System.out.println("Enter your Velocity (m/s): ");

                    vAvg = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Enter your time (s): ");

                    t = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Dx = " +"("+vAvg+")"+"("+t+")");

                    result = vAvg * t; 

                    System.out.println("Dx = " + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    projectileMotion();
                }
                break; 
            case 'D':
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your Velocity in the Y direction (m/s): ");

                    vAvg = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Enter your time (s): ");

                    t = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Dfy = " + vAvg + " - " + "(9.80)"+t);

                    x1 = t * 9.80; 
                    result = vAvg - x1; 

                    System.out.println("Dfy = "+ result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    projectileMotion();
                }
                break; 
            case 'E': 
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your Velocity (m/s): ");

                    vAvg = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("Enter your Angle (%): ");

                    x1 = userResp.nextDouble();
                    System.out.println("======================================");   
                    System.out.println("Dfy = " + vAvg +"[2]"+"(Sin2"+x1+") / 9.80");

                    x2 = Math.pow(vAvg, 2); 
                    x3 = Math.sin(x1); 
                    double x4 = x3 * 2; 
                    result = x4 / 9.80; 

                    System.out.println("Dfy = " + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    projectileMotion();
                }
                break; 
            case 'F': 
                try {
                    System.out.println("======================================");   
                    System.out.println("Enter your Distance in the Y direction (m): ");

                    x1 = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("t = √"+x1+ " / √4.90");

                    x2 = Math.sqrt(x1); 
                    result = x2 / (Math.sqrt(4.90));

                    System.out.println("t = " + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    projectileMotion();
                }
                break;
            case 'G': 
                try {
                    System.out.println("======================================");                   
                    System.out.println("Enter your Velocity in the Y direction (m/s): ");

                    vAvg = userResp.nextDouble(); 
                    System.out.println("======================================");   
                    System.out.println("t = 2"+vAvg+" / 9.80");

                    result = (2*vAvg) / 9.80;

                    System.out.println("t = " + result);
                } catch (Exception e) {
                    System.out.println("======================================");   
                    System.out.println("That is not a valid input, please try again");
                    System.out.println("======================================");   
                    projectileMotion();
                }
                break;
            default: 
                System.out.println("======================================");   
                System.out.println("That is not a valid input, please try again.");
                projectileMotion();
        }
    }
}
