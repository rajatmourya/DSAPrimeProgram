package Recursion;

import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println("Enter the value of r :");
        int r = sc.nextInt();
        int nCr = nCr(n,r);
        System.out.println(n + "C" + r + " of is = " + nCr);
    }
    static int nCr(int n, int r){
        if(n == r || r == 0){
            return 1;
        }return nCr(n-1,r-1) + nCr(n-1,r);
    }
    
}
