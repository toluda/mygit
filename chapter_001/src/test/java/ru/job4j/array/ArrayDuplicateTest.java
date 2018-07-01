package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate dupl = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] output = dupl.remove(input);
        String[] expect = {"Привет", "Мир", "Супер"};

        assertThat(output, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate dupl = new ArrayDuplicate();
        String[] input = {"Привет", "Динамо", "Мир", "Привет", "Супер", "Танго", "Привет", "Мир"};
        String[] output = dupl.remove(input);
        String[] expect = {"Привет", "Динамо", "Мир", "Супер", "Танго"};

        assertThat(output, is(expect));
    }
        @Test
        public void whenRemoveDuplicatesThenArrayWithoutDuplicate3() {
            //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
            ArrayDuplicate dupl = new ArrayDuplicate();
            String[] input = {"Привет", "Динамо", "Динамо", "Мир", "Привет", "Супер", "Танго", "Привет", "Мир"};
            String[] output = dupl.remove(input);
            String[] expect = {"Привет", "Динамо", "Мир", "Супер", "Танго"};

            assertThat(output, is(expect));

        }
}