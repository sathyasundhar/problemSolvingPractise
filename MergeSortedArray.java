class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        int counter=0, iterator1 = 0, iterator2=0;
        while(iterator1<m || iterator2<n){
            if(counter<nums1.length && nums1[counter]!=0)
                nums1Copy[counter]=nums1[counter];
            if(iterator1<m && iterator2<n)
                nums1[counter++]=nums1Copy[iterator1]<nums2[iterator2]?nums1Copy[iterator1++]:nums2[iterator2++];
            else if(iterator1<m)
                nums1[counter++]=nums1Copy[iterator1++];
            else
                nums1[counter++]=nums2[iterator2++];
        }
    }
}
