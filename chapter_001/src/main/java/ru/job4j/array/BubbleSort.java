package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        int temp;
        for (int k = 1; k <= array.length - 1; k++) {
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
