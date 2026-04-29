class Solution {
    
    int count(int n){
        if(n<=1) return 0;
        if(n==2) return 1;
        
        return (n-1)*(count(n-1)+ count(n-2));
    }
    public int derangeCount(int n) {
        // code here
        
        return count(n);
        
    }
};