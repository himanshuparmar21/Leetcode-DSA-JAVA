package CodeForces;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int a = 0;
        for(char ch : s.toCharArray()){
            if(ch=='A'){
                a++;
            }
        }
        if(s.length()-a>a){
            System.out.println("Danik");
        }else if (s.length()-a<a){
            System.out.println("Anton");
        }else {
            System.out.println("Friendship");
        }
    }
}
