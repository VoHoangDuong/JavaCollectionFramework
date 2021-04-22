package com.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8, 9, 10};
//    binarySearch(arr,2);
        System.out.println(search(arr, 0, arr.length, 2));
    }

    // bubble sort 1
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // bubble sort 2
    public static void bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j - 1] = arr[j];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    // selection sort 1
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // selection sort2
    public static void selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Search
// khong su dung de quy
    public static void binarySearch(int[] arr, int x) {
        String not = "không có trong danh sách";
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                not = " có trong danh sách và chỉ số là: " + mid;
                break;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(x + not);
    }

    // Su dung de quy
    public static int search(int[] arr, int left, int right, int x) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            else if (arr[mid] > x) {
                return search(arr, left, mid-1, x);
            }
            else {
                return search(arr, mid + 1, right, x);
            }
        }
        return -1;
    }
}