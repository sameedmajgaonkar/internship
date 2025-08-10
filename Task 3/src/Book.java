import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private String author;
    private String ISBN;
    private int price;
    private int quantity;

    Book(String name, String author, String ISBN, int price, int quantity) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return ISBN;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity() {
        this.quantity = this.quantity + 1;
    }

    public void decreaseQuantity() {
        this.quantity = this.quantity - 1;
    }
}
