class Solution {
    public static int minCost(int[] arr) {
        // code here
        
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        
        for(int elem : arr){
            maxHeap.add(elem);
        }
        int sum=0;
        while(maxHeap.size()>1){
            int up = maxHeap.remove();
            int down = maxHeap.remove();
            sum = sum+ up+down;
            maxHeap.add(up+down);
        }
        return sum;
    }
}