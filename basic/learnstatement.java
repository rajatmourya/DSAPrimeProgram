package basic;
import java.sql.SQLOutput;
import java.util.Scanner;
public class learnstatement {
    public static void main(String[] args) {
        //if statement
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
       int age=sc.nextInt();
        if(age>18){
            System.out.println("driving lesens issue");
        }
        //if else statement;
        System.out.println("enter the class number");
        int class_number=sc.nextInt();
        if(class_number==12){
            System.out.println("scholership 3350 ");
        }
        else{
            System.out.println("no scholership");
        }
        //if else if statement;
        System.out.println("enter the day name(1-7)");
        int day = sc.nextInt();
        if (day == 1) {
            System.out.println(" to day is monday");
        } else if (day == 2) {
            System.out.println("to day is tuesday");
        } else if (day == 3) {
            System.out.println("to day is wednesday");
        } else if (day == 4) {
            System.out.println("to day is thursday");
        } else if (day == 5) {
            System.out.println("to day is friday");
        } else if (day == 6) {
            System.out.println(" to day is saturnday");
        } else if (day == 7) {

            System.out.println(" to day is sunday");
        } else {
            System.out.println("invalid day");
        }
        //   nested if else statement;
        System.out.println(" enter the threr number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            System.out.println("a is bigger than b");
            if (a > c) {
                System.out.println("a is bigger than c");
                System.out.println(" a is largest number" + a);
            } else {
                System.out.println(" c is bigger than a");
                System.out.println(" c is largest" + c);
            }
        } else {
            System.out.println("b is bigger than a");
        }
        if (b > c) {
            System.out.println(" b is bigger than c");
            System.out.println(" b is largest" + b);
        } else {
            System.out.println(" c is bigger than b");
            System.out.println(" c is largest " + c);

            // switch case statement
            System.out.println(" enter the month number(1-12)");
            System.out.println("please enter ");
            int month = sc.nextInt();
            switch (month) {
                case 1:
                    System.out.println("january");
                    break;
                case 2:
                    System.out.println("february");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("april");
                    break;
                case 5:
                    System.out.println("may");
                    break;
                case 6:
                    System.out.println("june");
                    break;
                case 7:
                    System.out.println("july");
                    break;
                case 8:
                    System.out.println("august");
                    break;
                case 9:
                    System.out.println("september");
                    break;
                case 10:
                    System.out.println("october");
                    break;
                case 11:
                    System.out.println("november");
                    break;
                case 12:
                    System.out.println("december");
                    break;
                default:
                    System.out.println(" invalid number");

            }

        }
        System.out.println("enter the  three number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int max=0;
        max=(x>y)?(x>z)?x:z:(y>z)?y:z;
        System.out.println(" largest nuber is "+max);
        //two largest number program
        int r=84;
        int am=45;
        int s=0;
       s= (r>am)?r:am;
        System.out.println(" next program largest number is "+s);

    }
}

