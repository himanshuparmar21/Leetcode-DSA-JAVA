package Easy;

import java.util.HashMap;
// https://leetcode.com/problems/two-sum/description/
public class Two_Sum_1 {
    //Optimal Solution Using HashMap
    // Time Complexity : O(N)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-2};
    }

    //Brute Force Solution Using Two Loop
    public int[] twoSum2(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr[0]=i; arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}
