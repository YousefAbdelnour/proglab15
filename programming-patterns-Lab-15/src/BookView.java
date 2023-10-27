
import java.util.Locale;
import java.util.ResourceBundle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 2242238
 */
public class BookView {

        ResourceBundle bundle = ResourceBundle.getBundle("Bundle", new Locale("fr", "FR"));

    void print(String name, String genre) {
        System.out.println(bundle.getString("Book Details") + ":");
        System.out.println("Book name: " + name);
        System.out.println("Book genre: " + genre);
    }
}
