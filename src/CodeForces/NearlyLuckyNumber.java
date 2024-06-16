package CodeForces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        Set<Long> set = new HashSet<>(Arrays.asList(4L,7L));
        boolean temp = true;
        while (n>0){
            if (!set.contains(n % 10)) {
                temp = false;
                break;
            }
            n/=10;
        }
        if(temp){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
