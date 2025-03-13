package org.exercice1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void testListNotNull() {
        Library library = new Library();
        library.addBook(new Book(111, "Harry Potter"));

        assertTrue(library.getBookList().isEmpty());
    }

    @Test
    public void testListSize() {
        Library library = new Library();
        library.addBook(new Book(111, "Harry Potter"));
        library.addBook(new Book(111, "Harry Potter"));

        assertEquals(2, library.getBookList().size());
    }

    @Test
    public void testListSpecificIndex() {
        Library library = new Library();
        Book book1 = new Book(111, "Harry Potter");
        library.addBook(book1);
        library.addBook(new Book(222, "Harry Potter 2"));

        assertEquals(book1, library.getBookByIndex(0));
    }

    @Test
    public void testDuplicateBooks() {
        Library library = new Library();
        library.addBook(new Book(222, "Harry Potter 1"));
        library.addBook(new Book(222, "Harry Potter 1"));
        List<Book> list = library.getBookList();

        assertEquals(new HashSet<>(list).size(), list.size());
    }

    @Test
    public void testGetBookTitleByIndex() {
        Library library = new Library();
        library.addBook(new Book(111, "Harry Potter 1"));
        library.addBook(new Book(222, "Harry Potter 2"));

        assertEquals("Harry Potter 1", library.getBookByIndex(0).getTitle());
    }

    @Test
    public void test2() {
        Library library = new Library();
        library.addBook(new Book(222, "Harry Potter 1"));
        library.addBook(new Book(222, "Harry Potter 1"));
        List<Book> list = library.getBookList();
        assertEquals(new HashSet<>(list).size(), list.size());
    }

    @Test
    public void testCheckLibraryDimensionAfterRemoveBook() {
        Library library = new Library();
        library.addBook(new Book(111, "Harry Potter 1"));
        library.addBook(new Book(222, "Harry Potter 2"));
        library.addBook(new Book(333, "Harry Potter 3"));
        assertEquals(3, library.getBookList().size());
        library.removeBookByIsbn(333);
        assertEquals(2, library.getBookList().size());
    }

    @Test
    public void testListKeepSortAscAfterAddOrRemoveBook() {
        int compareToExpected = -1;
        Library library = new Library();
        library.addBook(new Book(333, "The lord of the rings"));
        library.addBook(new Book(111, "Harry Potter"));
        library.addBook(new Book(222, "Moby dick"));
        library.addBook(new Book(444, "Atlas"));
        List<Book> list = library.getBookList();

        for (int i = 0; i < list.size() - 1; i++) {
            assertEquals(compareToExpected, list.get(i).compareTo(list.get(i + 1)));
        }
    }
}
