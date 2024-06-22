import java.math.BigInteger;
import java.util.*;

class Demo {
    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2},2));
    }
    static public int numberOfSubarrays(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if(nums[i] % 2 != 0){
                    count++;
                }
                if(count==k){
                    ans++;
                    count=0;
                }
            }
        }
        return ans;
    }
}
