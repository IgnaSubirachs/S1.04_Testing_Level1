import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            sortBooks();
        }
    }

    public void addBookAtPosition(int position, String title) {
        if (!books.contains(title)) {
            if (position >= 0 && position <= books.size()) {
                books.add(position, title);
                sortBooks();
            }
        }
    }

    public List<String> getBooks() {
        return books;
    }

    public String getBookAtPosition(int position) {
        return books.get(position);
    }

    public void removeBook(String title) {
        books.remove(title);
        sortBooks();
    }

    private void sortBooks() {
        Collections.sort(books);
    }
}
