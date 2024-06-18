package CodeForces;

import java.util.*;
// https://codeforces.com/problemset/problem/1956/B
public class NeneAndTheCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while (t-->0){
            int n = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                if(set.contains(temp)){
                    ans++;
                }
                set.add(temp);
            }
            list.add(ans);
        }
        for (int num : list){
            System.out.println(num);
        }
    }
}
