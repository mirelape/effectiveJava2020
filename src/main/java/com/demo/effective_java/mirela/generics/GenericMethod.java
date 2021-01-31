package com.demo.effective_java.mirela.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericMethod {

    public GenericMethod() {

    }

    /**
     *
     * @param s1 set 1
     * @param s2 set 2
     * @param <T> generic type
     * @return union of set 1 and set 2
     *
     * Generic method - type parameter is introduced to the method and is living in the scope of the method
     * Type parameter list between methods modifiers and return type
     */
    public <T> Set<T> setUnion(Set<T> s1, Set<T> s2) {
        Set s3 = new HashSet<String>();
        s3.addAll(s1);
        s3.addAll(s2);
        return s3;
    }


}
