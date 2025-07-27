import Lib.*;
import java.util.ArrayList;


public class zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("สิง"));
        animals.add(new Eagle("อิน"));
        animals.add(new Penguin("เพน"));
        animals.add(new Dolphin("โลม"));


        System.out.println("Animal Sounds");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: " + animal.makeSound());
        }


        System.out.println("\nSpecial Abilities :)");
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                System.out.println(animal.getName() + " flies: " + ((Flyable) animal).fly());
            }
            if (animal instanceof Swimable) {
                System.out.println(animal.getName() + " swims: " + ((Swimable) animal).swim());
            }
        }
    }
}
