package com.demo.effective_java.mirela.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
Wildcards are used to define type of anything

Upper bounded wildcard is a wildcard type that inherits from a concrete type

Unbounded wildcards have no upper and lower bounds. Unbounded wildcard types are not the same as Object types.
Wildcard can be any type and Object can be specifically Object and not subclass of it

Lower bounded wildcard to force types to be superclass of defined bound
 */
public class Wildcards {
    private List<Animal> animals;

    public void sayHelloToListOfAnything(List<?> listOfAnything) {

    }

    public void addToFarm(Collection<Animal> animals) {
        animals.addAll(animals);
    }

    public void addToFarmError() {
        List<Cat> cats = new ArrayList<Cat>();
        //Compilation error
        //this.addToFarm(cats);

        //geht
        this.addToFarmUpperBoundedWildcard(cats);
    }

    public void addToFarmUpperBoundedWildcard(Collection<? extends Animal> animals) {
        // upper bounded wildcard
    }

    public void unboundedWildcards() {
        List<?> animals = new ArrayList<Animal>();

        //error
        //List<Object> animalsO = new ArrayList<Animal>();
    }

    public void addToFarmLowerBoundedWildcard(Collection<? super Animal> superAnimals) {
        // do something with monsters
    }

    void lowerBoundAndObjects() {
        List<Object> animalsO = new ArrayList<Object>();
        this.addToFarmLowerBoundedWildcard(animalsO);
        // we can call addToFarmLowerBoundedWildcard with list of objects
        // an object is a superclass of an animal
    }

    /*
    When to choose lower bounded type vs. upper bounded type
    PECS producer extends, consumer super

    if create a producer of generic type, then use extends.
    e.g. if we want to call makeNoise() on each animal in collection
    public static void makeLotsOfNoise(List<? extends Animal> animals) {
        animals.forEach(Animal::makeNoise);   }

    In case of consuming elements we use super. For example, we want to pass list only to add new elements
    public static void addCats(List<? super Animal> animals) {
        animals.add(new Cat());   }
    We are only adding to our list of animals, so our list of animals is a consumer.
    This is why we use the super keyword. It means that we could pass in a list of any superclass of animal, but not a subclass.

    A collection is a consumer and producer. Example: we add and remove elements
    In this case we use an unbounded wildcard
     */
}
