package basic;
import java.util.Scanner;

public class looplearn {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        //for loop;
/*int n= sc.nextInt();
        for(int i=1;i<=n;i++){
           // System.out.println("hello shani mourya");
          //  System.out.println(i);
            System.out.println(n+"*"+i+"= "+i*n);
         //   System.out.println(n*i);
        }*/
        // sum of n number program
      //  System.out.println("enter the number");
     /*   int number=sc.nextInt();
        int sum=0;
        for (int i = 1; i<=number ; i++) {
         //   sum+=i;
         //   sum+=2*i;
            sum+=(2*i)-1;
        }
      //  System.out.println("sum of even number="+sum);
        System.out.println("sum of odd number"+sum);
        */
      // while loop
     /*   int a=sc.nextInt();
        System.out.println("enter the number");
        int i=1;
        while(i<=10) {

            System.out.println(a + "*" +i+"="+i*a);

        i++;
        }*/
       /* for (int i = 0; i <=20 ; i+=2) {
            System.out.println(i);
            if(i>=10){
                break;
            }

        }
*/
/*int i=0;
        while(i<=5){
            System.out.println(i);
            i++;
            if(i==4)
                break;

        }*/
        /*int i=0;
        do {

            System.out.println(i);
            i++;
           if(i==4)
                 break;
        }while(i<=10);*/

        for (int i = 0; i <=20 ; i++) {

            if(i==3||i==6||i==8||i==15) {
                continue;
            }
                if(i>=17)
                    break;

            System.out.println("gave toffie to"  +i);
        }
    }
}
