package DataStructure.Array;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maximunAbsoluteDifference {
    public static void main(String[] args) {
//        int arr[] = {12,9,8,2,11,5,4};
        int arr[] = {1,3,-1};
        ArrayList<Integer> a = new ArrayList<Integer>();
        a = arrayToArrayList(arr);

        System.out.println(a);

//        System.out.println(maxAbDif(arr));
        System.out.println(maxArr(a));




    }
    static ArrayList<Integer> arrayToArrayList(int a[]){
        ArrayList<Integer> ArList = new ArrayList<>();
        for (int e: a) {
            ArList.add(e);
        }
        return ArList;
    }
    static int maxAbDif(int[] a){
        int n = a.length;
        int[] aipi = new int[n];
        int[] aimi = new int[n];

        for (int i = 0; i < n; i++) {
            aipi[i] = a[i] + i;
            aimi[i] = a[i] - i;
        }
        int maxaipi = Integer.MAX_VALUE;
        int minaipi = Integer.MIN_VALUE;

        int maxaimi = Integer.MAX_VALUE;
        int minaimi = Integer.MIN_VALUE;
        for (int e: aipi) {
            maxaipi = Math.max(maxaipi,e);
            minaipi = Math.min(minaipi,e);
        }
        for (int e: aimi) {
            maxaimi = Math.max(maxaimi,e);
            minaimi = Math.min(minaimi,e);
        }
        int difaipi = maxaipi - minaipi;
        int difaimi = maxaimi - minaimi;
        System.out.println(difaimi+difaipi);
        return Math.max(difaimi,difaipi);
    }
    public static int maxArr(ArrayList<Integer> a){
        int n = a.size();

        int maxaipi = Integer.MIN_VALUE;
        int minaipi = Integer.MAX_VALUE;

        int maxaimi = Integer.MIN_VALUE;
        int minaimi = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            maxaipi = Math.max(maxaipi,a.get(i)+i);
            minaipi = Math.min(minaipi,a.get(i)+i);

            maxaimi = Math.max(maxaimi,a.get(i)-i);
            minaimi = Math.min(minaimi,a.get(i)-i);
        }

        int difaipi = maxaipi - minaipi;
        int difaimi = maxaimi - minaimi;

        return Math.max(difaipi,difaimi);

    }

}
