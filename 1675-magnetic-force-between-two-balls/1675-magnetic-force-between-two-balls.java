class Solution {
    public int maxDistance(int[] nums, int m) {
        Arrays.sort(nums);
        int max = nums[nums.length-1] - nums[0];
        int min = 1;
        int ans = 0;
        while(min <= max){
            int mid = min + (max - min) / 2;
            if(isRight(nums,m,mid)){
                ans = mid;
                min = mid+1;
            }else{
                max = mid - 1;
            }
        }
        return ans;
    }
    boolean isRight(int[] nums,int m,int mid){
        int place = 1;
        int last = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] - last >= mid){
                last = nums[i];
                place++;
            }
            if(place>=m) return true;
        }
        return false;
    }
}