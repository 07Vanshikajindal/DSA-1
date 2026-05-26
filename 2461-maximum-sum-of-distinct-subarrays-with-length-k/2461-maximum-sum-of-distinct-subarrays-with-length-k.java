class Solution {
    public static long  maximumSubarraySum(int [] nums ,int k){
        if ( k >nums.length){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        long windowSum = 0;
        long maxSum = 0;
        int l = 0;
        for ( int r = 0;r<nums.length; r++){
            while ( set.contains(nums[r])){
                set.remove(nums[l]);
                windowSum-=nums[l];
                l++;
            }
            set.add(nums[r]);
            windowSum+=nums[r];

            if( r-l+1==k){
                maxSum = Math.max(maxSum , windowSum);
                set.remove(nums[l]);
                windowSum-=nums[l];
                l++;
            }


        }
        return maxSum;
    }
}