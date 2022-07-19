import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Books book1;
    private Books book2;
    private Books book3;
    private Books book4;

    @Before
    public void before() {
        library = new Library();
        book1 = new Books("Brian Kerr", "Horror", "The Cat Attack");
        book2 = new Books("Tina Munro", "Thriller", "The Horses Mouth");
        book3 = new Books("Mary G", "Comedy", "Meow Meow Mix Up");
        book4 = new Books("Declan Malone", "Sci-fi", "Declan's Long Lost Guide To The Galaxy");
    }

    @Test
    public void canGetBookCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book4);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void addedBookHasTitle() {
        library.addBook(book4);
        Books returnBook = library.getOneBookByIndex(0);
        assertEquals("Declan's Long Lost Guide To The Galaxy", returnBook.getTitle());
    }

    @Test
    public void checkCapacityNotFull() {
        assertEquals(false, library.checkCapacity());
    }

    @Test
    public void failsWhenAddingBookCapacityFull() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(false, library.addBook(book4));
    }
}
