package calcCode.basic_math;
import java.util.Scanner;

public class basicMath { // primary variables 
    public int input;

    public void basicM() { // does not need switch case 
        Scanner scan = new Scanner(System.in); 
        simpEq se = new simpEq();
        calcTables ct = new calcTables(); 

        System.out.println("What type of equations would you like to solve for?:\n1.) Basic Math\n2.) Math Tables");

        input = scan.nextInt();
        
        if (input == 1) {
            System.out.println("======================================");
            se.setNums();
        } else if (input == 2) {
            System.out.println("======================================");
            ct.portTable();
        } else {
            System.out.println("======================================");
            System.out.println("That is not a valid input, please try again.");
            basicM();
        }
        scan.close();
    }
}
