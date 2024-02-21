package Recursion;

import java.util.Scanner;
import java.util.*;

public class findSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
//        String s = "abc";
        findSubstring(s);
    }
    static void findSubstring(String s){

        findSubstringHelpper(s,0,"");
    }

    static void findSubstringHelpper(String s, int i, String cur){
        if(i == s.length()){
            System.out.println(cur);
            return;
        }
        findSubstringHelpper(s, i+1,cur + s.charAt(i));
        findSubstringHelpper(s, i+1,cur);

    }
}
