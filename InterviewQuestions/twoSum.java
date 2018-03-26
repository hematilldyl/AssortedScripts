/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] index = new int[2];
        boolean fin = false;
        for(int i = 0;i<nums.length;i++){
            for(int j = 1+i;j<nums.length;j++){
                sum = nums[i]+nums[j];
                if(sum==target){
                index[0]=i;
                index[1]=j;
                    fin = true;
                break; 
                    
                
                }
            }
            if(fin){
                break;
            }
        }
    return index;
    }
}
