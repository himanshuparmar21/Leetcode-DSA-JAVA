package GeekForGeeks;

import java.util.Arrays;

public class MaximumTipCalculator {
    public static void main(String[] args) {
        System.out.println(maxTip(7,3,4,new int[]{8, 7, 15, 19, 16, 16, 18},new int[]{1, 7, 15, 11, 12, 31, 9}));
    }
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        int[][] diff = new int[n][2];
        for (int i = 0; i < n; i++) {
            diff[i][0] = Math.abs(arr[i] - brr[i]);
            diff[i][1] = i;
        }

        Arrays.sort(diff, (a, b) -> b[0] - a[0]);

        long ans = 0;
        int i = 0;
        int j = 0;

        for (int k = 0; k < n; k++) {
            int index = diff[k][1];
            if ((arr[index] >= brr[index] && i < x) || j >= y) {
                ans += arr[index];
                i++;
            }
            else {
                ans += brr[index];
                j++;
            }
        }
        return ans;
    }
}
