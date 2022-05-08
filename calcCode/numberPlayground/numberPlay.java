package calcCode.numberPlayground;
import java.util.Scanner;

public class numberPlay {
    public int input; 

    public void numPlay() {
        Scanner scan = new Scanner(System.in);
        dieRoller dr = new dieRoller();
        numberPlayground np = new numberPlayground();

        System.out.println("What function would you like to use?\n1.) Dice Roller\n2.) Counting ");
        
        input = scan.nextInt(); 

        if (input == 1) {
            System.out.println("======================================");
            dr.dChoice();
        } else if (input == 2) {
            System.out.println("======================================");
            np.introduction();
        }
        scan.close();
    }
}
