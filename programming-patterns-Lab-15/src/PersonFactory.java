/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2242238
 */
public class PersonFactory {

    Person create(String id, String name, boolean a) {
        if (a) {
            Librarian lib;
            lib = Librarian.create(name);
            return lib;
        } else {
            return new Reader(id, name);
        }
    }
}
