package Easy;
// https://leetcode.com/problems/valid-anagram/
public class Valid_Anagram_242 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] ans = new int[26];

        for(int i=0;i<s.length();i++){
            ans[s.charAt(i) - 'a']++;
            ans[t.charAt(i) - 'a']--;
        }

        for(int num : ans){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
