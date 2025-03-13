package org.exercice3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayErrorsTest {

    @Test
    @DisplayName("Agregar elemento usando una fila negativa debe lanzar una excepción")
    void agregarElementoFilaNegativaTest() {
        int[] numbers = new int[10];
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> ArrayErrors.getIncorrectArrayIndex(numbers));
    }

    @Test
    public void Test() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ArrayErrors.getIncorrectArrayIndex(new int[10]);
        });


        ArrayIndexOutOfBoundsException e = ArrayErrors.getIncorrectArrayIndex(new int[10]);
        String expectedMessage = e.getMessage();
        String actualMessage = e.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void whenExceptionThrown_thenAssertionSucceeds() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("1a");
        });

        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
