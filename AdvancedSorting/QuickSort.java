package AdvancedSorting;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Number of Element in the List: ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of the List: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        quickSort(arr,0,n-1);
        for (int e: arr){
            System.out.print(e + " ");
        }
    }

    static void quickSort(int[] arr, int l, int h) {
        if(l < h){
            int pivot = partition(arr,l,h);
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,h);
        }
    }
    static int partition(int[] a, int l,int h){
        int pivote = a[l];
        int i = l, j = h;

        while (i <= j) {
            while (i <= h && a[i] <= pivote) i++;
            while (j >= 0 && a[j] > pivote) j--;
            if(i < j) swap(a,i,j);
        }
        swap(a,l,j);
        return j;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
