package calcCode.basic_math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calcTables {
    public void portTable() {
        Scanner scan = new Scanner(System.in);
        int uResp; 
        
        System.out.println("You have chosen math tables. What would you like to choose?");
        System.out.println("1.) Addition Tables\n2.) Subtraction Tables\n3.) Multiplication Tables");

        uResp = scan.nextInt();
        switch (uResp) {
            case 1: 
                System.out.println("======================================");
                addTables();
                break;
            case 2: 
                System.out.println("======================================");
                subTables();
                break;
            case 3: 
                System.out.println("======================================");
                mulTables();
                break; 
            default: 
                System.out.println("======================================");
                System.out.println("That input is out of bounds, please try again.");
                portTable();
        }
        scan.close();
    }

    void addTables() {
        Scanner scan = new Scanner(System.in);
        int i, uResp;
        
        try {
            System.out.println("Input a number: ");
            uResp = scan.nextInt();
            for (i = 1; i < 21; i++) {
                System.out.printf("%d + %d = %d\n", uResp, i, uResp + i);
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================================");
            System.out.println("That is an invalid input, please try again.");
            addTables();
        }
        scan.close();
    }

    void subTables() {
        Scanner scan = new Scanner(System.in);
        int i, uResp;

        try {
            System.out.println("Input a number: ");
            uResp = scan.nextInt();
            for (i = 1; i < 21; i++) {
                System.out.printf("%d - %d = %d\n", uResp, i, uResp - i);
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================================");
            System.out.println("That is not a valid input, please try again.");
            subTables();
        }
        scan.close();
    }

    void mulTables() {
        Scanner scan = new Scanner(System.in);
        int i, uResp;

        try {
            System.out.println("Input a number: ");
            uResp = scan.nextInt(); 
            for (i = 1; i < 21; i++) {
                System.out.printf("%d * %d = %d\n", uResp, i, uResp * i);
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================================");
            System.out.println("That is not a valid input, please try again.");
            mulTables();
        }
        scan.close();
    }   
}
