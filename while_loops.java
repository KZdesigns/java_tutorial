import java.util.Scanner;

/**
 * while_loops
 */
public class while_loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magic_num = 13;
        System.out.print("Please guess a magic number: ");
        int user_guess = sc.nextInt();

        while (user_guess != magic_num) {
            System.out.print("Guess again: ");
            user_guess = sc.nextInt();
        }

        System.out.println("Congrats you guess the magic numner " + magic_num + "!" );
    }
}