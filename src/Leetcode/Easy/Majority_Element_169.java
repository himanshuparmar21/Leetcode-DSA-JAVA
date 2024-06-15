package Leetcode.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/majority-element/description/
public class Majority_Element_169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}


//This Problem also Solve Using HashMap
//First Store Key=Element and Value:Frequency
//Then Find Largest Frequency Element and Return
/*
public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans = nums[0];
        int idx = 0;
        for(int num : map.keySet()){
            if(idx<map.get(num)){
                idx = map.get(num);
                ans = num;
            }
        }
        return ans;
    }
 */