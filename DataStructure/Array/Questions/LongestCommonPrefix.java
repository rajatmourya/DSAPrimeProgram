package DataStructure.Array.Questions;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number Element in the Array: ");
//        int n = sc.nextInt();
//        System.out.println("Enter the  Element in the Array: ");
//        String[] arr = new String[n];
//        for (int i = 0; i < 4; i++) {
//            arr[i] = sc.nextLine();
//        }
//        String[] arr = {"hello","heskel","help"};
//        String[] arr = {"prime","protect","promo"};
//        String[] arr = {"abcde","abcd", "abc", "ab", "a"};
        String[] arr = {"cir","car"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String temp = strs[i];
            int minIndex = Math.min(temp.length(),ans.length());
            String a = "";
            for (int j = 0; j < minIndex; j++) {
                if(temp.charAt(j) == (ans.charAt(j))) {
                    a = a + ans.charAt(j);
                }else {
                    break;
                }
            }
            ans = a;
        }
        return ans;

    }
}
