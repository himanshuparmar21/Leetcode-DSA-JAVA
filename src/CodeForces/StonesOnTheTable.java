package CodeForces;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int ans = 0;
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)==s.charAt(i)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
