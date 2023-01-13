package testAnimal;

import testAnimal.Animal;
import testAnimal.Chicken;
import testAnimal.Tiger;
import testAnimal.Edible;
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibles = (Chicken) animal;
                System.out.println(edibles.howToEat());
            }
        }
    }
}