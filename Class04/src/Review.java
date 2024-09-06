/*
        class
            field(state)
            constructor (method)
            method(behavior)
        object
*/

import java.util.Scanner;

public class Review {
    // Fields (state)
    int id;
    String name;
    int age;

    // Constructor - Default constructor
    public Review() {}

    // Constructor with parameters
    public Review(int id, String name, int age) {
        this.id = id;
        this.name = name; // Initialize the name field
        this.age = age;   // Initialize the age field
    }

    public void printReview() {
        System.out.println("=========================");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // You can create an instance of Review here if needed
        Scanner sc = new Scanner(System.in);
        Review rw = new Review();
        rw.printReview();

        rw = new Review(120, "Dev", 100);

        rw.printReview();

        rw.id = 100;
        rw.name = "Nghia";
        rw.age = 18;

        rw.printReview();
    }
}

