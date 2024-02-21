package Framework.CollectionInterface.ListInterface;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class learnLIst2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Guava");

        System.out.println(fruits);

        for (int i = 0; i < fruits.size()-1; i++) {
            System.out.println(fruits.get(i));

        }
        for (String e:fruits) {
            System.out.print(e +" ");
        }
        System.out.println();


        // this Iterator comes from collection

        Iterator<String> fe = fruits.iterator();
        while (fe.hasNext()){
            System.out.println("iterator " + fe.next());
        }

        //this is ListIterator

        ListIterator<String> fru = fruits.listIterator();
        while (fru.hasNext()){
            System.out.println("ListIterator " + fru.next());
        }

        List<String > smallList = fruits.subList(2,5);
        System.out.println("SmallList: " + smallList);





    }
}
