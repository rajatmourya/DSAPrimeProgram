package DataStructure.Array.Questions;

import java.util.*;

public class IntegersContainingOnly_1_2_and_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element in the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int arr[] = {321, 123, 89, 32, 11};
//        int n = arr.length;
        List<Integer> ans = find123Digits(arr,n);
        for(int e : ans){
            System.out.println(e + " ");
        }

    }
    public static List<Integer> find123Digits(int[] arr, int n)
    {
        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int temp =  arr[i];

            boolean ifYes1 = false;
            boolean ifYes2 = false;
            boolean ifYes3 = false;
            while (temp > 0){
                if(temp%10 == 1){
                    ifYes1 = true;
                }else if(temp%10 == 2){
                    ifYes2 = true;
                } else if (temp%10 == 3) {
                    ifYes3 = true;
                }
                temp /= 10;
            }
            if(ifYes1 && ifYes2 && ifYes3 ){
                ans.add(arr[i]);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
