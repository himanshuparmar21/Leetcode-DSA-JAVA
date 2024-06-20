import java.util.*;

class Demo {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
        static int longestConsecutive(int[] nums) {
            List<Integer> set = new ArrayList<>();

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int num : nums){
                set.add(num);
                min = Math.min(min,num);
                max = Math.max(max,num);
            }

            Collections.sort(set);
            int count = 0;
            int ans = 0;
            while(min<=max){
                if(set.contains(min)){
                    count++;
                }else{
                    count = 0;
                }
                ans = Math.max(ans,count);
                min++;
            }
            return count;

    }
}
