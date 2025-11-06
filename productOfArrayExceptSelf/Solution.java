package productOfArrayExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int zerosCount = 0;

        int prod = 1;

        for (int i =0; i<n;i++) {
            if(nums[i] != 0) {
                prod = prod * nums[i];
            } else {
                zerosCount++;
                if(zerosCount > 1) {
                    prod = 0;
                    break;
                }
            }
        }

        for (int i =0; i<n;i++) {
            if(zerosCount > 1){
                res[i] = 0;
            } else if(zerosCount == 0) {
                res[i] = prod / nums[i];
            } else if(zerosCount == 1)  {

                if(nums[i]==0){
                    res[i] = prod;
                } else {
                    res[i] = 0;
                }
            }
        }

        return res;
    }
}
