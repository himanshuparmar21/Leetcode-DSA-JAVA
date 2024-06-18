class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int max = worker[0];
        for (int i = 1; i < worker.length; i++) {
            max = Math.max(max,worker[i]);
        }

        int[] temp = new int[max+1];

        for (int i = 0; i < profit.length; i++) {
            if(max >= difficulty[i]){
                temp[difficulty[i]] = Math.max(temp[difficulty[i]],profit[i]);
            }
        }

        for (int i = 1; i < temp.length; i++) {
            if(temp[i-1] > temp[i]){
                temp[i] = temp[i-1];
            }
        }

        int ans = 0;

        for (int i : worker) {
            ans += temp[i];
        }
        return ans; 
    }
}