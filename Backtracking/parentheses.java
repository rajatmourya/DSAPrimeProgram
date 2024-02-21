package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        List<String> parenList = new ArrayList<>();
        parenList.addAll(AllParenthesis(n));
        System.out.println("Valid Parentheses are: \n" + parenList);
    }

    public static List<String> AllParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        AllParenthesisHelpper(n,"",0,0,0,ans);
        return ans;
    }

    public static void AllParenthesisHelpper(int n, String cur, int i, int open, int close,List<String> ans) {
        if(i == 2*n){
            ans.add(cur);
            return;
        }
        if(open < n){
            cur = cur + '(';
            AllParenthesisHelpper(n,cur,i + 1, open + 1,close,ans);
            cur = cur.substring(0,cur.length()-1);
        }
        if(close < open){
            cur = cur + ')';
            AllParenthesisHelpper(n,cur,i + 1, open, close + 1,ans);
        }
    }
}
