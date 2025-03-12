package org.exercice2;

public class CalculateDni {
    public static char getDniLetter(int number) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
                'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[number % 23];
    }
}
