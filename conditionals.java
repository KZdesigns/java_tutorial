/**
 * conditionals
 */
import java.util.Scanner;

public class conditionals {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();

       if (s.equals("tim")) {
            System.out.println("You typed tim");
       }
       else if (s.equals("hello")) {
            System.out.println("Hi!");
       }
       else {
        System.out.println(s);

       }
      
    }
}