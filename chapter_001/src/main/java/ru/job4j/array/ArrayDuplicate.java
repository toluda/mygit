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

                    for (int t = i; t < pos - 1; t++) {
                       temp = array[t];
                       array[t] = array[t + 1];
                       array[t + 1] = temp;

                   }
                   pos--;
                }
            }
        }

        array = Arrays.copyOf(array, pos);
        return array;
    }
}
