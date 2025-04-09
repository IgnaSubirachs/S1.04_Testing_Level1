import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            sortBooks();
        }
    }

    public void addBookAtPosition(int position, Book book) {
        if (!books.contains(book)) {
            if (position >= 0 && position <= books.size()) {
                books.add(position, book);
                sortBooks();
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBookAtPosition(int position) {
        return books.get(position);
    }

    public void removeBook(Book book) {
        books.remove(book);
        sortBooks();
    }

    private void sortBooks() {
        books.sort(Comparator.comparing(Book::getTitle));
    }
}
