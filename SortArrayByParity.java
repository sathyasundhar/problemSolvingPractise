/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition. */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=nums.length-1,temp;
        while(i<j){
            //System.out.println("In");
            if((nums[i]%2 !=0)){
                temp = nums[j];
                nums[j--]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }
        return nums;
    }
}
