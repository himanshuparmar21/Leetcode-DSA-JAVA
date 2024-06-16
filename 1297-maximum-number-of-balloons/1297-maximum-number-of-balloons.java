class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : text.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        String s = "balloon";
        int min = Integer.MAX_VALUE;
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                if(ch=='l' || ch=='o'){
                    if(map.get(ch)/2 < min){
                        min = map.get(ch)/2;
                    }
                }
                else{
                    if(map.get(ch)<min){
                        min = map.get(ch);
                    }
                }
            }else{
                return 0;
            }
        }
        return min;
    }
}