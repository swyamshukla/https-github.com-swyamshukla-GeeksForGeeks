class Solution {
    
    int maxElem(int[] arr){
        int length = arr.length;
        int fLarge = arr[0];
        int sLarge = 0;
        
        for(int i=1;i<length;i++){
            if(fLarge<arr[i]){
                sLarge = fLarge;
                fLarge = arr[i];
            }
            else if(sLarge<arr[i] && arr[i]!=fLarge){
                sLarge = arr[i];
            }
        }
        
        return sLarge==0 ? -1:sLarge;
        
    }
    
    
    public int getSecondLargest(int[] arr) {
        // code here
        
        return maxElem(arr);
        
    }
}