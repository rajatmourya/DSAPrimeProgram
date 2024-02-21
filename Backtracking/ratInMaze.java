package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class ratInMaze {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix size ! Enter the value of n & m : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the matrix");
        for (int i = 0; i < n; i++){
            for(int j =0;j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Matrix is :");
        for (int i = 0; i < n; i++){
            for(int j =0;j < m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("All path for travel starting node to final destination : \n\n" + findPath(mat,n));
    }
    public static ArrayList< String > findPath(int[][] mat, int n) {
        ArrayList<String> ans = new ArrayList<String>();
        int m = mat[0].length;//4
        boolean[][] vis = new boolean[n][m];
        vis[0][0] = true;
        ratInAMaze(mat,vis,0,0,"",n,m,ans);
        return ans;
    }
    static boolean isValid(int i, int j, int n, int m, int[][] mat, boolean[][] vis){
        return i < n && i >= 0 && j < m && j >= 0 && mat[i][j] == 1 && !vis[i][j];
    }
    static void ratInAMaze(int[][] mat, boolean[][] vis, int i, int j, String path, int n, int m, ArrayList < String > ans){
        if (i == 0 && j == 0 && mat[i][j] == 0) {
            return;
        }
        if(i == n-1 && j == m-1){
            ans.add(path);
            return;
        }
        if(isValid(i+1,j,n,m,mat,vis)){ //D
            vis[i+1][j] = true;
            ratInAMaze(mat,vis,i+1,j,path + "D",n,m,ans);
            vis[i+1][j] = false;
        }
        if(isValid(i,j-1,n,m,mat,vis)){ //L
            vis[i][j-1] = true;
            ratInAMaze(mat,vis,i,j-1,path + "L",n,m,ans);
            vis[i][j-1] = false;
        }
        if(isValid(i,j+1,n,m,mat,vis)){ //R
            vis[i][j+1] = true;
            ratInAMaze(mat,vis,i,j+1,path + "R",n,m,ans);
            vis[i][j+1] = false;
        }
        if(isValid(i-1,j,n,m,mat,vis)){ //U
            vis[i-1][j] = true;
            ratInAMaze(mat,vis,i-1,j,path + "U",n,m,ans);
            vis[i-1][j] = false;
        }
    }


}
