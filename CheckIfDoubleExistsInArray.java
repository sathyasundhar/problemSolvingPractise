/*Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j] */
import java.io.*;
import java.util.*;
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> a = new HashSet();
        for(int i=0;i<arr.length;i++){
            boolean div= arr[i]%2 == 0 ? true : false;
            if(a.contains(arr[i]*2) || (a.contains(arr[i]/2) && div))
                return true;
            a.add(arr[i]);
        }
        return false;
    }
}
