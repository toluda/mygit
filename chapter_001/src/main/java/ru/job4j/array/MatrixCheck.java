package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean v = data[0][0];
        for (int i = 0; i < data.length; i++) {

            if (data[i][i] != v || data[i][data.length - i - 1] != v) {
                result = false;
                break;
            }
        }
        return result;
    }
}