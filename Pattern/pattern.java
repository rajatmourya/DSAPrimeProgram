package Pattern;

public class pattern {
    public static void main(String[] args) {
        int n = 6;
        p7(n);
        p8(n);
        p9(n);
        p10(n);
        p11(n);
        p12(n);
        p13(n);
        p14(n);
    }
    static void p7(int n){
        System.out.println("Quetion no - 7");
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p8(int n){
        System.out.println("Quetion no - 8");
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void p9(int n){
        System.out.println("Quetion no - 9");
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 1; j < i ; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    static void p10(int n){
        System.out.println("Quetion no - 10");
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > n-i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p11(int n){
        System.out.println("Quetion no - 11");
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >=0 ; i--) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for(int j = i; j>1;j--){
                System.out.print("*");
            }
            for(int j = i; j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p12(int n){
        System.out.println("Quetion no - 12");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p13(int n){
        System.out.println("Quetion no - 13");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            if(i!=0){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-2; i >= 0 ; i--) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            if(i!=0){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void p14(int n ){
        System.out.println("Quetion no - 14");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}