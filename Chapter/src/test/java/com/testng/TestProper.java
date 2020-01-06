package com.testng;

import org.testng.annotations.Test;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestProper {
    @Test
    public void testProper(){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("test");
        String name = resourceBundle.getString("name");
        Enumeration<String> keys = resourceBundle.getKeys();
        while (keys.hasMoreElements()){
            String s = keys.nextElement();
            String value = resourceBundle.getString(s);
            System.out.println(value + "-----" + s);
        }
    }
}
