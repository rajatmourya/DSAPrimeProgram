package DataStructure.Array.Questions;

import java.util.Scanner;

public class DifferencePossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element in the Array: ");
        int n = sc.nextInt();
//        int[] arr = {1, 9, 10, 8, 2, 2, 10, 7, 9, 1};
        int[] arr = new int[n];
        System.out.println("Enter the Element of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int arr[] = {1, 1, 1, 2, 2, 6, 8, 8, 8};
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
//        int k = 2;
        System.out.println(diffPossible(arr, k));
    }

    public static boolean diffPossible(int[] arr, int k){
        int n = arr.length;
        boolean ans =  false;
        for (int i = 0; i < n -1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    continue;
                }
                else if( (arr[i] - arr[j] == k) || (arr[j] - arr[i] == k)){
                    ans =  true;
                }
            }
            if (ans){
                break;
            }
        }
        return ans;
    }
}
