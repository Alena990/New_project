package com.company;

import com.newpackage.Animal;
import com.newpackage.Cat;
import com.newpackage.Dog;
import com.newpackage.Fish;
import com.other.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Лёва");
        Cat cat = new Cat("Мия", 5);
        Dog dog = new Dog("Кексик", 16);
        Fish fish = new Fish("Немо", 1);
        Animal[] animals = new Animal[5];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = fish;

        human.setAnimal(animals);

        for (Animal animal : human.getAnimal()) {
            System.out.println(animal);
        }
    }
}


