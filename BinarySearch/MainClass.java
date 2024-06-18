package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
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

//        int a[] = {1,2,3,4,6,8,9};
//        int k = 3;
//        int n = a.length;


        Arrays.sort(a);

        System.out.println("Your array is: ");
        for(int e: a){
            System.out.print(e + " ");
        }
        System.out.println();


        System.out.println("Position of " + k + " is: " + binarySearchIterative(a,k));
        System.out.println("Position of " + k + " is: " + binarySearchRecursive(a,k,0,n-1));

    }

    static int binarySearchIterative(int[] a, int k){
        int l = 0,r = a.length-1;
        while (l <= r){
            int m = l +(r-l)/2;
            if(a[m] ==k) return m;
            if(k < a[m]) r = m-1;
            else if (k > a[m]) l = m+1;
        }
        return -1;
    }

    static int binarySearchRecursive(int[] a, int k, int l, int r){
        if(l > r) return -1;
        int m = l + (r - l)/2;
        if(a[m] == k) return m;
        if(k < a[m]) return binarySearchRecursive(a,k,l,m-1);
        return binarySearchRecursive(a,k,m+1,r);
    }
}
