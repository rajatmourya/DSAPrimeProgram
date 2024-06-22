package GreedyProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsackProblem {

    static class Item{
        int wt, value;
        public Item(int value, int wt) {
            this.wt = wt;
            this.value = value;
        }
    }

    static double fractionalKnapsack(Item[] items, int capacity){
        Arrays.sort(items,(a,b) -> {
            double ratioThis = (double) a.value/a.wt;
            double ratioThat = (double) b.value/b.wt;

            return Double.compare(ratioThat, ratioThis);
        });

        double profit = 0;
        for (Item item : items) {
            if (item.wt <= capacity) {
                profit += item.value;
                capacity -= item.wt;
            } else {
                profit += (double) (item.value * capacity) / item.wt;
                break;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        Item[] items = new Item[n];
        System.out.println("Enter the Items of the Array with pair of { value, weight } :");
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            items[i] = new Item(v,w);
        }
//        Item I1 = new Item(60,10);
//        Item I2 = new Item(100,20);
//        Item I3 = new Item(120,30);
//
//        Item[] items = {I1, I2, I3};

        for (Item i: items){
            System.out.println(i.value + " " + i.wt);
        }

        int capacity = 50;

        System.out.println(fractionalKnapsack(items, capacity));

    }
}
