package Introductory_Problems;

import java.util.ArrayList;

public class Twosets {

    public static void main(String[] args) {

        int n = 7;

        if (solve(n) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static int solve(int n) {

        long num = (long) n * (n + 1) / 2;

        if (num % 2 != 0)
            return -1;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        long target = num / 2;

        for (int i = n; i > 0; i--) {

            if (i <= target) {
                list.add(i);
                target -= i;
            } else {
                list1.add(i);
            }
        }

        if (target == 0)
            return 1;

        return -1;
    }
}