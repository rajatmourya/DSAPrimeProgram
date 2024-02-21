package TimeComplexity;

public class bigONotations {
    public static void main(String[] args) {
        int[] a = {1,2,4,8,6,45,6,3,4,56,32};
        int key = 9;
        System.out.println();
        System.out.println("First Element of array is: " + getfirst(a));
        System.out.println("All Pairs are: ");
        printAllPairsInArray(a);
        System.out.println("Check Element " + key + " is in array : " + checkIfNumberIs(a,key));

    }

//   O(1) time complexity
    public static int getfirst(int[] a) {
        return a[0];
    }

    // O(n) time complexity

    static boolean checkIfNumberIs(int[] a, int k){
        for (int element:a) {
            if(element == k) return true;
        }return false;
    }
    static void printAllPairsInArray(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i +1; j < n; j++) {
                System.out.println(a[i] + "  " + a[j]);
            }
        }
    }


}
