package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurrenceOfAnElementInASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element in the Array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Element of the Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Searching Value: ");
        int k = sc.nextInt();

//        int a[] = {5,5,5,8,9,9,15,16};
//        int k = 9;


        Arrays.sort(a);
        System.out.println(FirstOccurrenceOfAnEISA(a,k));

    }
    static int FirstOccurrenceOfAnEISA(int[] a, int k){
        int l = 0, r = a.length-1;
        int ans = -1;
        while (l <= r){
            int m = l + (r - l)/2;
            if(k < a[m]){
                r = m - 1;
            }else if(k > a[m]){
                l = m + 1;
            }else {
                ans = m;
                r = m - 1;
            }
        }

        return ans;
    }
}
