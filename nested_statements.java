/**
 * nested_statements
 */

import java.util.Scanner;

public class nested_statements {
    public static void main(String[] args) {
        System.out.print("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int age = Integer.parseInt(s);

        if (age >= 13) {
            System.out.print("Input your height in inches: ");
            String height_input = sc.nextLine();
            int height = Integer.parseInt(height_input);
            if (height >= 56) {
                System.out.println("Go ahead, enjoy the ride!");
            }
            else {
                System.out.println("Sorry you must be at least 56 inches to ride.");
            } 
        }
        else {
            System.out.println("Sorry you need to be at least 13 to ride!");
        }
    }
}