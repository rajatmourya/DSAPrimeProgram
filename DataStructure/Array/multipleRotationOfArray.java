package DataStructure.Array;

public class multipleRotationOfArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] k = {20,3,6,5,9,42,444444449};
        int[][] ansl = multipleLeftRotateOfArray(a,k);
        for (int e[]:ansl) {
            printArray(e);
            System.out.println();
        }
        System.out.println("hello");
        int[][] ansr = multipleRightRotateOfArray(a,k);
        for (int e[]:ansr) {
            printArray(e);
            System.out.println();
        }
//        rotationOfArray(a,k);


    }
    static void printArray(int[] a){
        for (int e:a) {
            System.out.print(e+" ");
        }
    }
    static int[][] multipleLeftRotateOfArray(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int[][] ans = new int[m][n];
        int[] temp = new int[2*n];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
            temp[i+n] = a[i];
        }

        for (int i = 0; i < m; i++) {
            int offset = (b[i])%n;
            for (int j = 0; j < n; j++) {
                ans[i][j] = temp[j + offset];
            }
        }

        return ans;
    }

    static int[][] multipleRightRotateOfArray(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int[][] ans = new int[m][n];
        int[] temp = new int[2*n];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
            temp[i+n] = a[i];
        }
        for (int i = 0; i < m; i++) {
            int r = (b[i])%n ;
            int offset = n - r;
            for (int j = 0; j < n; j++) {
                ans[i][j] = temp[j + offset];
            }
        }

        return ans;
    }

//    static void rotationOfArray(int[] a, int k){
//        int n = a.length;
//        for (int i = 0; i < k; i++) {
//            int temp = a[0];
//            for (int j = 0; j < n-1; j++) {
//                a[j] = a[j+1];
//            }
//            a[n-1] = temp;
//        }
//    }
}

