package GeekForGeeks;
// https://www.geeksforgeeks.org/problems/count-numbers-containing-43022/1
public class CountNumberContainsFour {
    public static void main(String[] args) {
        System.out.println(countNumberswith4(44));
    }
    public static int countNumberswith4(int n) {
        int count = 0;
        int i = 0;
        while (i<=n){
            int temp = i;
            while (temp>0){
                if(temp%10==4){
                    count++;
                    break;
                }
                temp /= 10;
            }
            i++;
        }
        return count;
    }
}
