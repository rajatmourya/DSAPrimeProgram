package DataStructure.Stack;

import java.util.Scanner;

public class StackMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack");
        StackUsingArray stack = new StackUsingArray(sc.nextInt());
        char ch = 'Y';
        stack.push(45);
        stack.push(34);
        stack.push(91);
        stack.push(786);
        stack.push(21);
        stack.printStack();
        do{
            System.out.println("Press 1. TO Push the Element in Stack \n" +
                    "Press 2. To pop the Element in Stack\n" +
                    "Press 3. To Peek the Element in Stack\n" +
                    "Press 4. To Print Stack");
            int Choice = sc.nextInt();
            switch (Choice){
                case 1:
                    System.out.println("Enter the Element");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println(stack.peek());
                    break;
                case 4:
                    stack.printStack();
                    break;
            }
            System.out.println("Do You want to break Press 'Y' ");
            String s = sc.next();
            if(s.charAt(0) == 'y' || s.charAt(0) == 'Y'){
                ch = 'N';
            }
        }while (ch == 'Y');
    }
}
