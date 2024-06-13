package DataStructure.Array.Questions;

import java.util.List;
import java.util.Scanner;

public class SpiralOrderMatrix_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element in the Array: ");
        int n = sc.nextInt();
//        int n = 4;
        int arr[][] = spiralOrderMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] spiralOrderMatrix(int n) {
        int value = 1;
        int[][] arr = new int[n][n];
        int topRow = 0, botRow = n-1, rightCol = n-1, leftCol = 0;
        while (topRow <= botRow && leftCol <= rightCol) {
            for (int c = leftCol; c < rightCol; ++c) {

                arr[topRow][c] = value;
                value++;
            }
            for (int r = topRow; r < botRow; ++r){
                arr[r][rightCol] = value;
                value++;
            }
            for (int c = rightCol; c > leftCol; c--) {
                arr[botRow][c] = value;
                value++;
            }
            for (int r = botRow; r > topRow; r--){
                arr[r][leftCol] = value;
                value++;
            }
            topRow++;
            leftCol += 1;
            botRow--;
            rightCol--;
        }
        if(n%2 != 0){
            int temp = n/2;
            arr[temp][temp] = value;
        }
            return arr;
    }
}
