package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to get Factorial : ");
        int n = sc.nextInt();
        int fac = fac(n);
        System.out.println(fac);
    }
    static int fac(int n){
        if(n > 0){
            return n * fac( n-1);
        }
        return 1;
    }
}
