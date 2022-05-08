package calcCode.basic_math;
import java.util.Scanner;

public class basicMath {
    public int input;

    public void basicM() {
        Scanner scan = new Scanner(System.in); 
        simpEq se = new simpEq();

        System.out.println("What type of equations would you like to solve for?:\n1.) Basic Math");

        input = scan.nextInt();
        
        if (input == 1) {
            System.out.println("======================================");
            se.setNums();
        } else {
            System.out.println("======================================");
            System.out.println("That is not a valid input, please try again.");
            basicM();
        }
        scan.close();
    }
}
