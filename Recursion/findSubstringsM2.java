package Recursion;

import java.util.*;
import java.util.Scanner;

public class findSubstringsM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String: ");
//        String s = sc.next();
        String s = "abc";
        System.out.println(findSubstring(s));
    }
    static List<String> findSubstring(String s){
        List<String> ans = new ArrayList<>();
        findSubstringHelpper(s,0,"", ans);
        return ans;
    }

    static void findSubstringHelpper(String s, int i, String cur,List<String> ans){
        if(i == s.length()){
            ans.add(cur);
            return;
        }
        findSubstringHelpper(s, i+1,cur + s.charAt(i),ans);
        findSubstringHelpper(s, i+1,cur,ans);

    }

}
