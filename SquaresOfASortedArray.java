class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int start = 0, end = nums.length-1;
        int[] ssArray = new int[nums.length];
        int counter = nums.length-1;
        while(start<=end){
            int startSquared=nums[start]*nums[start];
            int endSquared=nums[end]*nums[end];
            if(endSquared>startSquared){
                ssArray[counter] = endSquared;
                counter-=1;
                end-=1;
            }else{
                ssArray[counter] = startSquared;
                counter-=1;
                start+=1;
            }
            
        }
        return ssArray;
    }
}
