

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the name of the person : ");
            String n = sc.next();
            greet(n);
        }
    }

    static void greet(String name) {
        System.out.println("Hello and Welcome " + name);
    }
}