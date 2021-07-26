import java.util.Scanner;

/**
 * for_each_loop
 */
public class for_each_loop {

    public static void main(String[] args) {
        int[] arr = {1,5,7,3,4,5};
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Type a name: ");
            String name = sc.nextLine();
            names[i] = name;
        }

        for (String name:names) {
            System.out.println(name);
            if (name.equals("Lauriane")) {
                System.out.println("We have found Lauriane!");
                break;
            }
        }
    }
}