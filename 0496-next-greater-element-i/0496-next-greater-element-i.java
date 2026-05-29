import  java.util.*;
class Solution {
    public static int [] nextGreaterElement(int [] nums1, int[]nums2){
        Map<Integer, Integer> map = new HashMap<>();
        Stack <Integer> stack = new Stack <>();
        for ( int num : nums2){
            while (!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop() , num);
            }
            stack.push(num);
        }
        while (!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        int [] res = new int [nums1.length];
        for ( int i =0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
    // public static void main ( String [] args){
    //     int n = sc.nextInt();
    //     int [] nums1 = new int [n];
    //     for( int i =0;i<n;i++){
    //         nums1[i] = sc.nextInt();
    //     }
    //     int m = sc.nextInt();
    //     int [] nums2 = new int [m];
        
    //     for ( int i =0;i<m;i++){
    //         muns2 [i]= sc.nextInt();
            
    //     }
    //     Solution ob = new Solution; 
    //     int [] res = ob.nextGreaterElement(nums1, nums2);
        
    //     for ( int val : result){
    //         System.out.print(val+ " ");
    //     }
    //     sc.close();
    // }
}