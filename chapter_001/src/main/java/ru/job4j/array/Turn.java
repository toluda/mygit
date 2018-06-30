package ru.job4j.array;

public class Turn {
    public int[] turn(int[] array) {
        int temp;
        int k;
        if ((array.length % 2) == 0) {
         k = array.length / 2;
        } else {
            k = (array.length - 1) / 2 + 1;
        }

        for (int i = 0; i < k; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}