import java.math.BigInteger;
import java.util.*;

class Demo {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
    }
    static public double findMaxAverage(int[] nums, int k) {
        List<Double> set = new ArrayList<>();

        double sum = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (i >= k-1){
                set.add((double) (sum/k));
                sum -= nums[start];
                start++;
            }
        }
        set.sort(Collections.reverseOrder());
        return set.getFirst();
    }
}
