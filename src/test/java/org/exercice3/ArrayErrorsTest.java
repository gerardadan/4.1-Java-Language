package org.exercice3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayErrorsTest {

    @Test
    @DisplayName("Exercice3-ArrayIndexOutOfBoundsException")
    void testArrayIndexOutOfBoundsException() {
        int[] numbers = new int[10];
        assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> ArrayErrors.getArrayIndexArrayIndexOutOfBoundsException(numbers,11), "The error is not 'ArrayIndexOutOfBoundsException'");
    }

    @Test
    @DisplayName("Exercice3-Exception")
    void testException() {
        int[] numbers = new int[10];
        assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> ArrayErrors.getArrayIndexException(numbers,11), "The error is not 'ArrayIndexOutOfBoundsException'");
    }


}
