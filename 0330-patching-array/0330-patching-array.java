class Solution {
    public int minPatches(int[] nums, int n) {
        Arrays.sort(nums); 

        long currentMax = 1; 
        int additions = 0;   
        int index = 0;       

        while (currentMax <= n) {
            if (index < nums.length && nums[index] <= currentMax) {
                currentMax += nums[index];
                index++;
            } else {
                currentMax += currentMax;
                additions++;
            }
        }

        return additions;
    }
}