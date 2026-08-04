class Solution {
    public int missingNumber(int[] nums) {

        int allXOR = 0;

        //XOR for all number in length
        for(int i = 0; i<=nums.length; i++){     
            allXOR = allXOR^i;
        }

        //XOR for all number in array
        for(int value: nums){
            allXOR = allXOR^value;
        }

        return allXOR;
        
    }
}