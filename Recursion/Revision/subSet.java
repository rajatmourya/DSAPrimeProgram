package Recursion.Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subSet {
    public static void main(String[] args) {
        String s = "abc";
        List<String> ans = new ArrayList<>();
        ans.addAll(subSetOfString(s));
        System.out.println(ans);
    }

    private static List<String> subSetOfString(String s) {
        List<String> ans = new ArrayList<>();
        subSetOfStringHelpper(s,0,"",ans);
        Collections.sort(ans);
        ans.remove(0);

        return ans;
    }

    private static void subSetOfStringHelpper(String s, int i, String curr, List<String> ans) {
        if(i == s.length()){
            ans.add(curr);
            return;
        }
        subSetOfStringHelpper(s, i+1,curr,ans);
        subSetOfStringHelpper(s, i+1,curr + s.charAt(i),ans);

    }
}
