package GreedyProgramming;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LeetCode_100334_FindTheMinimumAreaToCoverAllOnesI {
    public static void main(String[] args) {
////        int[] nums = {1,-2,3,4};
////        int[] nums = {1,-1,1,-1};
//        int[] nums = {-13,3};
////
////        int[] nums = {1,-1};
//        int[][] grid = {{0,1,0},
//                {1,0,1}};
        System.out.println("enter the value of n & m: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
//        System.out.println(maximumTotalCost(nums));
        System.out.println(minimumArea(grid));
    }
    public static int minimumArea(int[][] grid) {
        int minRow = Integer.MAX_VALUE, maxRow = Integer.MIN_VALUE, minCol = Integer.MIN_VALUE, maxCol = Integer.MAX_VALUE;
        boolean foundOne = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                    foundOne = true;
                    if (i < minRow) {
                        minRow = i+1;
                    }
                    if (i > maxRow) {
                        maxRow = i+1;
                    }
                    if (j < minCol) {
                        minCol = j+1;
                    }
                    if (j > maxCol) {
                        maxCol = j+1;
                    }
                }
            }
        }
        int numRows = maxRow - minRow + 1;
        int numCols = maxCol - minCol + 1;
        if (!foundOne){
            return 0;
        }
        return numCols*numRows;

    }

    public static long maximumTotalCost(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (i%2 != 0 && nums[i] < 0){
                ans += nums[i]*(-1);
            }else {
                ans += nums[i];
            }
        }
        return ans;
//        100332. Find the Minimum Area to Cover All Ones II
//        100337. Maximize Total Cost of Alternating Subarrays
//        100334. Find the Minimum Area to Cover All Ones I
    }
}
