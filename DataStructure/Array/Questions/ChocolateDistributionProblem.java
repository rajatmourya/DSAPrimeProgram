package DataStructure.Array.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of element in the Arrays: ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of the Arrays: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number of student: ");
        System.out.println(findMinDiff(arr,sc.nextInt()));
    }
    public static int findMinDiff(int[] arr, int m)
    {
        int minDiff = Integer.MAX_VALUE;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - m + 1; i++) {
            int temp  = arr[m+i-1] - arr[i];
            if(temp < minDiff){
                minDiff = temp;
            }
        }
        return minDiff;
    }
}
