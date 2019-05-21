package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ColorTest {

    @Test
    public void testGetYellow() {
        List<Fruit> fruitsTest = new ArrayList<>();
       fruitsTest.add(new Fruit("lime", "green"));
       fruitsTest.add(new Fruit("mango", "green"));
       fruitsTest.add(new Fruit("apple", "yellow"));

        Color.getYellow(fruitsTest);
        List<Fruit> list = Color.getYellow(fruitsTest);
        Assert.assertTrue(list.size()==1);
        Assert.assertTrue(list.get(0).getColor().equals("yellow" ));

    }
}