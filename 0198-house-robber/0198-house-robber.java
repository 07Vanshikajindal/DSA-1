class Solution {
    public int rob(int[] nums) {

        // If no houses
        if (nums.length == 0) return 0;

        // If only one house
        if (nums.length == 1) return nums[0];

        int prev2 = nums[0];                     // money till house 0
        int prev1 = Math.max(nums[0], nums[1]);  // money till house 1

        for (int i = 2; i < nums.length; i++) {
            int current = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}