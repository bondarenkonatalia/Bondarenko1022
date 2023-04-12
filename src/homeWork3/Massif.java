package homeWork3;

import java.util.Arrays;

public class Massif {
    private int[] sorting(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public void printArray(int[] arr) {
        System.out.println(Arrays.toString(sorting(arr)));
    }

    private int maxValue(int[] arr) {
        sorting(arr);
        return arr[arr.length - 1];
    }

    public void maxvalue(int[] arr) {
        System.out.println(maxValue(arr));

    }

    private int elementNumber(int[] arr, int index) {
        int element = 0;
        for (int i = 0; i < index + 1; i++) {
            element = arr[index];
        }
        return element;
    }

    public void printelement(int[] arr, int index) {
        System.out.println(elementNumber(arr, index));
    }

}