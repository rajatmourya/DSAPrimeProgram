package Question;

public class PlaceTheLastNumberInTheSortedPosition {
    public static void main(String[] args) {
        int a[] = {2,5,6,8,9,1};
        lastNumberInSortedPosition(a);

    }
    static void lastNumberInSortedPosition(int a[]){
        int n = a.length;
        int last = a[n-1];
        int swapIndex = n-2;
        while(swapIndex >= 0 && a[swapIndex] > last){
            swapIndex--;
        }
        for(int i = n-1; i >= swapIndex+2; i--)a[i] = a[i-1];

        a[swapIndex+1] = last;
        for( int item : a){
            System.out.print(item + " ");
        }
    }

}