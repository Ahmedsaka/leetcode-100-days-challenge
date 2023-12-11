package leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int idx = num.length()-1;
        for (int i = 0; i <= idx; i++) {
            char left = num.charAt(i), right = num.charAt(idx - i);
            if (left != right) return false;
        }
        return true;
    }
}
