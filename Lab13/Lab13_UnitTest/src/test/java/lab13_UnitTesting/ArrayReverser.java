package lab13_UnitTesting;

public class ArrayReverser {

    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReverser(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] array) {
        int[] flattenedArray = arrayFlattenerService.flattenArray(array);
        if (flattenedArray == null) {
            return null;
        }
        int[] reversedArray = new int[flattenedArray.length];
        for (int i = 0; i < flattenedArray.length; i++) {
            reversedArray[i] = flattenedArray[flattenedArray.length - 1 - i];
        }
        return reversedArray;
    }
}