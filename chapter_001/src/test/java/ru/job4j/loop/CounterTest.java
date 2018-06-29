package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author kravchenko
 * @version $Id$
 * @since 0.1
 */

public class CounterTest {
    @Test
    public void whenFirstLessSecond() {
        Counter sum = new Counter();
        int result = sum.add(2, 10);
        assertThat(result, is(30));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter count = new Counter();
        int result = count.add(1, 10);
        assertThat(result, is(30));
    }
}
