package DataStructure.Stack;

public class StackUsingArray {
    private int arr[];

    private int size;

    private int top;

    public StackUsingArray(int size) {
        this.size = size;
        arr = new int[size] ;
        this.top = -1;
    }


    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == size-1;
    }

    boolean push(int value){
        if(!isFull()){
            top++;
            arr[top] = value;
            return true;
        }else {
            System.out.println("Stack is OverFlow! ");
            return false;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty! ");
            return -1;
        }else {
            int temp = arr[top];
            top--;
            return temp;
        }
    }

    int peek() {
        if(isEmpty()){
            System.out.println("Stack is Empty! ");
            return -1;
        }else {
            return arr[top];
        }
    }

    void printStack(){
        for (int i = 0; i < top; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
