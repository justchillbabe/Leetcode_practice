import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>sumcountMap = new HashMap<>();
        sumcountMap.put(0,1);
        int count = 0;
        int prefix_sum = 0;
        for(int num: nums){
            prefix_sum += num;
            if(sumcountMap.containsKey(prefix_sum - k)){
                count += sumcountMap.get(prefix_sum-k);
            }
             sumcountMap.put(
                prefix_sum,
                sumcountMap.getOrDefault(prefix_sum, 0) + 1
            );
        }
        return count;
    }
}