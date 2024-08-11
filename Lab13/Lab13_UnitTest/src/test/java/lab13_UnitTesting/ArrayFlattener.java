package lab13_UnitTesting;

import java.util.Arrays;

public class ArrayFlattener {
    public int[] flattenArray(int[][] array) {
        if (array == null) {
            return null;
        }

        return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}
