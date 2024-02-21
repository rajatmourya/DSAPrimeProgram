package DataStructure.Array.Questions;

import java.util.Arrays;

public class minimumOperation {
    public static void main(String[] args) {
        int[][] a = {{0,2,8},{8,2,0},{0,2,8}};
        int n = a.length;
        int m = a[0].length;
        int k = 77;
        int ans = miniOpReq(n,m,k,a);
        System.out.println(ans);

    }

    private static int miniOpReq(int n, int m, int k, int[][] A) {
//        int[] a = {628,550,934,955,239,454,674,198,318,320,711,748,381,329,811,65,913,222,28,688,852,779,306,954,838,567,658,52,664,370,707,665,692,130,411,983,345,658,320,585,578,775,775,302,136,436,67,592,47,615,658,7,693,581};

//        int n = 9;
//        int m = 6;
        int total = m*n;
        if(n==0)return 0;
        int[] a = new int[n*m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i*m+j] = A[i][j];
            }
        }
        Arrays.sort(a);

        int median = a[total/2];

        for (int i = 0; i < total; i++) {
            System.out.println(i+" "+a[i]+ " "+ miniOpReqHelpper(a,a[i],k));
        }
//        int m1 = miniOpReqHelpper(a,median,k);
//        int m2 = miniOpReqHelpper(a,median+1,k);



        return miniOpReqHelpper(a,median,k);
    }

    private static int miniOpReqHelpper(int b[], int m, int k) {
        int count = 0;
        if(m%k!=0){
            //check=true;
            return -1;
        }
        for (int i = 0;i<b.length;i++){
            count += Math.abs(b[i]-m) / k;
        }
        return count;
    }

}
