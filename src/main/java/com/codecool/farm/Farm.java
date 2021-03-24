package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private List<Animal> animals;

    Farm(List<Animal> animals) {
        this.animals = animals;
    }

    List<Animal> getAnimals() {
        return animals;
    }

    void feedAnimals(){
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    void butcher(Butcher butcher){
        animals.removeIf(butcher::canButcher);
    }

    boolean isEmpty(){
        return animals.isEmpty();
    }

    List<String> getStatus(){
        List<String> statuses = new ArrayList<>();
        for (Animal animal : animals) {
            statuses.add("There is a "  + animal.getSize() + " sized " + animal.getClass().getSimpleName().toLowerCase() + " in the farm.");
        }
        return statuses;
    }
}