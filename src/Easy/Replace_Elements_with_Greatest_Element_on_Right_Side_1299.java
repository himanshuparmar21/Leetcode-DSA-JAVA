package Easy;

// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
import java.util.Arrays;

public class Replace_Elements_with_Greatest_Element_on_Right_Side_1299 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
    }
    static public int[] replaceElements(int[] arr) {
        //Solve in O(n^2)
        for(int i=0;i<arr.length;i++){
            int max = 0;
            for(int j=i+1;j<arr.length;j++){
                max = Math.max(arr[j],max);
            }
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}


// O(n)
// int max = - 1;
// int tmp = Integer.MIN_VALUE;
// for (int i = arr.length - 1; i >= 0; i--) {
//     tmp = arr[i];
//     arr[i] = max;
//     if (tmp > max) {
//         max = tmp;
//     }
// }
// return arr;