package segregateZerosAndOnesInArray;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> inpArr) {

        ArrayList<Integer> res = new ArrayList<Integer>();

        int zeroes = 0;
        for(Integer a: inpArr) {
            if(a==0){
                zeroes++;
            }
        }

        for(int i=0;i<inpArr.size();i++){
            if(zeroes != 0){
                res.add(0);
                zeroes-=1;
            } else {
                res.add(1);
            }
        }

        return res;
    }
}

