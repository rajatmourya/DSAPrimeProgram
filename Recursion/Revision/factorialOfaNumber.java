package Recursion.Revision;

import java.util.Scanner;

public class factorialOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+ n +"is: " + factorial(n));
    }
    public static int factorial(int n){
        if(n ==1) return 1;
        return factorial(n -1) * n;
    }
}
