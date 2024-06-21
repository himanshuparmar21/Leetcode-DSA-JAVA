import java.util.*;

class Demo {
    public static void main(String[] args) {
        System.out.println(maxSatisfied(new int[]{4,10,10},new int[]{1,1,0},2));
    }
    static public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int temp = 0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                temp += customers[i];
            }
        }
        int finalAns = 0;
        for (int i = 0; i < customers.length-minutes+1; i++) {
            int t = temp;
            for (int j = i; j < minutes+i; j++) {
                if(grumpy[j]==1) {
                    t += customers[j];
                }
            }
            finalAns = Math.max(finalAns,Math.max(temp,t));
        }
        return finalAns;
    }
}
