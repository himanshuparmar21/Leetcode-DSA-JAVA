class Solution {
    HashMap<Character,String> map = new HashMap<>();
    ArrayList<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        CreateList("",digits);
        return list;
    }
    void CreateList(String p,String up){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < map.get(ch).length(); i++) {
            CreateList(p + map.get(ch).charAt(i),up.substring(1));
        }
    }
}