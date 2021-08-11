/**
 * bubble_sort
 */
public class bubble_sort {

    public static void main(String[] args) {
        int[] arr = { 9, 5, 4, 7, 1, 2, 6, 5, 8, 9, 2 };
        boolean sorted = false;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        while (sorted == false) {
            sorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
