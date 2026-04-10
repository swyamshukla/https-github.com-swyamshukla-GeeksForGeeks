class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        // Arrays.sort(arr);
        // return arr[k-1];
        
        // using minHeap
        // insert all element in heap 
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int i =0;
        while(i<arr.length){
            minHeap.add(arr[i]);
            i++;
        } // O(nLogn)
        
        // remove kth
        i=0;
        while(i<k-1){
            minHeap.remove();
            i++;
        }
        return minHeap.remove();
        
        
        
    }
}
