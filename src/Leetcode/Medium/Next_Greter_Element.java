package Leetcode.Medium;

import java.util.Arrays;

public class Next_Greter_Element {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(12));
    }
    static int nextGreaterElement(int n) {
        int t = n;
        int[] ans = new int[(int)Math.log10(n)+1];
        int i =0;
        while (n>0){
            ans[i++] = n%10;
            n/=10;
        }
        Arrays.sort(ans);
        int temp = 0;
        for (int k=ans.length-1;k>=0;k--){
            temp = temp * 10 + ans[k];
        }
        return t!=temp ? temp:-1;
    }
}
