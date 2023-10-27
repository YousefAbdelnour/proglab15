
import java.util.ArrayList;

/**
 *
 * @author joeay
 */
public class Library {

    private static Library library;
    private String name;
    private ArrayList<BookController> books;
    private ArrayList<Person> readers;
    private Person librarian;

    private Library(String name) {
        this.name = name;
        librarian = Librarian.getLibrarian();
        books = new ArrayList<>();
        readers = new ArrayList<>();
    }

    static Library create(String name) {
        if (library == null) {
            library = new Library(name);
        }
        return library;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Library getLibrary() {
        return library;
    }

    public static void setLibrary(Library library) {
        Library.library = library;
    }

    public ArrayList<BookController> getBooks() {
        return books;
    }

    public void addBook(BookController book) {
        books.add(book);
    }

    public ArrayList<Person> getReaders() {
        return readers;
    }

    public void addReaders(Person reader) {
        readers.add(reader);
    }

    public Person getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Person librarian) {
        this.librarian = librarian;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Library{");
        sb.append("books=").append(books);
        sb.append(", readers=").append(readers);
        sb.append(", librarian=").append(librarian);
        sb.append('}');
        return sb.toString();
    }
}
