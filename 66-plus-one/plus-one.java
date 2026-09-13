class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = digits.length;
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int a = digits[i] + 1;
            int digit = a % 10;
            carry = a / 10;

            if (a > 9) {
                digits[i] = digit;
            } else {
                digits[i] = a;
                return digits;
            }
        }

        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}