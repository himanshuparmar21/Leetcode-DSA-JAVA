package GeekForGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingInSecondArray {
    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{1, 2, 3, 4, 5, 10},new int[]{2, 3, 1, 0, 5},6,5));
    }
    static ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : a){
            list.add(num);
        }
        for(int num : b){
            if(list.contains(num)){
                
            }
        }
        return list;
    }
}
