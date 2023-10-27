/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2242238
 */
public class Reader implements Person {

    private String id;
    private String name;

    public Reader(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Student Details:");
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
    }

}
