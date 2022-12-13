package recursion;

public class First_uppercase_letter_in_a_string {
    public static void main(String[] args) {
//        char j = 0;
        String str = "geeksforGeeKS";
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isUpperCase(str.charAt(i))) {
//                j = str.charAt(i);
//            }
//        System.out.println(j);
        char ans = helper(str, '0', 0);
        System.out.println(ans);
    }

    static char helper(String str, char j, int i) {
        if(i>=str.length()){
            return j;
        }
        if (Character.isUpperCase(str.charAt(i))) {
            j = str.charAt(i);
        }
        return helper(str, j, ++i);
    }
}
//Time Complexity : O(N)
//
//Auxiliary Space: O(N) for call stack