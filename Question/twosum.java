package Question;

import java.util.ArrayList;
import java.util.List;

public class twosum {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int nums[] = {2,7,11,15};
        int a[] = twoSum(nums,9,ans);
        printArray(a);

    }

    private static int[] twoSum(int[] nums, int i,List<List<Integer>> ans) {
        int a[] = new int[2];
        for (int j = 0; j < nums.length; j++) {
            for (int k = j+1; k < nums.length; k++) {
                if(nums[j]+nums[k] == i){
                    a[0] = j;
                    a[1]= k;
                    break;
                }
            }
        }
        return a;
    }

    public static void printArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }

}
