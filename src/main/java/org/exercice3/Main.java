package org.exercice3;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayErrors.getIncorrectArrayIndex(new int[10]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}