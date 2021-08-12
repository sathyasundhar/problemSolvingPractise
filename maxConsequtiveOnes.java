class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int count=0;
        for(int k=0;k<nums.length;k++){
          if(nums[k]==1){
              count+=1;
              System.out.println(k);
          }else{
              if(maxCount<count)
                maxCount=count;
              count=0;
         }   
        }
     if(maxCount<count)
                maxCount=count;
     return maxCount;
    }
}
