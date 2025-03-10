class Solution {
    public long solution(long n) {

        char[] digits = String.valueOf(n).toCharArray();

        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = 0; j < digits.length - 1 - i; j++) {
                if (digits[j] < digits[j + 1]) {
                    char temp = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = temp;
                }
            }
        }

        String sortedStr = new String(digits);

        return Long.parseLong(sortedStr);
    }
}