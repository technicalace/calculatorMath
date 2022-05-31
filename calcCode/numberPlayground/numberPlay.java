package calcCode.numberPlayground;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class numberPlay {
    public int input; 

    public void numPlay() {
        Scanner scan = new Scanner(System.in);
        dieRoller dr = new dieRoller();
        numberPlayground np = new numberPlayground();

        System.out.println("What function would you like to use?\n1.) Dice Roller\n2.) Counting ");
        
        input = scan.nextInt(); 

        try {
            if (input == 1) {
                System.out.println("======================================");
                dr.dChoice();
            } else if (input == 2) {
                System.out.println("======================================");
                np.introduction();
            } else {
                System.out.println("======================================");
                System.out.println("That number is out of bounds, please try again.");
                numPlay();
            }
            } catch (InputMismatchException ie) {
                System.out.println("======================================");
                System.out.println("That is not a valid input, please try again.");
                numPlay();
            }
        scan.close();
    }
}
