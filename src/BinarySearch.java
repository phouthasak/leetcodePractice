public class BinarySearch {
    public int search(int[] nums, int target) {
        // pivot in the middle
        int pivot, left = 0, right = nums.length - 1;

        while(left <= right) {
            pivot = left + (right - left) / 2;

            if (nums[pivot] == target) return pivot;

            if (target < nums[pivot]) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }

        return -1;
        // time = O(log n)
        // spacec = O(1)
    }
}
