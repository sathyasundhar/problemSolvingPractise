/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array. */

class Solution {
    public int[] replaceElements(int[] arr) {
        int max=0,i=0;
        if(arr.length>0){
            max=arr[arr.length-1];
            //System.out.println(max);
            arr[arr.length-1]=-1;
        }
              
        for(i=arr.length-2;i>=0;i--){
            int temp = arr[i];
            arr[i]=max;
            if(temp>max)
                max=temp;
        }
        return arr;
    }
}
