package basic;
import java.util.Scanner;

public class variable {
    public static void main(String[] args) {


       int a = 34;
        int A = 23;
        int ram_charan = 463;
        int $age = 46;
        int static_ward = 253;
        int second_Part = 56;
        System.out.println("value of a is :"+a);
        System.out.println("value of A is :"+A);
        System.out.println("ram charan ko rupee :"+ram_charan);
        System.out.println("value of static ward :"+static_ward);
        System.out.println("second part is :"+second_Part);
     int count=455657755;
        short m=(short)count;
        boolean you_right=true;
        byte mark=68;
        short studentoffees=3452 ;

        float pi=3.14f;
        double second_pi=3.1445;
        char my_letter='s';
        System.out.println(" m is  :"+m);

        System.out.println("value of count is:"+count);
        System.out.println("value of mark is :"+mark);
        System.out.println("the mark is:");
        System.out.println(" student of fees  :"+studentoffees);
        System.out.println("pi is  :"+pi);
        System.out.println("second pi is :"+second_pi);
        System.out.println("my name letter is :"+my_letter);
        System.out.println("  thank you sir:");


        Scanner sc=new Scanner(System.in);
       System.out.println("enter the full name");
        String name=sc.nextLine();
        System.out.println(" enter the marks :");
        int Mark=sc.nextInt();
        System.out.println("enter the mobile number:");
        long number=sc.nextLong();
        System.out.println("enter the cgpa;");
        float cgpa=sc.nextFloat();
        System.out.println("my name is :"+name);
        System.out.println("my mark is:"+Mark);
        System.out.println("my numbrer is:"+number);
        System.out.println(" my cgpa is "+cgpa);
        System.out.println(" thank you sir");
        System.out.println("enter the age");
        int age=sc.nextInt();
        System.out.println("your age is "+age);
        System.out.println("enter the value first number & second number");
        int first_number=sc.nextInt();
        int second_number=sc.nextInt();
        int result=first_number+second_number;
        System.out.println(result);


    }

}

