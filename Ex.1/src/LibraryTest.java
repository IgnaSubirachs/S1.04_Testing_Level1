import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private Book book1, book2, book3, book4;

    @BeforeEach
    public void setup() {
        library = new Library();
        book1=new Book("Animals");
        book2=new Book("Brutus");
        book3=new Book("Cocodriles");
        book4=new Book("Drama");

    }

    @Test
    public void testListIsNotEmpty() {
        assertTrue(library.getBooks().isEmpty());
    }

    @Test
    public void testSizeAfterAddingBooks() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testBookInCorrectPosition() {
        library.addBook(book4);
        library.addBook(book2);
        library.addBook(book3);
        List<Book> books = library.getBooks();
        assertEquals(book2, books.get(1));
    }

    @Test
    public void testNoDuplicateTitles() {
        library.addBook(book4);
        library.addBook(book4);
        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testRetrieveBookByPosition() {
        library.addBookAtPosition(0, book1);
        library.addBookAtPosition(5, book2);
        assertEquals(book1, library.getBookAtPosition(0));
        assertEquals(book2, library.getBookAtPosition(5));
    }

    @Test
    public void testAddBookAtSpecificPosition() {
        library.addBook(book3);
        library.addBook(book2);
        library.addBookAtPosition(0, book4);
        assertEquals(library.getBookAtPosition(0), book4);
        assertEquals(3, library.getBooks().size());
    }

    @Test
    public void testRemoveBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book2);
        assertEquals(1, library.getBooks().size());
        assertFalse(library.getBooks().contains(book2));
    }

    @Test
    public void testListIsAlphabeticallySorted() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book4);
        library.addBook(book3);
        library.removeBook(book2);
        List<Book> books = library.getBooks();
        for (int i = 0; i < books.size()-1; i++) {
            String bookTitle = books.get(i).getTitle();
            String nextBookTitle = books.get(i+1).getTitle();
            assertTrue(bookTitle.compareToIgnoreCase(nextBookTitle)<0);
        }
    }
}