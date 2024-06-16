import java.util.*;

class Demo {
    public static void main(String[] args) {
        System.out.println(getPrimes(10));
    }
    public static ArrayList<Integer> getPrimes(int n) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                set.add(i);
                if(set.contains(n-i) && ((n-i)<i)){
                    ans.add(n-i);
                    ans.add(i);
                    return ans;
                }
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
