class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        int maxLength = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int currentLength = s.substring(map.get(ch)+1,i).length();
                maxLength = Math.max(maxLength, currentLength);
            } else {
                map.put(ch, i);
            }
        }
        return maxLength;
    }
}