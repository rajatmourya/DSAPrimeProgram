package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class smartKeypadProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String inputDigits = sc.next();
        String inputDigits = "23";
        Solution sol = new Solution();
        List<String> ans = new ArrayList<>();
        ans = sol.letterCombinations(inputDigits);
        System.out.println(ans);
    }
}

class Solution {
    public List<String> letterCombinations(String digits) {
        String keypad[] = {
                "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        List<String> ans = new ArrayList<>();
        letterCombinationsHelpper(keypad,ans,digits,0,"");
        return ans;
    }

    private void letterCombinationsHelpper(String[] keypad, List<String> ans, String digits, int index, String curr) {
        if (digits.length() == index){
            ans.add(curr);
            return;
        }
        int num = digits.charAt(index) - '0';
        int x = keypad.length;
        String keypadString = keypad[num];
        for (int i = 0; i < keypadString.length(); i++) {
            curr += keypadString.charAt(i);
//            letterCombinationsHelpper(keypad,ans,digits,index+1,curr + keypad[num].charAt(i)); // without Backtracking
            letterCombinationsHelpper(keypad,ans,digits,index+1,curr); // with Backtracking
            curr = curr.substring(0,curr.length()-1);
        }
    }
}
