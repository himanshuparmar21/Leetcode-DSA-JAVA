class Solution {
    public int[] rearrangeArray(int[] nums) {
        int k = 0;
        int i = 0;
        int j = 0;
        int n = nums.length;
        int[] ans = new int[n];
        while (k<n){
            while(nums[i] < 0){
                i++;
            }
            ans[k++] = nums[i++];
            while(nums[j] > 0){
                j++;
            }
            ans[k++] = nums[j++];
        }
        return ans;
    }
}