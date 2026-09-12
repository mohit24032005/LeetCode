class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {

            n = n / 5;
            count = count + n;
        }
        return count;
    }
    public long fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
