package Backtracking;

import java.util.Scanner;

public class knightTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
//        int n = 5;
//        int m = 5;
        int a[][] = knightTour(n,m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] knightTour(int n, int m) {
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                a[i][j] =  -1;
            }
        }
        a[0][0] = 0;
        int moveX[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int moveY[] = {1, 2, 2, 1, -1, -2, -2, -1};
        knightTourHelper(n,m,a,moveX,moveY,0,0,1);
        if(m > 1 && a[0][1] == -1){
            a[0][0] = -1;
        }

        if(n > 1 && a[1][0] == -1){
            a[0][0] = -1;
        }
        return a;
    }
    static boolean knightTourHelper(int n, int m, int a[][], int moveX[],
                                    int moveY[], int curX, int curY,int step){
        if (step == n*m) return true;

        for (int i = 0; i <8 ; i++) {
            int nextX = curX + moveX[i];
            int nextY = curY + moveY[i];
            if (isValid(n,m,a,nextX,nextY)){
                a[nextX][nextY] = step;
                boolean isTourCompleteByGoingThere =
                        knightTourHelper(n,m,a,moveX,moveY,nextX,nextY,step+1);
                if (isTourCompleteByGoingThere){
                    return true;
                }else{
                    a[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }
    static boolean isValid(int n, int m,int a[][], int x, int y){
        return x >= 0 && y >= 0 && x < n && y < m && a[x][y] == -1;
    }


























//    public static int[][] knightTour(int n, int m) {
//        int[][] a = new int[n][m];
//        for(int i=0;i<n;i++){
//            for (int j = 0; j < m; j++) {
//                a[i][j] =  -1;
//            }
//        }
//        a[0][0] = 0;
//        int moveX[] = {2, 1, -1, -2, -2, -1, 1, 2};
//        int moveY[] = {1, 2, 2, 1, -1, -2, -2, -1};
//        knightTourHelper(n,m,a,moveX,moveY,0,0,1);
////        if(m > 1 && a[0][1] == -1){
////            a[0][0] = -1;
////        }
////
////        if(n > 1 && a[1][0] == -1){
////            a[0][0] = -1;
////        }
//        return a;
//
//
//    }
//
//    static boolean knightTourHelper(int n, int m, int a[][], int moveX[],
//                                 int moveY[], int curX, int curY,int step){
//        if (step == n*m) return true;
//
//        for (int i = 0; i <8 ; i++) {
//            int nextX = curX + moveX[i];
//            int nextY = curY + moveY[i];
//            if (isValid(n,m,a,nextX,nextY)){
//                a[nextX][nextY] = step;
//                boolean isTourCompleteByGoingThere =
//                        knightTourHelper(n,m,a,moveX,moveY,nextX,nextY,step + 1);
//                if (isTourCompleteByGoingThere){
//                    return true;
//                }else{
//                    a[nextX][nextY] = -1;
//                }
//            }
//        }
//        return false;
//    }
//    static boolean isValid(int n, int m,int a[][], int x, int y){
//        return x >= 0 && y >= 0 && x < n && y < m && a[x][y] == -1;
//    }
}
