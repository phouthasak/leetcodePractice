public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        // check for issue
        int probIndex = check(nums);

        // there are no issue in original
        if (probIndex == -1) return true;

        // fix the first issue
        int temp = nums[probIndex];
        nums[probIndex] = nums[probIndex + 1] - 1;

        // check the array with the first fix
        boolean correctWith1Fix = (check(nums) == -1 ? true : false);

        boolean correctWith2Fix = false;
        // only need to run through second time is if there are still issues
        // key in the (0 <= i <= n - 2) in description
        if (!correctWith1Fix) {
            nums[probIndex] = temp;
            nums[probIndex + 1] = nums[probIndex];
            correctWith2Fix = (check(nums) == -1 ? true : false);
        }

        return (correctWith1Fix || correctWith2Fix);
    }

    // helper method to check if array is increasing
    // returns -1 if no issue
    // return the index of the first problem index if there are issue
    public int check(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) return i;
        }

        return -1;
    }
}
