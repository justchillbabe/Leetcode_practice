class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i= 0, j=1;
        int [] ans = {i,j};
        for( i = 0; i<nums.length-1; i++){
            for( j = 1; j<nums.length; j++){
                
                if(nums[i]+nums[j]==target && i!=j){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}