package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author kravchenko
 * @version $Id$
 * @since 0.1
 */
public class FactorialTest {
    @Test
    public void whenFactorialIs5() {
        Factorial fac = new Factorial();
        int result = fac.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenFactorialIs1() {
        Factorial fac = new Factorial();
        int result = fac.calc(0);
        assertThat(result, is(1));
    }
}
