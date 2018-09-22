import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class BinarySearchSiftedRepeatedTest {

    private int[] shiftedRepeated = {5, 5, 1, 3, 4, 5, 5, 5, 5};


    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 5, 0 },   //0
                { 1, 2 },   //1
                { 3, 3 },   //2
                { 4, 4 }}); //3
    }

    @Parameterized.Parameter(0)
    public int target;

    @Parameterized.Parameter(1)
    public int expected;

    @Test
    public void testShiftedArrayWithRepeatedPart() {
        assertThat(BinarySearch.doBinarySearch(shiftedRepeated, target, 0, shiftedRepeated.length - 1), is(expected));
    }
}
