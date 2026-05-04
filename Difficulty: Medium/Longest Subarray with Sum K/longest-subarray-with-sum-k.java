// User function Template for Java

class Solution {
    public int longestSubarray(int[] nums, int k) {
        // code here
        int maxLen =0;
        
        int currSum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        map.put(0,-1);

    
        for(int right=0;right<nums.length;right++){
            currSum+=nums[right];
            
            int target = currSum-k;
          
            if(map.containsKey(target)){
                
                int left = map.get(target);
                maxLen=Math.max(maxLen,(right-left));
                
            }
            
            if(!map.containsKey(currSum))map.put(currSum,right);
            


        }

        return (maxLen==Integer.MIN_VALUE)?0:maxLen;
    }
}
