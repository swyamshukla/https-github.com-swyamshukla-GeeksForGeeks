class Solution {

    static Boolean check(int[] arr, int sum,int idx,Boolean[][] dp){
        
if(sum == 0) return true;
if(idx == 0) return arr[0] == sum;
        
        if(dp[idx][sum]!=null) return dp[idx][sum];
        
        Boolean take= false;
        
        if(sum-arr[idx]>=0){
            take = check(arr,sum-arr[idx],idx-1,dp);
        }
        
        Boolean skip =check(arr,sum,idx-1,dp);
        return dp[idx][sum] = take || skip;
        
    }
    
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        Boolean[][] dp = new Boolean[arr.length+1][sum+1];
        
        for(Boolean[] crr : dp){
            Arrays.fill(crr,null);
        }
        
        return check(arr,sum,arr.length-1,dp);
        
    }
}