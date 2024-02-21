package Recursion;
import java.util.Scanner;
public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();
        int sum = sumof(n);
        System.out.println("Sum of " + n + " Natural NUmber is = " + sum);
    }
    static int sumof(int n){
        if(n == 1){
            return 1;
        }return n + sumof(n-1);
    }
}
