package calcCode;
import java.util.Scanner;

public class numberPlayground {
    int x; 
    int input;

    public void introduction() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What would you like to do?\n1.) Count up to 10\n2.) Count down from 10");

        input = scan.nextInt();
        if (input == 1) {
            System.out.println("======================================");
            countingUp();
        } else if (input == 2) {
            System.out.println("======================================");
            countingDown();
        }
    }

    public void countingUp() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        x = scan.nextInt();

        do { 
            System.out.println(x);
            x++; 
        } while (x < 10); 
    }

    public void countingDown() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number: ");
        x = scan.nextInt(); 

        do {
            System.out.println(x);
            x--;
      } while (x > 9);
    }
}
