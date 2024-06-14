package GeekForGeeks;
// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArmstrongNumber {
    static String armstrongNumber(int n) {
        int temp = n;
        int ans = 0;
        while (n > 0){
            ans += (int) Math.pow(n%10,3);
            n /= 10;
        }
        return temp==ans?"true":"false";
//        Set<Integer> set = new HashSet<>(Arrays.asList(153, 370, 371, 407));
//        return set.contains(n)?"true":"false";
    }
}
