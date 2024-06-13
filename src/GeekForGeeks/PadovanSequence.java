package GeekForGeeks;
// https://www.geeksforgeeks.org/problems/padovan-sequence2855/1
public class PadovanSequence {
    public static void main(String[] args) {
        System.out.println(padovanSequence(4));
    }
    static int padovanSequence(int n)
    {
        if(n<3) return 1;
        int[] temp = new int[n+1];
        temp[0]=temp[1]=temp[2]=1;
        for (int i = 3; i <= n ; i++) {
            temp[i] = (temp[i-2] + temp[i-3])%1000000007;
        }
        return temp[n];
    }
}
