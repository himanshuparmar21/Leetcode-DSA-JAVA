import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] temp = new String[t];
        for (int i = 0; i < t; i++) {
            temp[i] = sc.nextLine();
        }
        for (String s : temp){
            if(isPossible(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean isPossible(String s) {
        if (s.length() != 3) {
            return false;
        }
        if (s.equals("abc")) {
            return true;
        }
        // Check all possible single swaps
        char[] temp = s.toCharArray();
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                // Swap temp[i] and temp[j]
                char ch = temp[i];
                temp[i] = temp[j];
                temp[j] = ch;
                if (new String(temp).equals("abc")) {
                    return true;
                }
                ch = temp[i];
                temp[i] = temp[j];
                temp[j] = ch;
            }
        }
        return false;
    }
}
