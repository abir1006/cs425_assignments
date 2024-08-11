package lab13_UnitTesting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ArrayReverserTest {

    private ArrayReverser arrayReversor;
    private ArrayFlattenerService arrayFlattenerService;

    @Before
    public void setUp() {
        arrayFlattenerService = Mockito.mock(ArrayFlattenerService.class);
        arrayReversor = new ArrayReverser(arrayFlattenerService);
    }

    @Test
    public void testReverseArray() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedArray = {1, 3, 0, 4, 5, 9};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};

        when(arrayFlattenerService.flattenArray(input)).thenReturn(flattenedArray);

        int[] actualOutput = arrayReversor.reverseArray(input);

        assertArrayEquals(expectedOutput, actualOutput);
        verify(arrayFlattenerService).flattenArray(input); // Verify the service was called
    }

    @Test
    public void testReverseArrayWithNullInput() {
        int[][] input = null;
        when(arrayFlattenerService.flattenArray(input)).thenReturn(null);

        int[] actualOutput = arrayReversor.reverseArray(input);

        assertNull(actualOutput);
        verify(arrayFlattenerService).flattenArray(input); // Verify the service was called
    }
}
