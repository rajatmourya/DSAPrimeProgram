package Method;

public class learnMethod {
    public static void main(String[] args) {
       int a = 10, b =12;
        System.out.println("Average of " + a + " & " + b + " is = " + average(a,b));
        greet();
        a = 22;
        b = 43;
        System.out.println("Average of " + a + " & " + b + " is = " + average(a,b));
    }

    static void greet(){
        System.out.println("Hello World");
    }

    public static int average(int a, int b){
    return (a+b)/2;
    }
}
