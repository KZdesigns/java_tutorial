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
            System.out.println("Go ahead have fun!");
        }
        else {
            System.out.println("Sorry you need to be at least 13 to ride!");
        }
    }
}