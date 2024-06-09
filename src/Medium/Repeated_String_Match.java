package Medium;

public class Repeated_String_Match {
    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("abcd","cdabcdab"));
    }
    static int repeatedStringMatch(String a, String b) {
        int i = 0;
        int j = 0;
        int ans = 0;
        for (int k = 0; k < b.length(); k++) {

            while (i<a.length() && a.charAt(i) != b.charAt(k)){
                i++;
            }
            if(a.charAt(i)==b.charAt(k)){
                ans++;
                k+=a.length()-i-1;
                i=0;
            }
        }
        return ans;
    }
}
