public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else {
                if (target > nums[i]) {
                    position = i + 1;
                }
            }
        }

        return position;
    }
}
