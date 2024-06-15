package Leetcode.Medium;

public class Semntance_Ssimilarity_III {
    public static void main(String[] args) {
        System.out.println(areSentencesSimilar("of","A lot of words"));
    }
    static boolean areSentencesSimilar(String s1, String s2) {
        String[] S1 = s1.split(" ");
        String[] S2 = s2.split(" ");

        return s1.length()<=s2.length()? simi(S1,S2):simi(S2,S1);
    }
    static boolean simi(String[] S1,String[] S2){
        int matchCount = 0;

        int len1 = S1.length; // words of short sentence
        int len2 = S2.length; // words of long sentence

        int i = 0;
        //find numbers of word matching from starting
        while(i < len1 && S1[i].equals(S2[i])){
            i++;
            matchCount++;
        }

        //find numbers of word matching from end
        while(i < len1 && S1[i].equals(S2[len2 - (len1 - i)])){
            i++;
            matchCount++;
        }

        return matchCount == len1;
    }
}
