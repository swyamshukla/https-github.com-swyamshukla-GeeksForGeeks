class Solution {
    
    int check(int W,int val[], int wt[],int idx,int[][]dp){
        if(idx<0) return 0;
        int take = 0;
        if(dp[idx][W]!=-1) return dp[idx][W];
        if(wt[idx]<=W){
         take = val[idx] + check(W-wt[idx],val,wt,idx-1,dp);
        }
        int skip = check(W,val,wt,idx-1,dp);
        return dp[idx][W] = Math.max(take,skip);
        
    }
    
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        
        // i changes from 0 to val.length-1;
        // wt varies from 0 to W
        
        int[][] dp = new int[val.length][W+1];
        
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        
        
        
        return check(W,val,wt,val.length-1,dp);
        
    }
}
