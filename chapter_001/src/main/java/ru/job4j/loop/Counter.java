package ru.job4j.loop;
/**
 * @author kravchenko
 * @version $Id$
 * @since 0.1
 */

public class Counter {
    /**
     * Подсчет суммы четных числе
     * @param start
     * @param finish
     * @return
     */
    public int add(int start, int finish) {
        int k = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                k = k + i;
            }
        }
        return k;
    };
}
