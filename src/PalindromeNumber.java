public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int rev = reverse(x);

        return rev == x;
    }

    private int reverse(int x) {
        int rev = 0;

        while(x != 0) {
            int last = x % 10;
            x /= 10;

            if (x > Integer.MAX_VALUE/10 || (x == Integer.MAX_VALUE/10 && last > 7)) return 0;
            if (x < Integer.MIN_VALUE/10 || (x == Integer.MIN_VALUE/10 && last < -8)) return 0;

            rev = rev * 10 + last;
        }

        return rev;
    }
}
