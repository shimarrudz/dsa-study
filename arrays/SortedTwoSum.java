import java.util.Arrays;

public class SortedTwoSum {
    public static int[] sortedTwoSum(int[] nums, int target) {
        int left = 0;

        int right = nums.length -1;

        while (left < right) {

            int sum = nums[left] + nums[right];
            if (sum > target) {
                right --;
            }

            else if (sum < target) {
                left ++;
            }

        else return new int[] { left, right };
        }

        return new int[] { left, right };
        
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 11, 15};
        int target = 15;

        int [] result = sortedTwoSum(nums, target);

        System.out.println("Two sum: " + Arrays.toString(result));

    }
}
