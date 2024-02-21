package DataStructure.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class waveArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        int[] a = {21,4,78,6,8,41,2};
        for (int e:a) {
         A.add(e);
        }
        wave(A);
        System.out.println(A);

//        System.out.println();
//        waveArrayNotLexographic(a);
//        printArray(a);
//        System.out.println();
//        wavearray(a);
//        printArray(a);
    }



    static public ArrayList<Integer> wave(ArrayList<Integer> A) {
        return waveHelpper(A);

    }

    static private ArrayList<Integer> waveHelpper(ArrayList<Integer> a) {
        Collections.sort(a);  // 0(nlogn)
        int n = a.size();
        for (int i = 1; i < n; i+=2) {
            swap(a,i,i-1);
        };
        return a;
    }

    static private void swap(ArrayList<Integer> a, int i, int j) {
        int temp = a.get(i);
        a.set(i,a.get(j));
        a.set(j,temp);

    }

    static void wavearray(int a[]){
        Arrays.sort(a);  // 0(nlogn)
        int n = a.length;
        for (int i = 1; i < n; i+=2) {
            swap(a,i,i-1);
        }
    }
    static void waveArrayNotLexographic(int a[]){
        int n = a.length;
        for (int i = 1; i < n; i+=2) {
            if(a[i] > a[i-1]){
                swap(a,i,i-1);
            }
            if (i < n-1 && a[i] > a[i+1]){
                swap(a,i,i+1);
            }
        }
    }
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void printArray(int[] a){
        for (int e: a) {
            System.out.print(e + " ");
        }
    }
}
