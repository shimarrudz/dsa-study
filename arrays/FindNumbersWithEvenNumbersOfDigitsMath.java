public class FindNumbersWithEvenNumbersOfDigitsMath {
    public static int findNumbers(int[] nums) {
        int evenCounter = 0;
        int digitCount = 0;

        for (int i = 0; i < nums.length; i ++) {
            int number = nums[i];

            while (number > 0) {
                number = number / 10;

                digitCount ++;
            }

            if (digitCount % 2 == 0) {
                evenCounter ++;
            }

            digitCount = 0;
        }

        return evenCounter;
    }
}
