package Recursion;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        if(palindrome(s)){
            System.out.println(s + " is a Palindrome String !");
        }
        else{
            System.out.println(s + " is not a Palindrome String !");
        }

    }
    static boolean palindrome(String s){
        int l = 0;
        int r = s.length()-1;
        return palindromeHelpper(s,l,r);
    }

    static boolean palindromeHelpper(String s, int l, int r){
        if(l>=r) return true;
        if(s.charAt(l)==s.charAt(r)) {
            return palindromeHelpper(s,l+1,r-1);
        }
        else {
            return false;
        }
    }
}
