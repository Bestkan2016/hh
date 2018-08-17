package com.test.hh;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HelloWorld {

    public static void main(String[] args) {

        //list
        var s2 = List.of("Hello", "World");

        //相当于元祖
        var s3 = new ArrayList<>();
        s3.add("1");
        s3.add(2);
        s3.add(false);
        s3.add(3.14);

        s3.stream().filter(o -> o.equals("1")).forEach(o -> System.out.println(o));
    }

}