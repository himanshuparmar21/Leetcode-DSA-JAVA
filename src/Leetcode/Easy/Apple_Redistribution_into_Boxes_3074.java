package Leetcode.Easy;

import java.util.Arrays;
// https://leetcode.com/problems/apple-redistribution-into-boxes/
public class Apple_Redistribution_into_Boxes_3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int num : apple){
            sum += num;
        }
        Arrays.sort(capacity);
        int count = 0;
        for(int i=capacity.length-1;i>=0;i--){
            count++;
            sum -= capacity[i];
            if(sum<1) return count;
        }
        return count;
    }
}
