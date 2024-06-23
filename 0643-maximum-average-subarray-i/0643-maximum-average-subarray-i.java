class Solution {
    public double findMaxAverage(int[] nums, int k) {
        List<Double> set = new ArrayList<>();

        double sum = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (i >= k-1){
                set.add((double) (sum/k));
                sum -= nums[start];
                start++;
            }
        }
        set.sort(Collections.reverseOrder());
        return set.getFirst();
    }
}