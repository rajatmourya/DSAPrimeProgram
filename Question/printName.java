package Question;
import java.util.Scanner;

public class printName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the Name: ");
//        String name = sc.nextLine();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(Factorial(n));

//        printname(n, 1, name);
//        printnumber(n,1);
    }

    private static void printname(int n, int i, String name) {
        if (i>n){
            return;
        }else {
            System.out.println(name);
            printname(n, i + 1, name);
        }


    }
    private static void printnumber(int n, int i) {
        if (i>n){
            return;
        }else {
            System.out.println(i);
            printnumber(n, i + 1);
        }
    }
    public static int Factorial(int n) {
        if(n > 0){
            return n * Factorial( n-1);
        }
        return 1;
    }
}


