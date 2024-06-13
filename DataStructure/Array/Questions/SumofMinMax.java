package DataStructure.Array.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SumofMinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> nums = new ArrayList<>();
        System.out.println("Enter the Number of Element in the Array: ");
        long n = sc.nextLong();
        for (long i = 0; i < n; i++) {
            nums.add(sc.nextLong());
        }

        System.out.println(sumMaxMin(nums));

    }
    public static long sumMaxMin(List<Long> nums) {
        Collections.sort(nums);
        return nums.getLast() + nums.getFirst();


    }
}
