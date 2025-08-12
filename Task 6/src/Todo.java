public class Todo {

    private int id;
    private String title;

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " - " + title;
    }
}
