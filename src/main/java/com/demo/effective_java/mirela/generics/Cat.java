package com.demo.effective_java.mirela.generics;

public class Cat extends Animal{
    @Override
    public void sendLove() {
        super.sendLove();
        System.out.println("Meow");
    }
}
