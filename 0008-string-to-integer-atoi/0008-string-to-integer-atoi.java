class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        s = s.trim();
        if (s.isEmpty())
            return 0;

        int sign = s.charAt(0) != '-' ? 1 : -1;
        int i = (s.charAt(0) == '-' || s.charAt(0) == '+') ? 1 : 0;

        for (; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';

                if (Integer.MAX_VALUE / 10 < ans || Integer.MAX_VALUE / 10 == ans && Integer.MAX_VALUE % 10 < digit)
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

                ans = ans * 10 + digit;
            } else {
                break;
            }
                        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                sign = s.charAt(i) == '+' ? 1 : -1;
                continue;
            }
        }

        return sign * ans;
    }
}