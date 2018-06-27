package ru.job4j.converter;

/**
 * Корвертор валюты.
 */


public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    int kursu = 60;
    int kurse = 70;

    public int rubleToEuro(int value) {
        return value / kurse;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / kursu;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return рубли
     */
    public int usdToRub(int value) {
        return value * kursu;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли
     */
    public int eurToRub(int value) {
        return value * kurse;
    }

}
