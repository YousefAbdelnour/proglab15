/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2242238
 */
public class Librarian implements Person {

    private static Librarian librarian;
    private String name;

    private Librarian(String name) {
        this.name = name;
    }

    static Librarian create(String name) {
        if (librarian == null) {
            librarian = new Librarian(name);
        }
        return librarian;
    }

    public static Librarian getLibrarian() {
        return librarian;
    }

    @Override
    public void print() {
        System.out.println("Librarian details:");
        System.out.println("Name: " + librarian.name);
    }

}
