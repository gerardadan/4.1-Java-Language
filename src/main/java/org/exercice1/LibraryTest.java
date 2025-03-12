package org.exercice1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryTest {
    @Test
    public void testListNotNull(){
        Library library = new Library();
        library.addBook(new Book(111, "Harry Potter"));
        //Assertions.assertNotNull(library.getBookList());
        Assertions.assertTrue(library.getBookList().isEmpty());
    }

    @Test
    public void testListSize(){
        Library library = new Library();
        library.addBook(new Book(111, "Harry Potter"));
        library.addBook(new Book(111, "Harry Potter"));

        Assertions.assertEquals(2, library.getBookList().size());
    }

    @Test
    public void testListSpecificIndex(){
        Library library = new Library();
        Book book1 = new Book(111, "Harry Potter");
        library.addBook(book1);
        library.addBook(new Book(222, "Harry Potter 2"));

        Assertions.assertEquals(book1, library.getBook(0));
    }

    @Test
    public void testDuplicateBooks(){
        Library library = new Library();
        library.addBook(new Book(222, "Harry Potter 1"));
        library.addBook(new Book(222, "Harry Potter 1"));
        List<Book> list = library.getBookList();
        //Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(new HashSet<>(list).size(), list.size());
    }
}
