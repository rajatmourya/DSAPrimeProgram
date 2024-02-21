package exceptionHandling.exceptions;

public class tryCatchBlock {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("Hello guys");

        //  In this try-catch block we can handle all types of Exception accor dur  ing Run-time.
        try{
            System.out.println(a[8]);
        } catch (Exception e){
            System.out.println(e);
        }

        // In this try-catch block we can handle specific Exception which is accor during RUn-time.
        try{
            int b = 2/0;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception ");
        }
        System.out.println("Hello Rajat");
    }
}
