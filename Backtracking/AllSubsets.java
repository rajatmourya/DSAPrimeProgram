package Backtracking;

import java.util.*;

public class AllSubsets {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        ArrayList<ArrayList<Integer>> nums = AllSubsets.AllSubset(num);
        System.out.println(nums);

    }
    public static ArrayList<ArrayList<Integer>> AllSubset(ArrayList<Integer> nums)  {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        AllSubsetHelper(nums,ans,0,a);
        ans.addAll(Collections.singleton(nums));
        ans.sort((x, y) -> {
            for (int i = 0; i < Math.min(x.size(), y.size()); i++) {
                if (x.get(i) != y.get(i)) {
                    return x.get(i) - y.get(i);
                }
            }
            return x.size() - y.size();
        });

        Set<ArrayList<Integer>> ans1 = new HashSet<>(ans);

        return (ArrayList<ArrayList<Integer>>)ans1;
    }
    static void AllSubsetHelper(ArrayList<Integer> num, ArrayList<ArrayList<Integer>>ans,int i,ArrayList<Integer>  a){
        if (i >= num.size()) {
            if(ans.contains(a)) return;
            ans.add(new ArrayList<>(a));
            return;
        }
        a.add(num.get(i));
        AllSubsetHelper(num,ans, i + 1, a);
        a.remove(a.size() - 1);
        AllSubsetHelper(num,ans, i + 1, a);
    }
}
