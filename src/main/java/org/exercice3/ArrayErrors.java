package org.exercice3;

public class ArrayErrors {

    public static ArrayIndexOutOfBoundsException getIncorrectArrayIndex(int[] array) {
        try {
            int incorrectIndex = array[array.length];
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            return e;
        }
    }
}
