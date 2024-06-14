package CodeForces;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int ans = 0;

        while (a<=b){
            ans++;
            a *= 3;
            b *= 2;
        }
        System.out.println(ans);
    }
}
