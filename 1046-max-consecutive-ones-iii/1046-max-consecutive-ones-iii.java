class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        //This is Brute Force Aprroch Generate All SubArray still at most k (means zero<=k) and Count Subaaray Length
        // This take O(n) Time Complecity
        for(int i=0;i<nums.length;i++){
            int zero = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero<=k){
                    ans = Math.max(ans,(j-i+1));
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}