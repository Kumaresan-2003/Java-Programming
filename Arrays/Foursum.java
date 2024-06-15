import java.util.*;

public class Foursum {
    public static void main(String args[]) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int n = nums.length;
        int target = 9;

        List<Integer> temp1 = new ArrayList<>();

        for (int num : nums) {
            temp1.add(num);
        }

        List<List<Integer>> li = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int fourth = target - sum;
                    if (temp1.contains(fourth)) {
                        temp.clear();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(fourth);
                        li.add(new ArrayList<>(temp));
                    }
                }
            }
        }

        System.out.print(li);
    }
}