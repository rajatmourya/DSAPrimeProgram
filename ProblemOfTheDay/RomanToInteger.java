package ProblemOfTheDay;

import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Romen Number: ");
        String s = sc.next();

        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s)
    {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        int ans = 0;
        int prev = 0;
        for(int i = 0;i < s.length();i++){
            prev = switch (s.charAt(i)) {
                case 'I' -> {
                    ans += I;
                    yield I;
                }
                case 'V' -> {
                    if (prev < V) {
                        ans += (V - prev * 2);
                    } else {
                        ans += V;
                    }
                    yield V;
                }
                case 'X' -> {
                    if (prev < X) {
                        ans += (X - prev * 2);
                    } else {
                        ans += X;
                    }
                    yield X;
                }
                case 'L' -> {
                    if (prev < L) {
                        ans += (L - prev * 2);
                    } else {
                        ans += L;
                    }
                    yield L;
                }
                case 'C' -> {
                    if (prev < C) {
                        ans += (C - prev * 2);
                    } else {
                        ans += C;
                    }
                    yield C;
                }
                case 'D' -> {
                    if (prev < D) {
                        ans += (D - prev * 2);
                    } else {
                        ans += D;
                    }
                    yield D;
                }
                case 'M' -> {
                    if (prev < M) {
                        ans += (M - prev * 2);
                    } else {
                        ans += M;
                    }
                    yield M;
                }
                default -> prev;
            };
        }
        return ans;
    }

}
