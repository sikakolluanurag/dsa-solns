package subArraySumEqualsK;

import java.util.HashMap;

/**
 * <a href="https://www.youtube.com/watch?v=XjP2mQr98WQ"> Subarray Sum Equals K Solution Explanation </a>
 */

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] input1 = {4,5,1,3,2,3,4};
        int k1 = 9;

        int res1 = solution.subarraySum(input1, k1);

        assert res1 == 4;
        System.out.println("res1: " + res1);

        int[] input2 = {1,2,3,-3,1,1,1,4,2,-3};
        int k2 = 3;

        int res2 = solution.subarraySum(input2, k2);

        System.out.println("res2: " + res2);

    }

    public int subarraySum(int[] nums, int k) {

        int count = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            Integer existingSumOcc = prefixSumCount.getOrDefault((prefixSum - k), 0);
            count += existingSumOcc;

            Integer val = prefixSumCount.getOrDefault(prefixSum, 0);
            prefixSumCount.put(prefixSum, val + 1);
        }

        return count;
    }
}
