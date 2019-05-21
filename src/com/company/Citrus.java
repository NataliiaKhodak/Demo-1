package com.company;

import java.io.*;
import java.util.Scanner;

public class Citrus extends Fruit implements Serializable {

    private int vitaminC;

    public Citrus() {
    }

    public Citrus(String name, String color, int vitaminC) {
        super(name, color);
        this.vitaminC = vitaminC;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        setName(scanner.nextLine());
        setColor(scanner.nextLine());
        setVitaminC(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    public void input(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\n");

        setName(scanner.next());
        setColor(scanner.next());
        setVitaminC(Integer.parseInt(scanner.next()));
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public void print(File file) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(toString());
        } catch (IOException e) {
            System.out.println("Unable to write data to file. " + e.getMessage());
        }
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public String toString() {
        return String.format("Citrus{vitaminC=%d} %s", vitaminC, super.toString());
    }

    public void saveAsTxt(BufferedWriter bw) {

        String data = this.getName() + " " + this.getColor() + " " + this.vitaminC + "\n";
        try {
            bw.write(data);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
