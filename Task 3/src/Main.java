public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User user1 = new User(1,"Alice");
        User user2 = new User(1,"Bob");


        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227", 500, 3);
        Book book2 = new Book("1984", "George Orwell", "9780451524935", 350, 5);
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "9780141439518", 400, 2);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.registerUser(user1);
        library.registerUser(user2);

        library.issueBook(book1.getIsbn());
        library.returnBook(book1.getIsbn());

    }
}
