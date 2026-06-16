package Introductory_Problems;

//! Whenever you see:
// Numbers from 1 to N 
// Exactly one number missing

//! Immediately think:
// Expected Sum=n(n+1)/2
//  Missing=Expected Sum-Actual Sum

public class Missingnumber {

    static long MissingNumb(int n, int[] nums) {
        long expectedSum = (long) n * (n + 1) / 2;

        long actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int n = 5;
        int[] nums = { 2, 3, 1, 5 };

        System.out.println(MissingNumb(n, nums));
    }
}