package ru.job4j.array;
import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {

        int pos = array.length;
        String temp;
        for (int k = 0; k < array.length - 1; k++) {
            for (int i = k + 1; i < pos; i++) {
                if (array[i].equals(array[k])) {
                    if (pos == (k + 1)) {
                        break;
                    }
                    temp = array[pos - 1];
                    array[pos - 1] = array[i];
                    array[i] = temp;
                    i--;
                    pos--;
                }
            }
        }

        return Arrays.copyOf(array, pos);
    }
}
