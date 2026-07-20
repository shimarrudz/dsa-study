class FindNumbersWithEvenNumbersOfDigits {
    public static int findNumbersWithEvenNumbersOfDigits(int[] nums) {
        int evenCounter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (Integer.toString(nums[i]).length() % 2 == 0) {
                evenCounter ++;
            }

        }

        return evenCounter;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = findNumbersWithEvenNumbersOfDigits(nums);

        System.out.println(result);

    }
}