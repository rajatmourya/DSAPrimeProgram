package DataStructure.Array.Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class multipleLeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] =  {1,2,3,4,5};
        int b[] = {2,3,5,2,6};
        int[][] ans = LeftRotation(a,b);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] LeftRotation(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[][] ans = new int[m][n];
        int ret[] = new int[n];
        int my[] = new int[n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                my[j] = a[j];
            }
            ret = LeftRotationhelpper(my,n,b[i]);
            for (int j = 0; j < n; j++) {
                ans[i][j] = ret[j];
            }

        }

        return ans;

    }
    public static int[] LeftRotationhelpper(int[] a, int n,int time){
        int temp = a[0];
//        int [] ans = new int[n];
        for (int j = 0; j < time; j++) {
            int tempq = a[0];
            for (int k = 0; k < n-1; k++) {
                a[k] = a[k+1];
            }
            a[n-1] = tempq;


        }
        return a;
    }
}
