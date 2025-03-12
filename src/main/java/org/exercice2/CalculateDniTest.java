package org.exercice2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "48598437, 48598437N",
            "05314687, 05314687P",
            "44791282, 44791282R",
            "28928602, 28928602F",
            "10949266, 10949266R",
            "87673346, 87673346Z",
            "24651204, 24651204B",
            "36207595, 36207595Y",
            "44547471, 44547471J",
            "66427724, 66427724K",
    })
    public void testDni2(String numDni, String expectedDni) {
        char dniLetter = CalculateDni.getDniLetter(Integer.parseInt(numDni));
        String dni = numDni + dniLetter;
        assertEquals(expectedDni.toLowerCase(), dni.toLowerCase());
    }

    @Test
    public void testDni() {
        int dniNum = 48598437;
        char dniLetter = CalculateDni.getDniLetter(dniNum);
        String dni = String.valueOf(dniNum) + dniLetter;
        assertEquals("48598437N", dni);
    }


}
