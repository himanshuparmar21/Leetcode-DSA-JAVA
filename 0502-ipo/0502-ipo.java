class Demo implements Comparable<Demo>{
    int profit ;
    int capital;

    Demo(int profit,int capital){
        this.profit = profit;
        this.capital = capital;
    }

    public int compareTo(Demo that){
        return this.capital - that.capital;
    }
}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Demo> minQ = new PriorityQueue<>();
        int n = capital.length;
        for(int i=0;i<n;i++){
            minQ.offer(new Demo(profits[i],capital[i]));
        }
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());

        while(k>0){

            while(!minQ.isEmpty() && minQ.peek().capital<=w){
                maxQ.offer(minQ.poll().profit);
            }
            if(maxQ.isEmpty()) break;

            w+=maxQ.poll();
            k--;
        }
        return w;
    }
}