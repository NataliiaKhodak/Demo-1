package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class ManagefileTest {


    @Test
    public void testSaveAsXml() throws FileNotFoundException {

        File file = new File("fruits.xml");
        List<Fruit> fruitsTest = new ArrayList<>();
        fruitsTest.add(new Fruit("lime", "green"));
//        fruitsTest.add(new Fruit("mango", "green"));
//        fruitsTest.add(new Citrus("orange", "orange", 20));
//        fruitsTest.add(new Citrus("lemon", "yellow", 25));
//        fruitsTest.add(new Fruit("apple", "red"));
//        fruitsTest.add(new Fruit("banana", "yellow"));
        Managefile.saveAsXml(fruitsTest);

        List<Fruit> list = Managefile.readFromXml(file);
        Assert.assertTrue(list.get(0).getName().equals(fruitsTest.get(0).getName()));

    }
}



