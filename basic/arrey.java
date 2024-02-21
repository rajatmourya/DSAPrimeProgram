package basic;

import java.util.Scanner;

public class arrey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[] a ={ 2,3,5,6,8};
        for (int i = 0; i <5 ; i++) {
            System.out.print(a[i]+",");
        }
      /*  int age[];
        age=new int[7];
        age[0]=5;
        age[1]=3;
        age[2]=65;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age.length);
        int mark[]={ 2,4,6,8,9};
       System.out.println(mark[4]);
       String[] name = {"Harse", "Amit", "Zuber", "Rahul", "Nikhilesh"};
        for (int i = 0; i <name.length; i++) {
            System.out.println("name is "+name[i]);*/

       /* System.out.println(" enter the element of element you want to store");
        int n=sc.nextInt();
        int arrs[]=new int[n];
        System.out.println("enetr the element of array ");
        for (int i = 0; i <n ; i++)
        {
           arrs[i]=sc.nextInt();
        }
        System.out.println("array element are ");
        for (int i = 0; i < n; i++) {
            System.out.println(arrs[i]);

        }*/
//print two matrix and reverse matrix & multiply two matrix
       /* System.out.println("enter the number of row ");
        int m = sc.nextInt();
        System.out.println("enter the number of column ");
        int n = sc.nextInt();
        int mat3[][] = new int[m][n];

        int mat1[][] = new int[m][n];
        System.out.println("enter the element of array of first matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();

            }

        }
        System.out.println("matrix is =");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + mat1[i][j]);
            }
            System.out.println();

        }
        int mat2[][] = new int[m][n];
        System.out.println("second matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = sc.nextInt();


            }

        }
        System.out.println("matrix is =");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + mat2[i][j]);
            }

            System.out.println();


        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat3[i][j] = 0;
                for (int k = 0; k < m & k < n; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }

            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("  " + mat3[i][j]);
            }
            System.out.println();

        }*/



      /*  int temp[][]=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               temp[j][i]= mat1[i][j];
            }


        }
        System.out.println("reverse matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(" "+temp[i][j]);
            }
            System.out.println();
            }
*/
      /*  System.out.println("enter the element of you want to store");
        int n = sc.nextInt();
        System.out.println(" enter the element of array");
        int b[]=new int[n];
*/
        /*int min=757638;
        for (int i = 0; i <b.length; i++) {
            b[i]=sc.nextInt();

        }
        for (int i = 0; i <n; i++) {
            if(b[i]<min) {
                min = b[i];

            }

        }
        for(int bs:b ){// for each loop
            if(bs<min){
                min=bs;
            }

        }
        System.out.println("minimum number is"+min);*/
     /*   int max= 0;
        for (int i = 0; i <n; i++) {
            b[i]=sc.nextInt();

        }
        for (int i = 0; i <b.length ; i++) {
            if(b[i]>max){
                max=b[i];
            }


        }
        System.out.println("maximum number is"+max);
*/


    }
}