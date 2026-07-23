public class SortedTwoSumTrain {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum > target) {
                left ++;
            }

            else if (sum < target) {
                right --;
            }
            
            else return new int[] {left, right};
        }

        return new int[] {left, right};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.print(twoSum(nums, 9));
    }
}
