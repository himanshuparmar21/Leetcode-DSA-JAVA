class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = -1;

        for(int i=0;i<s.length();i++){
            int[] arr = new int[256];
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                if(arr[ch] == 1){
                    ans = Math.max(ans,(j-i));
                    break;
                }
                ans = Math.max(ans,(j-i+1));
                arr[ch] = 1;
            }
        }
        return ans;
    }
}