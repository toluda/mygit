package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean tr = false;
        boolean fs = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i]) {
                tr = true;
            } else {
                fs = true;
            }
        }

        return (!(fs && tr));
    }
}