class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> list = new HashSet<Integer>();

        for(int num : nums1){
            list.add(num);
        }

        int ans = Integer.MAX_VALUE;
        for(int num : nums2){
            if(list.contains(num)){
                ans = Math.min(ans,num);
            }
        }
        return ans!=Integer.MAX_VALUE?ans:-1;
    }
}