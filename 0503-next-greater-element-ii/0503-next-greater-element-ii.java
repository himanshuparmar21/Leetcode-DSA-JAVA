class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        for(int i=0;i<nums.length;i++){
            int tm = 0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    tm++;
                    ans[start++] = nums[j];
                    break;
                }
            }
            if(tm==0){
                for(int j=0;j<i;j++){
                if(nums[i]<nums[j]){
                    tm++;
                    ans[start++] = nums[j];
                    break;
                }
            }
            }
            if(tm==0){
                ans[start++] = -1;
            }
        }
        return ans;
    }
}