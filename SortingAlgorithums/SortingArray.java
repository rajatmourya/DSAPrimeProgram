package SortingAlgorithums;

import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2,5,21,6,3,25,7,63,56,34};
        System.out.println("Choose Sorting Method : \n 1. Bubble Sort \n 2. Selection Sort \n 3. Insertion Sort");
        int choice = sc.nextInt();
        boolean selection = false;
        switch (choice) {
            case 1 -> {
                bubbleSort(a);
                selection = true;
            }
            case 2 -> {
                selectionSort(a);
                selection = true;
            }
            case 3 -> {
                insertionSort(a);
                selection = true;
            }
            default -> System.out.println("oops ! Invalid Selection.......... Please try Again");
        }
        if(selection){
            for(int e:a){
                System.out.print(e + " ");
            }
        }



    }

    static void bubbleSort(int[] a){
        int n = a.length ;
        for(int i = 0; i < n; i++){
            boolean swap = false;
            for (int j = 0; j < n-i-1; j++) {
                if(a[j+1] < a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
    }

    static void selectionSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    static void insertionSort(int[] a){
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int last = a[i];
            int swapIndex = i-1;
            while(swapIndex >= 0 && a[swapIndex] > last){
                swapIndex--;
            }
            for (int j = i; j > swapIndex ; j--) {
                a[j] = a[j-1];
            }
            a[swapIndex+1] = last;
        }

    }

}
