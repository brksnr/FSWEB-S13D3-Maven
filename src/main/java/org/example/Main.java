package org.example;
import org.example.Person;
import org.example.Wall;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Person person = new Person("John", "Doe", 35);
        Person person2 = new Person("John", "Doe", 40);
        Person person3 = new Person("John", "Doe", 45);

        Person person4 = new Person("Rick", "Sanchez", 105);
        Person person5 = new Person("Rick", "Sanchez", 110);;
        Person person6 = new Person("Rick", "Sanchez", 100);;

        Wall wall = new Wall(1.50, 1.50);
        Wall wall2 = new Wall(1.60, 1.60);
    }
}
