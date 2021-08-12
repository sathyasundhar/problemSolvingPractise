class Solution {
    public int findNumbers(int[] nums) {
        int digits=0, evenDigit=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                digits+=1;
            }
            if(digits%2==0){
                evenDigit+=1;
            }
            digits=0;
        }
     return evenDigit;   
    }
}
