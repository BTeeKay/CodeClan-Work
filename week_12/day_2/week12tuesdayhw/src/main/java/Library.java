import java.util.ArrayList;

public class Library {

    private ArrayList<Books> books;
    private int capacity;

    public Library() {
        this.books = new ArrayList<Books>();
        this.capacity = 3;
    }

    public int bookCount() {
        return this.books.size();
    }

    public boolean addBook(Books book) {
        if (checkCapacity() == false) {
            this.books.add(book);
            return true;
        }
        return false;
    }

    public Books getOneBookByIndex(int i) {
        return this.books.get(i);
    }

    public boolean checkCapacity() {
        if (this.books.size() >= this.capacity) {
            return true;
        }
        return false;
    }
}
