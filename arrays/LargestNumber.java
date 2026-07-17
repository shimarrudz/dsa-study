class LargestNumberSolution {
    public static int findLargest(int[] nums) {
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 50, 40};
        int result = findLargest(nums);
        System.out.println("Largest number: " + result);
    }
}

// nums = [10, 20, 30, 50, 40]

/*
 * first loop iteration
 * largest = 10
 * i = 1
 * nums[i] = 20
 * final_largest = 10
 *
 *
 * second loop iteration
 * largest = 10
 * i = 2
 * nums[i] = 20
 * final_largest = 20
 *
 * third loop iteration
 * largest = 20
 * i = 3
 * nums[i] = 30
 * final_largest = 30
 *
 * fourth loop iteration
 * largest = 30
 * i = 4
 * nums[i] = 50
 * final_largest = 50
 *
 * fiveth loop iteration
 * largest = 50
 * i = 5
 * nums[i] = 40
 * final_largest = 50
 */ 