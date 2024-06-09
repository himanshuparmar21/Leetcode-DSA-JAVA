package Easy;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/description/
public class Longest_Common_Prefix_14 {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans;
            }
            ans +=first.charAt(i);
        }
        return ans;
    }
}
