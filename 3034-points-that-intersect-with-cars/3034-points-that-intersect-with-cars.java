class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();

        for(List<Integer> temp : nums){
            for(int i=temp.get(0);i<=temp.get(1);i++){
                set.add(i);
            }
        }
        return set.size();
    }
}