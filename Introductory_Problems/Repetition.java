package Introductory_Problems;
//! Pattern to Remember
//? This is the Longest Consecutive Streak pattern:

// currentLength → length of the current streak.
// maxLength → best streak seen so far.
// If current character equals previous character → extend streak.
// Otherwise → start a new streak with length 1.

public class Repetition {

    static int longestRepetition(String dna) {
        if (dna.length() == 0)
            return 0;

        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < dna.length(); i++) {
            if (dna.charAt(i) == dna.charAt(i - 1)) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String dna = "ATTCGGGA";

        System.out.println(longestRepetition(dna));
    }
}