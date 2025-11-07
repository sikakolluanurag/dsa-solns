package twoSum;

import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {

        Solution test = new Solution();

//        int[] inp1 = {2, 7, 11, 15};
//        int targetSum1 = 9;
        int[] inp1 = {2,3,3,5};
        int targetSum1 = 6;

        int[] res1 = test.twoSum(inp1, targetSum1);
        System.out.println("res1: " + Arrays.toString(res1));
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {

            Integer dupIdx = map.get(nums[i]);
            if (dupIdx != null && (nums[i] + nums[dupIdx] == target)) {
                res[0] = dupIdx;
                res[1] = i;
                break;
            }

            Integer idx = map.get(target - nums[i]);
            if (idx != null) {
                res[0] = idx;
                res[1] = i;
                break;
            }

            map.put(nums[i], i);
        }

        return res;

    }
}
