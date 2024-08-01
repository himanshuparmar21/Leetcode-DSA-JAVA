class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s : details){
            String age = s.substring(11,13);
            int num = StringToNum(age);
            if(num > 60){
                count++;
            }
        }
        return count;
    }
    int StringToNum(String s){
        int num = 0;
        num += s.charAt(0)-'0';
        num = (num * 10) + (s.charAt(1)-'0');
        return num;
    }
}