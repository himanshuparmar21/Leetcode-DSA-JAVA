class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMostKsum(nums,goal) - atMostKsum(nums,goal-1);
    }
    int atMostKsum(int[] nums,int goal){
        if(goal<0) return 0;
        int start = 0;
        int ans = 0;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum > goal){
                sum -= nums[start];
                start++;
            }
            if(sum <= goal){
                ans += (i-start+1);
            }
        }
        return ans;
    }
}