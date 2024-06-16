class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
       int opt = 0;
       int add = 0;
       Arrays.sort(coins);

       for(int num : coins){
        while(num > opt+1){
            add++;
            int newc = opt+1;
            opt += newc;
            if(opt>=target) return add;
        }
        opt += num;
        if(opt>=target) return add;
       } 
       while(opt<target){
        add++;
        int newco = opt+1;
        opt += newco;
       }
       return add;
    }
}