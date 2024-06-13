package CodeForces;
// https://codeforces.com/problemset/problem/112/A
import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int result = a.compareToIgnoreCase(b);

        if (result > 0) {
            System.out.println(1);
        } else if (result == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
