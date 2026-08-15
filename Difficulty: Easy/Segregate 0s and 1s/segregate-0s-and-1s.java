class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int read=0;
        int write=0;
        while(read<arr.length){
            if(arr[read]==0){
                arr[write]=0;
                write++;
            }
            read++;
        }
        while(write<arr.length){
            arr[write++]=1;
            
        }
        
        
    }
}
