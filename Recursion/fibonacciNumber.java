package Recursion;

import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int fib = fib(n);
        System.out.println("Number is :" + fib);
    }
    static int fib(int n){
        if(n <= 1){
            return n;
        }return fib(n-1) + fib(n-2);
    }
}
