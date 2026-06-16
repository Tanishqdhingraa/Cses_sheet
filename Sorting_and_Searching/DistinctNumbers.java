package Sorting_and_Searching;

//! If the problem says:
//? Count distinct elements
//? Count unique values
//? Remove duplicates

//! Think:
//? HashSet

import java.util.HashSet;

public class DistinctNumbers {

    public static void main(String[] args) {

        int[] nums = { 2, 3, 2, 2, 3 };

        System.out.println(distinctCount(nums));
    }

    static int distinctCount(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return set.size();
    }
}