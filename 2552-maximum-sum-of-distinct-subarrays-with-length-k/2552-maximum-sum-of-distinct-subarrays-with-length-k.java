class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        int i = 0;
        int start = 0;

        while (i < nums.length){
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            if(i >= k-1){
                if(map.size() == k){
                    ans = Math.max(ans,sum);
                }
                map.put(nums[start], map.getOrDefault(nums[start],0) - 1);
                if(map.get(nums[start]) <= 0){
                    map.remove(nums[start]);
                }
                sum -= nums[start];
                start++;
            }
            i++;
        }
        return ans;
    }
}