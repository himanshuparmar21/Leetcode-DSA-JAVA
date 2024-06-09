package Easy;
// https://leetcode.com/problems/isomorphic-strings/description/
public class Isomorphic_Strings_205 {
    public boolean isIsomorphic(String s, String t) {
        int[] l1 = new int[200];
        int[] l2 = new int[200];

        for(int i=0;i<s.length();i++){
            if(l1[s.charAt(i)]!=l2[t.charAt(i)]){
                return false;
            }
            l1[s.charAt(i)] = i+1;
            l2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
