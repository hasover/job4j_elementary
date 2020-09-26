package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {6, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 4, 6};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5() {
        int[] input = new int[] {10, 4, 14, 2, 15};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 4, 10, 14, 15};
        assertThat(result, is(expect));
    }

}