class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int ans = 0;
       int len = Integer.MAX_VALUE;
       int s = 0;

       for(int i=0;i<nums.length;i++){
        
        ans += nums[i];

        while(ans >= target){

            len = Math.min(len,i-s+1);

            ans -= nums[s];
            s++;
        }
       } 
       return len==Integer.MAX_VALUE?0:len;
    }
}