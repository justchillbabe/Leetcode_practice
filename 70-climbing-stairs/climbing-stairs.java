class Solution {
    public int climbStairs(int n) {
       int count = 0;
       if(n<2){
        return n;
       }
       int older = 1;
       int current = 2;
       for(int i = 3; i<=n; i++){
        
        int new_ans = older + current;
        older = current;
        current = new_ans; 
       }
       return current;
    }
}