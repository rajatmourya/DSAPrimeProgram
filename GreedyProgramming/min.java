package GreedyProgramming;

import java.util.Arrays;

public class min {
    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }

    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int f = 0, r = n-1;
//        System.out.println(r);
        double[] ans = new double[(n/2)+1];
        while (f < r){
            ans[f] = (double)(nums[f] + nums[r])/2;
            System.out.println(ans[f] + " " + f + " " + r);
            f++;
            r--;
        }
//        100342. Minimum Average of Smallest and Largest Elements
        Arrays.sort(ans);
//        for(double e: ans){
//            System.out.println(e);
//        }
        System.out.println();
        return ans[1];
    }
}
