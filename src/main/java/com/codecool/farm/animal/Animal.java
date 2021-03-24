package com.codecool.farm.animal;

public abstract class Animal {
    int size;

    public Animal(int size) {
        this.size = size;
    }

    Animal() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public abstract void feed();
}