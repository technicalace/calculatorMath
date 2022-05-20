package calcCode.numberPlayground;
import java.util.Random;
import java.util.Scanner;
 
public class dieRoller {
    public int die5;
    public int die10;
    public int die20;
    public int input;

    public void dChoice() {
        Scanner scan = new Scanner(System.in);    

        System.out.println("What die would you like to roll for?:\n1.) d5\n2.) d10\n3.) d20");
        input = scan.nextInt(); 

        if (input == 1) {
            dice5();
        } else if (input == 2) {
            dice10();
        } else if (input == 3) {
            dice20();
        } else {
            System.out.println("That is not a valid input, please try again.");
            dChoice();
        }
    }

    public void dice5() {
        Random rNum = new Random(); 

        int randint = rNum.nextInt(6);
        System.out.println("======================================");
        System.out.println(randint);
    }

    public void dice10() {
        Random rNum = new Random(); 

        int randint = rNum.nextInt(11); 
        System.out.println("======================================");
        System.out.println(randint);
    }

    public void dice20() {
        Random rNum = new Random(); 

        int randint = rNum.nextInt(21);
        System.out.println("======================================");
        System.out.println(randint);
    }
}

