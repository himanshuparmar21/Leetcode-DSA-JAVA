package GeekForGeeks;

import java.util.*;

public class PrimePairWithTargetSum {
    public static ArrayList<Integer> getPrimes(int n) {

        for(int i=2;i<=(n/2)+1;i++){
            if(isPrime(i) && isPrime(n-i) && (i <= n-i)){
                return new ArrayList<>(Arrays.asList(i,n-i));
            }
        }
        return new ArrayList<>(Arrays.asList(-1,-1));
    }

    static boolean isPrime(int i) {
        for (int j = 2; j * j <= i; j++) {
            if(i%j==0) return false;
        }
        return true;
    }
}
