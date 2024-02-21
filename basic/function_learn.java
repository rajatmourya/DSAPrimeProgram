package basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class function_learn {
   /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        print();

    }
    static void print(){
        System.out.println("welcome to program");
        System.out.println("shani mourya");
    next();
    }
    static void next(){
        System.out.println("welcome to next program");
        System.out.println("shani mourya");
    }*/

    //next program;
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value a&b");
       int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(" average is " +avg(a,b));
        System.out.println("addition of two number "  +add(a,b));
        System.out.println("subtraction is  " +subtraction(a,b));
        System.out.println("division is " +div(a,b));
        System.out.println("multiplication is " +multi(a,b));
    }
    static int avg(int a,int b){
        int average=(a+b)/2;
        return average;

    }
    static int add(int a,int b){
      int  addition=a+b;
      return addition;

    }
    static int subtraction(int a,int b){
        int sub=a-b;
        return sub;
    }
    static int div(int a,int b){
        int division=a/b;
        return division;
    }
    static int multi(int a,int b){
        int multiplication=a*b;
        return multiplication;
    }*/
    public static void main(String[] args) {
        int a=56;
        int b=7;
        System.out.println(Math.min(a,b));//find minimum number
        System.out.println(Math.sqrt(64));//find square root
        System.out.println(Math.pow(4,8));//find the square
        System.out.println(Math.abs(5));//same number print
        System.out.println(Math.random());//koi bhi random number print karayega jitney  bar run karenga utney hi bar differnt number print karega
        System.out.println(Math.floor(5.9)); //let 5.8 print 5
        System.out.println(Math.ceil(57.2));//88.3 print 89
        System.out.println(Math.round(74.34));//let 76.64 print 77 and let 76.34 print 76
    }

}