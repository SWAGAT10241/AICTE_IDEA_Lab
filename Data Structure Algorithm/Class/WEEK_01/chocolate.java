package WEEK_1;

// Given an array of postive integer number of cocolates in the packet and each element of array 
// represent the number of cocolates in a packet.There are n students in class and the task is 
// distrubuite chocolate packet among the students such that each student gets at least one 
// packet and the difference between the maximum and minimum number of chocolates given to any 
// student is minimized.

import java.util.*;

public class chocolate {

    public static int frequency(int num[], int n) {
        if (num.length < n)
            return -1;

        Arrays.sort(num);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i + n - 1 < num.length; i++) {
            int diff = num[i + n - 1] - num[i];
            if (diff < min)
                min = diff;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] num = { 3, 4, 1, 9, 5, 6, 7, 9, 1, 2 };
        int n = 5;
        System.out.println(frequency(num, n));
    }
}