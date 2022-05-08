package calcCode.physics;
import java.util.Scanner;

public class physics {
    public int input; 

    public void phy() {
        Scanner scan = new Scanner(System.in);
        basicPhysics bp = new basicPhysics(); 

        System.out.println("What function would you like to use?:\n1.) Basic Physics ");
        

        input = scan.nextInt();

        if (input == 1) {
            System.out.println("======================================");
            bp.physics();
        } else {
            System.out.println("======================================");
            System.out.println("That is not a valid input, please try again.");
            phy();
        }
        scan.close();
    }
}
