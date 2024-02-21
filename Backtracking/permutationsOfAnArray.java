package Backtracking;
import java.util.*;
import java.util.stream.Collectors;

public class permutationsOfAnArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        permuteHellper(nums,0,(nums.length)-1, ans);
                    ans.sort((x, y) -> {
                        for (int i = 0; i < Math.min(x.size(), y.size()); i++) {
                            if (x.get(i) != y.get(i)) {
                                return x.get(i) - y.get(i);
                            }
                        }
                        return x.size() - y.size();
                    });
        return ans;
    }
    static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void permuteHellper (int[] a, int l, int r,List<List<Integer>>ans) {

        if(l==r){
            List<Integer> b = new ArrayList<Integer>();
            for(int i = 0; i < a.length; i++){
                b.add(a[i]);
            }
            ans.add(b);
            return;
        }
        for(int i = l; i <= r; i++){
            swap(a,i,l);
            permuteHellper(a, l+1, r, ans);
            swap(a,i,l); //Backtracking
        }
    }


}
