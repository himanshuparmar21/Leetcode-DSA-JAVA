class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;

        int start = 0;
        int end = n - 1;

        while (start < end){
            int temp = nums[start] + nums[end];
            if(temp==k){
                count++;
                start++;
                end--;
            } else if (temp > k) {
                end--;
            }else {
                start++;
            }
        }
        return count;
    }
}