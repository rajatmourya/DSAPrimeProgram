package leetcode;

public class missingnumber {
        public static void main(String[] args) {
            int a[] = {9,6,4,2,3,5,7,8,1};
            System.out.println(missingNumber(a));

        }
        public static int missingNumber(int[] nums) {
            for(int i = 0 ;i<= nums.length;i++){
                if(isin(nums,i)){
                    continue;
                }else{
                    return i;
                }
            }
            return 0;
        }
        public static boolean isin(int[] a,int k){
            int flag = 0;
            for(int e:a){
                if(e==k){
                    flag = flag + 1;
                }
            }
            if(flag != 0){
                return true;
            }
            else{
                return false;
            }
        }
    }
