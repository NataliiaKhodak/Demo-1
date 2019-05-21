package com.company;

import java.util.LinkedList;
import java.util.List;

public class Color {

    public static List<Fruit> getYellow(List<Fruit> fruits) {
        List<Fruit> result = new LinkedList<>();
        for (Fruit f : fruits) {
            if (f.getColor().equals("yellow")) {
                result.add(f);
            }
        }
        return result;
    }
}
