package ru.suleymanovtat;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(callBinarySearch(nums, 5));
    }

    public static int callBinarySearch(int[] nums, int key) {
        return java.util.Arrays.binarySearch(nums, key);
    }
}
