package exceptionHandling.exceptions;

import java.util.Scanner;

public class throwException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        try{
            int age = sc.nextInt();
            if(age > 100) throw new MyException("More then 100 not allowed");
        } catch(Exception e){
            System.out.println(e);
        }

    }
}

class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}
