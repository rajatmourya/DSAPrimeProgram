package Framework.CollectionInterface.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class learnList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new ArrayList<>();

        // add elements in the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);

        list2.add(2);
        list2.add(54);
        list2.add(25);
        list2.add(73);
        list2.add(3);




        System.out.println("List 1 is: " + list + "\n");
        System.out.println("List 1 is: " + list2 + "\n");
        System.out.println("size of list is: " + list.size() + "\n");
        System.out.println("size of list is: " + list2.size() + "\n");
        System.out.println(" 30 is in the list? " + list.contains(30) + "\n");
        System.out.println("'hello' is in the list? " + list.contains("hello") + "\n");
        System.out.println();

        // Removing the element from the list throw indexing
        list2.remove(3);
        System.out.println("After Removing the 3rd index elements & the list is: " + list2 + "\n");
        list2.add(73);

        // Removing the elements from the list throw value
        list2.remove(Integer.valueOf(3));
        System.out.println("After Removing 73 elements & the list is: " + list2 + "\n");
        list2.add(3);

        //merge two list into third list
        list3.addAll(list);
        list3.addAll(list2);
        System.out.println("After merge two list: "+ list3 + "\n");

        //find the index of any element in the list
        System.out.println("The index of 20 in the list is: " + list.indexOf(20) + "\n");

        // find the element by index value
        System.out.println("Element at the index value 3 in the list is: " + list.get(3) + "\n");

    }
}
