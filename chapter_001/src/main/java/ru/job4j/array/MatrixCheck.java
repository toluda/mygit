package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            for (int k = 0; k < data.length - 1; k++) {
                if (k == i)  {
                    if (data[i][k] != data[i][data.length - 1]) {
                        result = false;
                        break;
                    }
                    if (i == data.length - 1) {
                        break;
                    }
                } else if ((i + k) == data.length - 1) {
                    if (data[i][k] != data[i + 1][i + 1]) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}