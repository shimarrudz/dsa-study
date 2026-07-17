

public class SmallestNumber {
    public static int findSmallest(int[] nums) {
        int smallest = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int nums[] = {9, 18, 7, 2, 60};
        int result = findSmallest(nums);
        System.out.print("Smallest: " + Integer.toString(result));

    }
}
