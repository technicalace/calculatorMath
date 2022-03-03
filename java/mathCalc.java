package java;
import java.util.Scanner; 

public class mathCalc {
    public String name; 
    public int x; 
    public int y;
    
    public static void main(String[] args) {
        // introduction 
        Scanner userInput = new Scanner(System.in); 
        System.out.println("Hello, welcome to the program. What is your name: ");

        String name = userInput.nextLine(); 
        System.out.println("Hello " + name + " welcome to the program.");

        // equations 
        System.out.println( "What form of operation would you like to use?: ");
        char operator = userInput.next().charAt(0); 

        if (operator == '-') {
            System.out.println(operator);
        }

        userInput.close();
    }
}