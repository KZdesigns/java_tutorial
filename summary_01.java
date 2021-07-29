import java.util.Scanner;
import java.util.Random;

/**
 * 01_summary
 */
/**
 * summary_01
 */
public class summary_01 {

    public static void main(String[] args) {
        String welcome_message = "Welcome to the Simon Game";
        System.out.println(welcome_message);

        System.out.println();
        System.out.println("Pay attention to the sequence and repeat it back to simon in the same order!");

        Random rand = new Random();
        int upperbound = 3;

        int int_random = rand.nextInt(upperbound);

        String[] colors = {"red", "blue", "green"};

        String color = colors[int_random];

        System.out.println(color);
        System.out.println();


        Scanner sc = new Scanner(System.in);
        
        String player_guess = sc.nextLine();

        if (color.equals(player_guess)) {
            System.out.println("Thats the right guess");
        } else {
            System.out.println("You lose!");
        }

    }
}