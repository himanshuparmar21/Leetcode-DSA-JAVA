class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int startindex = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(i >= k-1){
                if(threshold <= (sum/k)){
                    count++;
                }
                sum -= arr[startindex++];
            }
        }
        return count;
    }
}