package CodeForces;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int upper = 0;
        int lower = 0;
        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                lower++;
            }else{
                upper++;
            }
        }
        if(upper>lower){
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
