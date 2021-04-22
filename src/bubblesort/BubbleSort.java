package bubblesort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Element in array :");
        for (int el: array) {
            System.out.println(el);
        }
        System.out.println("*************************");
//        BubbleSort(array);
        selectionSort(array);
    }

    public static void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
// selection sort
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length;i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int el: arr) {
            System.out.println(el);
        }
    }
}
