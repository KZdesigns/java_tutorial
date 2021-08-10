import java.util.ArrayList;

/**
 * Elements_time_index
 */
public class Elements_time_index {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> new_nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(7);
        nums.add(6);
        nums.add(5);

        System.out.println(nums);

        int i = 0;

        for (Integer num : nums) {
            int new_num = i * num;
            new_nums.add(new_num);
            i++;
        }

        System.out.println(new_nums);
    }
}