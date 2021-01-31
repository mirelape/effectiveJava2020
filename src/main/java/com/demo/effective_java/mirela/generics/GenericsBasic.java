package com.demo.effective_java.mirela.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple file used to summarize basic generic concepts
 * Advantages of using generics: type safety, avoiding casts, avoid code duplication
 *
 * Type erasure means that generic type information is not available to JVM at runtime, but at compile time
 *      to keep backward compatibility with older versions of java
 *      when generic code is compiled into bytecode it will be like generic code never existed
 *      compilation replaces generic types with objects
 *      compilation replaces bounded class with first bound class
 *      insert equivalent of cast when retrieving object
 *
 *
 * */
public class GenericsBasic<T> {
    // generic type can be used when declaring classes, methods, interfaces

    public void method(T parameter) {

    }

    // why using generics
    private void method1() {
        List list = new ArrayList();
        list.add("Mensur");

        // compailer does not know type of element, it knows only that it is an object
        Object listItem = list.get(0);
        // we cannot get list item without casting
        String mensur = (String) list.get(0);

        // ClassCastException at runtime, Integer cannot be cast to String
        list.add(1);
        String problem = (String) list.get(1);

    }




}

