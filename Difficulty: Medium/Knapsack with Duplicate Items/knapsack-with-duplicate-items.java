class Solution {
    
    int check(int val[],int wt[],int capacity,int bag,int idx,int[][]dp){
        
        if(idx>=val.length) return 0;
        if(capacity==bag) return 0;
        
        if( dp[idx][bag]!=-1 )return dp[idx][bag];
        
        int skip = check(val,wt,capacity,bag,idx+1,dp);
        int pick=0;
        
        if(bag+wt[idx]<=capacity){
         pick= val[idx]+check(val,wt,capacity,bag+wt[idx],idx,dp);
        }


        return dp[idx][bag] = Math.max(pick,skip);
        
        
    }
    
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int row=val.length;
        int col=capacity+1;
        
        int[][] dp = new int[row][col];
        
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        
        
        return check(val,wt,capacity,0,0,dp);
        
    }
}