package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class LowerBoundInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number of Element in the Array: ");
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        System.out.println("Enter the Element of the Array: ");
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }

        int a[] = {1,2,4,6,8,9,12};
//        int k = 0;


        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Enter the Searching Value: ");
        int k = sc.nextInt();


        System.out.println(lowerBound(a, k));

    }
    public static int lowerBound(int[] a, int k){
        int l = 0, r = a.length - 1;
        int ans = -1;
        while (l <= r){
            int m = l + (r-l)/2;
            if (a[m] < k){
                ans = m;
                l = m + 1;
            } else if (a[m] >= k) {
                r = m - 1;
            }
        }
        return ans;
    }
}
