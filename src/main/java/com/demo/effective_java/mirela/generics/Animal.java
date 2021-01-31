package com.demo.effective_java.mirela.generics;

public class Animal {

    private String name;
    public void sendLove() {
        System.out.println("Hello beautiful world! ");
    }

    @Override
    public String toString() {
        return name;
    }
}
