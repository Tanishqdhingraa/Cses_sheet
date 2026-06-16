package Introductory_Problems;

// Pattern Name
//! Greedy Array Modification

// Interview Takeaway

//! When you need each element to be at least the previous one:
//? Traverse left to right.
//?  If current < previous:
//? Add the difference to the answer.
//? Set current = previous.
//? Use long for the answer when constraints are large.

public class IncreasingArray {

    public static void main(String[] args) {

        int[] nums = { 3, 2, 5, 1, 7 };

        System.out.println(minMoves(nums));
    }

    static long minMoves(int[] nums) {
        int n = nums.length;

        if (n <= 1)
            return 0;

        long finalAns = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {

                long moves = nums[i - 1] - nums[i];
                finalAns += moves;

                // Update current element to maintain the increasing property
                nums[i] = nums[i - 1];
            }
        }

        return finalAns;
    }
}