package ru.job4j.loop;
/**
 * @author kravchenko
 * @version $Id$
 * @since 0.1
 */

public class Factorial {
    /**
     * Расчет факториала
     * @param n
     * @return
     */
    public int calc(int n) {
        int k = 1;
        if (n < 0) {
            return 0;
        }
        for (int i = n; i > 0; i--) {
            k = k * i;
        }
        return k;
    };
}
