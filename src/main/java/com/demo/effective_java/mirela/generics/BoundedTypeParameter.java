package com.demo.effective_java.mirela.generics;

/*
We use bounded type parameters to restrict the types that can be used as generic type parameters
Declaring multiple bounds for generic types is possible as well
 */
public class BoundedTypeParameter<T extends Animal & Comparable> {

    public void createBeautyAppointment(T animal) {
        System.out.println("Create an appointment for " + animal.toString());
    }
}
