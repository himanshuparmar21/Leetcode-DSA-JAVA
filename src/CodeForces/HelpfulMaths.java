package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        List<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                list.add(ch);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (char ch : list){
            sb.append(ch).append('+');
        }
        System.out.println(sb.substring(0,sb.length()-1));
    }
}
