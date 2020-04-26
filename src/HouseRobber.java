public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        // index represent the number of houses
        int[] dp = new int[nums.length + 1];
        dp[0] = 0; // if there are no houses to rob, you make 0
        dp[1] = nums[0]; // if there is only 1 house to rob, you rob it and thats it

        // start at 1 because, the first house, index 0 case is already considered in base case
        // i = the ith house
        for (int i = 1; i < nums.length; i++) {
            // index present the amount of houses available to rob
            // have to add 1 because of offset by the 0th index for no houses case
            // when i = 1, it really means the second house or total of 2 houses
            // d[i + 1] = the house value were trying to solve for
            // dp[i] = the max value for that index amount of houses
            // dp[i - 1] = the max value up to the previous non-adjacent house
            // nums[i] = the current house value
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
        }

        return dp[nums.length];
    }
}
