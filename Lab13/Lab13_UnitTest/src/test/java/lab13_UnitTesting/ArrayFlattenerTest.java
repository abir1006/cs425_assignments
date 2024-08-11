package lab13_UnitTesting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArray() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        int[] actualOutput = arrayFlattener.flattenArray(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        int[][] input = null;
        int[] actualOutput = arrayFlattener.flattenArray(input);
        assertNull(actualOutput);
    }
}
