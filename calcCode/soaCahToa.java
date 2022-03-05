package calcCode;

import java.util.Scanner; 

public class soaCahToa {
    double x, y, angle, result; 

    void hasAngle() {
        Scanner userInput = new Scanner(System.in); 

        System.out.println("Does your triangle have an angle?\nType (y/n): ");
        char userResp = userInput.next().charAt(0); 

        if (userResp == 'y') {
            inputValuesWithAng();
        }
    }

    void inputValuesWithAng() {

    }

    void inputValuesWithoutAng() {

    }
}
