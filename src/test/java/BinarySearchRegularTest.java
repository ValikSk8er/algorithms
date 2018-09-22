import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class BinarySearchRegularTest {

    private int[] values = {1, 2, 4, 6, 7, 11, 12, 14, 15, 16, 22, 23, 54, 55, 67, 89, 90, 91, 92};

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {11, 5}, {1, 0}, {92, 18},
                {15, 8}, {23, 11}, {7, 4}, {16, 9}});
    }

    @Parameterized.Parameter(0)
    public int target;

    @Parameterized.Parameter(1)
    public int expected;

    @Test
    public void testSortedArray() {
        assertThat(BinarySearch.doBinarySearch(values, target, 0, values.length - 1), is(expected));
    }
}
