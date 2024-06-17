package CodeForces;

import java.util.*;

public class Stickogon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }

            int count = 0;
            for (int freq : map.values()) {
                count += freq / 3;
            }

            System.out.println(count);
        }
    }
}

