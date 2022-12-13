//Time Complexity : O(n)
//Auxiliary Space : O(n) for recursion call stack.
package recursion;

import java.util.Objects;

public class length_of_a_string {
    public static void main(String[] args) {
        String str = "abcd";
        int ans = helper(str);
        System.out.println(ans);
    }
    static int helper (String str){
        if(Objects.equals(str, "")){
            return 0;
        }
        else{
            return helper(str.substring(1))+1;
        }
    }
}
