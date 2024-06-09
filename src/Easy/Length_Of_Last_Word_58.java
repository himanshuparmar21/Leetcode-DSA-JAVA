package Easy;
// https://leetcode.com/problems/length-of-last-word/description/
public class Length_Of_Last_Word_58 {
//    public int lengthOfLastWord(String s) {
//        s = s.trim();
//        String[] ans = s.split(" ");
//        return ans[ans.length-1].length();
//    }

    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int ans = 0;
        for(int i=s1.length()-1;i>=0;i--){
            if(!Character.isWhitespace(s1.charAt(i))){
                ans++;
            }else {
                //    ans++;
                return ans;
            }
        }
        return ans;
    }
}
