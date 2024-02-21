package DataStructure.Array.Questions;

public class spaceSepratedStringToIntArray {
    public static int[] stringToArray(String str){
        String[] s = str.split(" ");
        int n = s.length;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(s[i]);
        }
        return array;
    }

}

