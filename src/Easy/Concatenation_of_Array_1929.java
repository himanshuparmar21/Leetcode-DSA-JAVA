package Easy;
// https://leetcode.com/problems/concatenation-of-array/description/
public class Concatenation_of_Array_1929 {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        int i = 0;
        int j = 0;
        while(i<arr.length){
            arr[i] = nums[j];
            i++;
            j++;
            if(j==nums.length){
                j=0;
            }
        }
        return arr;
    }
}
