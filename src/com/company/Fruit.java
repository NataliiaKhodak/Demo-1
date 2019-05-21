package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Fruit implements Comparable<Fruit>, Serializable {
    /**
     * nfdn
     * field's class
     */
    private String name;
    private String color;


    public Fruit() {
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public void input() {
        Scanner scanner = new Scanner(System.in);
        setName(scanner.nextLine());
        setColor(scanner.nextLine());
    }

    /**
     * overoad
     */

    public void input(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\n");
        setName(scanner.next());
        setColor(scanner.next());
    }

    /**
     * print fruit to console
     */
    public void print() {
        System.out.println(this);
    }

    /**
     * print fruit to file
     * overload
     */
    public void print(File file) throws FileNotFoundException {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(toString());
        } catch (IOException e) {
            System.out.println("Unable to write data to file. " + e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Fruit{name='%s', color='%s'}", name, color);
    }

    @Override
    public int compareTo(Fruit fruit) {
        return name.compareTo(fruit.name);
    }

}

