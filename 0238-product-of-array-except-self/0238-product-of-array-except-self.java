class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; // nums = [1, 2, 3, 4]
        int [] answer = new int [n]; // answer = [0, 0, 0, 0]
        answer [0] = 1; //answer = [1, 0, 0, 0]
        for ( int i =1 ; i<n;i++){
            answer[i] = answer[i-1]*nums[i-1]; 
            // take the pervious answer  x pervious nums
            // i = 1   
            //answer[1] = answer[0] * nums[0]
                            //  = 1 * 1
                           //   = 1
           // answer = [1, 1, 0, 0]
        //    i = 2
        //    answer[2] = answer[1] * nums[1]
        //   = 1 * 2
        //   = 2
        //   answer = [1, 1, 2, 0]
        // 
    }

 // answer = [1, 1, 2, 6]


        int right = 1;
        for ( int i = n-1;i>=0;i--) // i = 3 
        {
            answer [i] = answer[i]*right;
            // answer[3] = 6 * 1 = 6

            right = right*nums[i];
            //right = 1 * 4 = 4
        }
        return answer;
    }
}