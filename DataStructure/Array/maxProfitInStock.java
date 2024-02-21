package DataStructure.Array;

public class maxProfitInStock {
    public static void main(String[] args) {
        int[] a = {10,19,1,30,32};
        System.out.println(maxProfit(a));

    }
    public static int maxProfit(int[] a)
    {
        int n = a.length;
        int maxProfit = 0;
        int minstocp = a[0];
        for (int e:a) {
            minstocp = Math.min(minstocp,e);
            int profit = e - minstocp;
            maxProfit = Math.max(minstocp,profit);
        }
        return maxProfit;
    }
}
