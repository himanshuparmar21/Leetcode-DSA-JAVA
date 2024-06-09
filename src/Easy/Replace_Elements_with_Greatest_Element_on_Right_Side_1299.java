package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Replace_Elements_with_Greatest_Element_on_Right_Side_1299 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
    }
    static public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-1;i>0;i--){
            arr[i] = max;
            max = Math.max(arr[i-1],max);
        }
        arr[0]=max;
        return arr;
    }
}
