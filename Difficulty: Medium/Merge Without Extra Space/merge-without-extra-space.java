class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int readA = a.length-1;
        int readB= 0;
        
        while(readA>=0 && readB<b.length){
            if(a[readA]>b[readB]){
                int temp = a[readA];
                a[readA]=b[readB];
                b[readB]=temp;
                readB++;
                readA--;
            }
            else{
                readB++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
    }
}
