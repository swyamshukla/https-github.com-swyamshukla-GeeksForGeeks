class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(arr[0]);
        int idx=0;
        int i=1;
        while(!minHeap.isEmpty()){
            if(i<arr.length) {
            minHeap.add(arr[i]);
            i++;
            }

            if(minHeap.size()>k || i==arr.length){
                arr[idx]=minHeap.remove();
                idx++;
            }
        }
        
    }
}
