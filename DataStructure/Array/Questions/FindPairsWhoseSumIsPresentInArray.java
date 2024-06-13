package DataStructure.Array.Questions;

import java.util.*;

public class FindPairsWhoseSumIsPresentInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element in the Array: ");
        int n = sc.nextInt();
//        int[] arr = {1, 9, 10, 8, 2, 2, 10, 7, 9, 1};
        int arr[] = new int[n];
        System.out.println("Enter the Element of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = findPair(arr);
        for(List<Integer> e: ans){
            for(Integer i: e){
                System.out.print(i + " ");
            }
            System.out.println();
        }



    }
    public static List<List<Integer>> findPair(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(((arr[i] + arr[j]) == arr[k]) && i != j){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        ans.add(temp);
                    }
                }
            }

        }
        ans.sort((a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return a.get(0).compareTo(b.get(0));
            } else {
                return a.get(1).compareTo(b.get(1));
            }
        });
        return ans;

    }
}
//
//System.out.println("hi");
//List<Integer> temp = new ArrayList<>();
//                        temp.add(i);
//                        temp.add(j);
//                        ans.add(temp);
//                        System.out.println(temp);
//[
//        [1, 1]
//        [1, 7]
//        [1, 8]
//        [1, 9]
//        [1, 9]
//        [2, 7]
//        [2, 7]
//        [7, 1]
//        [8, 1]
//        [8, 2]
//        [8, 2]
//        [9, 1]
//        [9, 1]
//
//        [
//        [1, 9]
//        [1, 8]
//        [1, 7]
//        [1, 9]
//        [1, 1]
//        [9, 1]
//        [8, 2]
//        [8, 2]
//        [8, 1]
//        [2, 7]
//        [2, 7]
//        [7, 1]
//        [9, 1]
//        ]