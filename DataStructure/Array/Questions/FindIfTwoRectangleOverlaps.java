package DataStructure.Array.Questions;

import java.util.Scanner;

public class FindIfTwoRectangleOverlaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[4];
        int[] a2 = new int[4];
        System.out.println("Enter the  Element in the First Array: ");
        for (int i = 0; i < 4; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter the  Element in the Second Array: ");
        for (int i = 0; i < 4; i++) {
            a2[i] = sc.nextInt();
        }
        System.out.println(isRectangleOverlap(a1,a2));
    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2){
        if(rec1[2] <= rec2[0] || rec2[2] <= rec1[0]) {
            return false;
        }
        if(rec1[3] <= rec2[1] || rec2[3] <= rec1[1]) {
            return false;
        }
        return true;

    }
}
