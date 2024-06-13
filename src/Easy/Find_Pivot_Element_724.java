package Easy;
// https://leetcode.com/problems/find-pivot-index/description/
public class Find_Pivot_Element_724 {
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
