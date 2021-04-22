import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size: ");
        int size = scanner.nextInt();
        System.out.println("************************************");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + ":");
            array[i] = scanner.nextInt();
        }
        // print array
        System.out.println("Mảng trước khi sắp xếp : ");
        System.out.println(Arrays.toString(array));
//        for (int el: array) {
//            System.out.println(el);
//        }
        selectionSort(array);
    }
    //Selection Sort
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
        System.out.println("Mảng sau khi sắp xếp :");
//        for (int el: arr) {
//            System.out.println(el);
//        }
        System.out.println(Arrays.toString(arr));
    }
}
