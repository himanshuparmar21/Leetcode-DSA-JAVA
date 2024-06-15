package Leetcode.Easy;
// https://leetcode.com/problems/next-greater-element-i/
public class Next_Greater_Element_I_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int temp = 0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int tm = 0;
                    for(int k=j;k<nums2.length;k++){
                        if(nums2[j]<nums2[k]){
                            tm++;
                            ans[temp++] = nums2[k];
                            break;
                        }
                    }
                    if(tm==0){
                        ans[temp++] = -1;
                    }
                }
            }
        }
        return ans;
    }
}
