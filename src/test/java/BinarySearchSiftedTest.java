import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class BinarySearchSiftedTest {


    private int[] shifted = {5, 6, 9, 10, 15, 1, 3, 4};


    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 5, 0 },   //0
                { 6, 1 },   //1
                { 9, 2 },   //2
                { 10, 3 },  //3
                { 15, 4 },  //4
                { 1, 5 },   //5
                { 3, 6 },   //6
                { 4, 7 } }); //7
    }

    @Parameterized.Parameter(0)
    public int target;

    @Parameterized.Parameter(1)
    public int expected;

    @Test
    public void testShiftedSortedArray() {
        assertThat(BinarySearch.doBinarySearch(shifted, target, 0, shifted.length - 1), is(expected));
    }
}
