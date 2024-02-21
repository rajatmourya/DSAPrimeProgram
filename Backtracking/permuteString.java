package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class permuteString {
    public static void main(String[] args) {

    }
    public List<String> permute(String str) {
        List<String> ans = new ArrayList<>();
        permHelper(str,"",0,(str.length() - 1),ans);
        return ans;
    }
    public void permHelper(String s, String cur, int l, int r, List<String> ans){
        if(l == r){
            ans.add(s);
        }
        for (int i = 0; i <= l ; i++) {
            swap(s,i,l);
        }

    }

    private void swap(String s, int i, int l) {
        char temp = s.charAt(i);
//        s.charAt(i) = s.charAt(l);

    }
}
