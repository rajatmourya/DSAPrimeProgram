package Recursion.Revision;

public class josephusProblem {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;

        System.out.println(josephusPro(n,k)+1);
    }
    static int josephusPro(int n, int k){
        if(n==1) return 0;
        return (josephusPro(n-1,k) + k) % n;
    }
}
