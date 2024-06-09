package Medium;

public class Split_Two_String_To_Make_Palindrom {
    public static void main(String[] args) {
        System.out.println(checkPalindromeFormation("ab",""));
    }
    static boolean checkPalindromeFormation(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            String ap = a.substring(0,i);
            String as = a.substring(i);
            String bp = b.substring(0,i);
            String bs = b.substring(i);

            StringBuffer sb = new StringBuffer();

            sb.append(ap).append(bs);

            if(isPalindrom(sb.toString())) return true;

            sb.setLength(0);
            sb.append(as).append(bp);

            if(isPalindrom(sb.toString())) return true;
        }
        return false;
    }
    static boolean isPalindrom(String s){
        int i = 0;
        int j = s.length() - 1;

        while (i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
