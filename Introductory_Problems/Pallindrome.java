package Introductory_Problems;

public class Pallindrome {

    public static void main(String[] args) {

        String s = "AAAACACBA";

        System.out.println(makePalindrome(s));
    }

    static String makePalindrome(String s) {

        int[] freq = new int[26];

        // Count frequencies
        for (char ch : s.toCharArray()) {
            freq[ch - 'A']++;
        }

        // Check odd counts
        int oddCount = 0;
        int oddIndex = -1;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                oddIndex = i;
            }
        }

        if (oddCount > 1) {
            return "NO SOLUTION";
        }

        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        for (int i = 0; i < 26; i++) {

            // Add half occurrences to left side
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('A' + i));
            }

            // Odd frequency character goes in the middle
            if (freq[i] % 2 != 0) {
                for (int j = 0; j < freq[i]; j++) {
                    middle.append((char) ('A' + i));
                }
            }
        }

        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + middle.toString() + right;
    }
}