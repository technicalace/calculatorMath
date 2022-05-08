package calcCode;
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

        while (scan.hasNextDouble()) scan.next(); 
            input = scan.nextInt();
       do {
            while (scan.hasNextDouble()) scan.hasNext(); 
            die10 = scan.nextInt();
        } while (die10 < input); 
        System.out.println(die10 + " " + input);
    }
    
    public void dice5() {
        System.out.println("======================================");

    }
}

