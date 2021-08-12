class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){ 
            
            for(int k=arr.length-1;k>=i+1;k--){
                if(k+1<arr.length){
                    arr[k+1]=arr[k];
                }
                
            }
            if(i+1<arr.length){
                arr[i+1]=0;
                i+=1;  
            } 
            
            }           
        }
    }
}
