class Solution {
    public boolean judgeSquareSum(int c) {
        long s = 0;
        long e = (long) Math.sqrt(c);

        while(s<=e){
            long temp = (s * s) + (e * e);

            if((int)temp == c){
                return true;
            }else if(temp > c){
                e--;
            }else{
                s++;
            }
        }
        return false;
    }
}