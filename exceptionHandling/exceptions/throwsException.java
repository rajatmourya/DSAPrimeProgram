package exceptionHandling.exceptions;

public class throwsException {
    public static void main(String[] args) {
        int[] a = new int[5];
        try{
            getNumberFromArray(a);
        } catch(Exception e){
            System.out.println("catched the exception "+ e.getMessage()) ;
        }
    }
    static int getNumberFromArray(int[] a) throws Exception{
        return a[8];
    }
}
