import java.util.*;

class Demo {
    public static void main(String[] args) {
//        System.out.println(maxProfitAssignment(new int[]{2,4,6,8,10},new int[]{10,20,30,40,50},new int[]{4,5,6,7}));
    }
    static int rectanglesInCircle(int radius) {
        int r = 0;

        int diameter = 2 * radius;

        int ds = diameter *
                diameter;

        for (int a = 1;
             a < 2 * radius; a++)
        {
            for (int b = 1;
                 b < 2 * radius; b++)
            {

                int diagonalLengthSquare = (a * a +
                        b * b);

                if (diagonalLengthSquare <= ds)
                {
                    r++;
                }
            }
        }

        return r;
    }
}
