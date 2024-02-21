package Framework.CollectionInterface.StackCollectionInterface;

import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        Stack<String> fruits =  new Stack<>();
        fruits.push("Kiwi");
        fruits.push("Papaya");
        fruits.push("Mango");
        fruits.push("Apple");
        fruits.push("Orange");
        fruits.push("Guava");
        System.out.println(fruits);
        System.out.println(fruits.pop());
        System.out.println(fruits.pop());
        System.out.println(fruits.peek());
        System.out.println(fruits);
        System.out.println(fruits.empty());
    }
}
