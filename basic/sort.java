package basic;

public class sort {
    public static void main(String[] args) {
       int a[]={1,3,4,5,6,8,9,6};
       int arr[]={2,3,5,7,4,8,3};
       int arr1[]={3,5,4,8,6,8};
        int array[]={3,4,7,2,9,8,1,5,};
        last_number(a);
       for (int e:a){
           System.out.println(e+" ");
       }

       insertion(arr);
        System.out.println("insertion sorting");
       for(int d:arr){
           System.out.println(d+" ");
       }
       bubbles_sort(arr1);
        System.out.println("bubble sorting");
       for(int f:arr1){
           System.out.println(f+" ");
       }
                selection_sort(array);
        System.out.println(" selection sorting");

        {
            for (int i = 0; i <array.length; i++)
            {
                System.out.println( array[i]);
            }
        }
    }
    static void last_number(int a[]){
        int n=a.length;//n=9
        int last=a[n-1];//8
        int swap_index=n-2;// 7         //34/24/12/9/8/6/5/2false
        while(swap_index>=0 && a[swap_index]>last){
         swap_index--;//7/6/5/4/3/2/1 no enter;
        }
        for (int i = n-1; i >=swap_index+2 ; i--) {//5/
            a[i] = a[i - 1];
        }
            a[swap_index+1]=last;
    }
    static void insertion(int arr[]){

        int n=arr.length;
        for (int i = 0; i <n ; i++) {
            int last = arr[i];
            int swap_index = i - 1;
            while ((swap_index >= 0) && arr[swap_index] > last) {
                swap_index--;
            }
            int j = i;
            while (j > swap_index + 1) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[swap_index+1] = last;


        }

    }
    static void bubbles_sort(int arr1[]){
        int n=arr1.length;
        for (int i = 0; i<n-1; i++) {
            for (int j = 0; j <n-i-1; j++) {
         if(arr1[j]>arr1[j+1]){
             int temp=arr1[j+1];
             arr1[j+1]=arr1[j];
             arr1[j]=temp;


         }
            }
}

        }


    static void selection_sort(int array[]){
        int n=array.length;
        for (int i = 0; i <n-1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;


        }

        }
    }


