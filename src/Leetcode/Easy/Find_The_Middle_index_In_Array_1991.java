package Leetcode.Easy;
// https://leetcode.com/problems/find-the-middle-index-in-array/
public class Find_The_Middle_index_In_Array_1991 {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int pre = 0;
        for(int i=0;i<nums.length;i++){
            if(pre == (sum-nums[i]-pre)) return i;
            pre += nums[i];

        }
        return -1;
    }
}
