public class PalindromeString {
    static boolean isPalindrome(String st) {
        String rev = "";
        for (int i = 0; i < st.length(); i++) {
            rev = st.charAt(i) + rev;
        }
        return st.equalsIgnoreCase(rev);
    }
    static  boolean isPalindrome1(String st){
        int left=0,right=st.length()-1;
        while(left<=right){
            if(st.charAt(left)!=st.charAt(right))
                return  false;
            left++;
            right--;
        }
        return  true;
    }


    public static void main(String[] args) {
        String st="madam";
        System.out.println(isPalindrome(st));
        System.out.println(isPalindrome1(st));
    }
}
