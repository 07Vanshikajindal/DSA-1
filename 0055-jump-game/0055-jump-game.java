
class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0; // farthest index we can reach

        for (int i = 0; i < nums.length; i++) {
            
            // if current index is beyond reach → impossible
            if (i > maxReach) {
                return false;
            }

            // update farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);

            // if we can already reach end, stop early
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}