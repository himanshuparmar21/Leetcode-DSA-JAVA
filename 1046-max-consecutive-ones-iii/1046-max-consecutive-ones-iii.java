class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int l = 0;
        int r = 0;
        int zero = 0;
        while(r < nums.length){
            if(nums[r] == 0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0) zero--;
                l++;
            }
            ans = Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}