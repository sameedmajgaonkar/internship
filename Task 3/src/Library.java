import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook( String ISBN) {
        books.stream().filter(book -> book.getIsbn().equals(ISBN)).findFirst().ifPresent(book -> {
            if (book.getQuantity() > 0) {
                book.decreaseQuantity();
            } else {
                throw new RuntimeException("Book is currently unavailable");
            }
        });
    }

    public void returnBook(String ISBN) {
        books.stream().filter(book -> book.getIsbn().equals(ISBN)).findFirst().ifPresent(Book::increaseQuantity);

    }
}
