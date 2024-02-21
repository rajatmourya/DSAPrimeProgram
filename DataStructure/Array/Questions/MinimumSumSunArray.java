package DataStructure.Array.Questions;

import java.util.*;
public class MinimumSumSunArray {
    public static void main(String[] args) {
        int[] a = {1,2,5,6,7,2};
        int k = 8;
        int n = minSubArrayLen(k,a);
        System.out.println(n);

     }

     static int minSubArrayLen(int K, int[] A) {
        int l = 0;
        int r = 0;
        int minlength = Integer.MAX_VALUE;
        int n = A.length;
        int sum = 0;
        while(r<n){
            sum += A[r];
            while (sum >= K){
                    minlength = Math.min(minlength,r-l+1);
                    sum -= A[l];
                    l++;
            }
            r++;
        }
        if(minlength == Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
    }

}
