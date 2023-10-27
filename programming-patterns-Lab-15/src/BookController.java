/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2242238
 */
public class BookController {

    private Book book;
    private BookView view;

    public BookController(Book book, BookView view) {
        this.book = book;
        this.view = view;
    }

    public String getName() {
        return book.getName();
    }

    public void setName(String name) {
        book.setName(name);
    }

    public String getGenre() {
        return book.getGenre();
    }

    public void setGenre(String genre) {
        book.setGenre(genre);
    }


    public void updateView() {
        view.print(book.getName(), book.getGenre());
    }
}
