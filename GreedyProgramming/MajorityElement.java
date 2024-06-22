package GreedyProgramming;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of the Array: ");
        int[] a = new int[n];
//        int[] a = {3, 3, 4, 2, 4, 4, 2,  4};
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(majorityElement(a));
    }
    static int majorityElement(int[] a){
        int count = 1;
        int majority = a[0];
        for (int j : a) {
            if (j == majority) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                majority = j;
                count = 1;
            }
        }

        int freq = 0;
        for (int e: a) {
            if(majority == e){
                freq++;
            }
        }

        return (freq > a.length/2) ? majority : -1;
    }
}
