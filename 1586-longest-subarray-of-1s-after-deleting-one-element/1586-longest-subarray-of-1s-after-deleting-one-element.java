class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        //This is Brute Force Aprroch Generate All SubArray still at most k (means zero<=k) and Count Subaaray Length
        // This take O(n) Time Complecity
        for(int i=0;i<nums.length;i++){
            int zero = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero<=1){
                    ans = Math.max(ans,(j-i));
                }else{
                    break;
                }
            }
        }
        if(ans == nums.length) return ans-1;
        return ans;
    }
}