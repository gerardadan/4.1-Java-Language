package org.exercice1;

import org.exercice2.CalculateDni;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(111, "Harry Potter"));
        library.addBook(new Book(222, "Moby dick"));
        library.addBook(new Book(333, "The lord of the rigns"));

        System.out.println("Book list: " + library.getBookList());
        System.out.println("Book at position 1: " + library.getBook(1));

        library.addBookAtPosition(1, new Book(444,"Fahrenheit 451"));
        System.out.println("Book list after adding at position 1: " + library.getBookList());

        library.removeBook("1984");
        System.out.println("Book list after removal: " + library.getBookList());
    }
}