import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setup() {
        library = new Library();
    }

    @Test
    public void testListIsNotNull() {
        assertNotNull(library.getBooks());
    }

    @Test
    public void testSizeAfterAddingBooks() {
        library.addBook("Book A");
        library.addBook("Book B");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testBookInCorrectPosition() {
        library.addBook("Zoology");
        library.addBook("Astronomy");
        List<String> books = library.getBooks();
        assertEquals("Astronomy", books.get(0)); // Sorted alphabetically
    }

    @Test
    public void testNoDuplicateTitles() {
        library.addBook("History");
        library.addBook("History");
        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testRetrieveBookByPosition() {
        library.addBook("Biology");
        assertEquals("Biology", library.getBookAtPosition(0));
    }

    @Test
    public void testAddBookAtSpecificPosition() {
        library.addBook("X");
        library.addBook("Y");
        library.addBookAtPosition(0, "A");
        assertTrue(library.getBooks().contains("A"));
        assertEquals(3, library.getBooks().size());
    }

    @Test
    public void testRemoveBook() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.removeBook("Book 1");
        assertEquals(1, library.getBooks().size());
        assertFalse(library.getBooks().contains("Book 1"));
    }

    @Test
    public void testListIsAlphabeticallySorted() {
        library.addBook("C");
        library.addBook("A");
        library.addBook("B");
        List<String> books = library.getBooks();
        assertEquals(List.of("A", "B", "C"), books);
    }
}