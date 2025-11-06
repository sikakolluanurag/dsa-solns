package twoSumInputArraySorted;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int len = numbers.length;
        int l = 0;
        int r = len-1;
        int[] res = new int[2];

        for(int i=0;i<len;i++) {
            int sum = numbers[l] + numbers[r];
            if(sum == target) {
                res[0] = l+1;
                res[1] = r+1;
                break;
            } else if(sum > target) {
                r--;
            } else {
                l++;
            }
        }

        return res;
    }
}
