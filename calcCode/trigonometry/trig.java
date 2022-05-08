package calcCode.trigonometry;
import java.util.Scanner;

public class trig {
    public int input; 
    
    public void trig() {
        Scanner scan = new Scanner(System.in); 
        soaCahToa sct = new soaCahToa(); 

        System.out.println("What function would you like to use?:\n1.) SohCahToa");

        input = scan.nextInt(); 

        if (input == 1) {
            System.out.println("======================================");
            sct.selectFun();
        } else {
            System.out.println("======================================");
            System.out.println("That is not a valid input, please try again.");
            trig();
        }
        scan.close();
    }
}
