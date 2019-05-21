package com.company;

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        List<Fruit> fruits = new ArrayList<>();
        System.out.println("Choose 1 to restore from xml or choose 2 if you don't.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            fruits = Managefile.readFromXml(new File("fruits.xml"));
        } else if (number == 2) {
            fruits.add(new Fruit("mango", "green"));
            fruits.add(new Citrus("orange", "orange", 20));
            fruits.add(new Citrus("lemon", "yellow", 25));
            fruits.add(new Fruit("apple", "red"));
            fruits.add(new Fruit("banana", "yellow"));
        }
        System.out.println("Element 1:");
        fruits.get(0).print();
        System.out.println("Chenge element 1:");
        fruits.get(0).input();
        System.out.println();

        System.out.println("Our fruits :");
        System.out.println(fruits);
        System.out.println();

        Collections.sort(fruits);
        System.out.println("Our fruits sorted by name :");
        System.out.println(fruits);
        System.out.println();

        List<Fruit> yellowFruits = new LinkedList<>();
        yellowFruits.addAll(Color.getYellow(fruits));
        System.out.println("Our yellow fruits :");
        System.out.println(yellowFruits);
        System.out.println();


        Managefile.saveAsTxt(fruits);
        Managefile.saveAsXml(fruits);

    }

}
