package Recursion;

import java.util.Scanner;

public class josephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n & k :");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(josephus(n,k) + " person win this game !");
    }

    static int josephus(int n, int k){
        return josephushelpper(n,k) +1;
    }
    public static int josephushelpper(int n, int k ){
        if(n==1)return 0;
        return (josephushelpper(n-1,k) + k) % n ;
    }
}
