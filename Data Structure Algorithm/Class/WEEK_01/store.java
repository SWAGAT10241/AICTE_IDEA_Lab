package WEEK_1;
// You are given an integer array where each element of array represents the number of brick is 
// use to build a piler. Write a java program for calculating total amount of trap rain water 
// between the pilers.

public class store {

    // public static int waterStore(int[] nums) {
    // int capacity = 0;
    // int l = 0, r = nums.length - 1, lmax = 0, rmax = 0;
    // for (int i = 0; i < nums.length; i++) {
    // lmax = Math.max(lmax, nums[l]);
    // rmax = Math.max(rmax, nums[r]);
    // if (lmax < rmax)
    // capacity += lmax - nums[l++];
    // else
    // capacity += rmax - nums[r--];
    // }
    // return capacity;
    // }

    // public static void main(String[] args) {
    // int[] num = { 2, 3, 1, 6, 5 };
    // System.out.println(waterStore(num));
    // }
    // }

    public static int maxWater(int[] arr, int n) {
        // To store the maximum water
        // that can be stored
        int res = 0;
        // For every element of the array
        // except first and last element
        for (int i = 1; i < n - 1; i++) {
            // Find maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);

            // Find maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < n; j++)
                right = Math.max(right, arr[j]);

            // Update maximum water value
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length;
        System.out.print(maxWater(arr, n));
    }
}
