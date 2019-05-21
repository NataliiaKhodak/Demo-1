package com.company;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Managefile {


    public static void saveAsTxt(List<Fruit> fruits) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("saveFruits.txt"))) {//само закроет поток
            for (Fruit f : fruits) {
                String data = f.getName() + " " + f.getColor() + "\n";
                bufferedWriter.write(data);
            }
        }
    }

    public static List<Fruit> readFromXml(File xmlFile) throws FileNotFoundException {
        if (xmlFile.exists()) {
            try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(xmlFile))) {
                return (List<Fruit>) xmlDecoder.readObject();
            }
        }
        return new ArrayList();
    }

    public static void saveAsXml(List<Fruit> fruits) throws FileNotFoundException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("fruits.xml")));) {
            xmlEncoder.writeObject(fruits);
        }
    }
}
