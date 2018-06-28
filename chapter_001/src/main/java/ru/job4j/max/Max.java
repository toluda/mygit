package ru.job4j.max;

/**
 * @author kravchenko
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Возвращает наибольшее число
     * @param first
     * @param second
     * @return Максимальное значение
     */
    public int max(int first, int second) {
       return (first >= second ? first : second);
    }

}
