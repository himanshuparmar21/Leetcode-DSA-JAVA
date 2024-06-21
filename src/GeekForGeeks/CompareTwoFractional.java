package GeekForGeeks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompareTwoFractional {
    public static void main(String[] args) {
        System.out.println(compareFrac("5/6, 11/45"));
    }
    static String compareFrac(String str) {
        String[] fractions = str.split(", ");

        String[] firstFraction = fractions[0].split("/");
        int num1 = Integer.parseInt(firstFraction[0]);
        int denom1 = Integer.parseInt(firstFraction[1]);

        String[] secondFraction = fractions[1].split("/");
        int num2 = Integer.parseInt(secondFraction[0]);
        int denom2 = Integer.parseInt(secondFraction[1]);

        float fraction1 = (float) num1 / denom1;
        float fraction2 = (float) num2 / denom2;

        if (fraction1 > fraction2) {
            return fractions[0];
        } else if (fraction1 < fraction2) {
            return fractions[1];
        }
        return "equal";
    }
}
