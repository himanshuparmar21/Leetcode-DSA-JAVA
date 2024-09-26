class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        // This is Brute Force Solution
        // Find All SubString and Check How many max. change need
        // And Then Check if Change nedd <= k then Take Max length of SubString
        for (int i = 0; i < s.length(); i++) {
            int[] temp = new int[26];
            int max = 0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                temp[ch - 'A']++;
                max = Math.max(max,temp[ch - 'A']);
                int change = (j-i+1) - max;
                if(change <= k){
                    ans = Math.max(ans,(j-i+1));
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}