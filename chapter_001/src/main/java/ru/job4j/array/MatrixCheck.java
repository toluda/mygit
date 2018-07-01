package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {

            if (data[i][i] != data[i][data.length - i - 1]) {
                result = false;
                break;
            }
            if (i != data.length - 1) {
                    if (data[i][data.length - i - 1] != data[i + 1][i + 1]) {
                        result = false;
                        break;
                    }
            }

        }
        return result;
    }
}