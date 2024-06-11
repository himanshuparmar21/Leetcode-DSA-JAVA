package GeekForGeeks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NutsAndBoltsProblem {
    public static void main(String[] args) {
        matchPairs(5,new char[]{'@', '%', '$', '#', '^'},new char[]{'%', '@', '#', '$', '^'});
    }
    static void matchPairs(int n, char nuts[], char bolts[]) {
        String temp = "!#$%&*?@^";
        Set<Character> set = new HashSet<>();
        for (char ch : nuts){
            set.add(ch);
        }
        int i = 0;
        for (char ch : temp.toCharArray()){
            if(set.contains(ch)){
                nuts[i]=ch;
                bolts[i]=ch;
                i++;
            }
        }
        System.out.println(Arrays.toString(nuts));
    }
}
