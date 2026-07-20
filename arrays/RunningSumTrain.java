
import java.util.Arrays;

class RunningSumTrainJava {
    public static int[] runningArraySum(int[] nums) {
        int[] runningSum = new int[nums.length];

        runningSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }

    public static void main(String[] args) {
        int[] nums = {5, 67, 21, 90, 2};

        int[] result = runningArraySum(nums);
        
        System.out.println("Sum: " + Arrays.toString(result));
    }
}