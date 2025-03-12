package org.exercice2;

public class Main {
    public static void main(String[] args) {
        int dniNum = 48598437;
        try{
            char dniLetter  = CalculateDni.getDniLetter(dniNum);
            System.out.println(String.valueOf(dniNum) + dniLetter);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}