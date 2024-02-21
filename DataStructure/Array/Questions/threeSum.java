package DataStructure.Array.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int a[] = {-2,0,1,2,1 };
//        int sum = 5;
        Arrays.sort(a);

        for(int e:a){
            System.out.print(e+" ");
        }
        System.out.println();
//        List<List<Integer>> ans= twoSum(a,sum,0);
//        System.out.println(ans);

        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0;i < a.length-2;i++){
            if(i>0 && a[i] == a[i-1]) continue;
            List<List<Integer>> temp = twoSum(a,-a[i],i+1);
            for (List<Integer> list: temp){
                list.add(0,a[i]);
                triplets.add(list);
            }
        }
        System.out.println(triplets);





    }

    static List<List<Integer>> twoSum(int[] a, int sum, int startFrom){
        int l = startFrom;
        int r = a.length-1;
        List<List<Integer>> ans = new ArrayList<>();

        while(l < r){
            if(l > startFrom && a[l] == a[l-1] ){
                l++;
                continue;
            }
            if(r < a.length-1 && a[r] == a[r+1]){
                r--;
                continue;
            }
            if(a[l] + a[r] > sum){
                r--;
            } else if (a[l] + a[r] < sum) {
                l++;
            }else {
                List<Integer> temp = new ArrayList<>();
                temp.add(a[l]);
                temp.add(a[r]);
                ans.add(temp);
                l++;
                r--;
            }

        }
        return ans;
    }
}
