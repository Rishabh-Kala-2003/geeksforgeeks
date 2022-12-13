package recursion;
//Approach :
//
//        1. At each iteration we created a new array(temp []) in printTriangle() function, Which holds the sum of consecutive elements of input array.
//        2. Now passed newly created array(temp []) in recursive call of printTriangle() function.
//        3. Repeat  step 1 and 2  until size of temp[] array is not equal to 1.

import java.util.Arrays;

public class Sum_triangle_from_array {
    public static void main(String[] args) {
        int [] a  = {1, 2, 3, 4, 5};
        //sum(a);
        sum2(a);
        System.out.println(Arrays.toString(a));
    }
    static void sum2 (int [] arr){
        int [] a = new int[arr.length-1];
        if(arr.length==1){
            return;
        }
        helper(a ,arr,0);
        sum2(a);
        System.out.println(Arrays.toString(a));
    }
    static int[] helper (int [] a ,int [] arr ,int  i){
        if (i==arr.length-1){
            return a;
        }
        a[i] = arr[i]+arr[i+1];
        helper(a,arr,++i);
        return a;
    }

    static void sum (int [] arr){
        if(arr.length==1){
            return;
        }
        int [] a = new int[arr.length-1];
        for (int i = 0 ; i< arr.length-1; i++){
            a[i] = arr[i]+arr[i+1];
        }
        sum(a);
        System.out.println(Arrays.toString(a));
    }
}
