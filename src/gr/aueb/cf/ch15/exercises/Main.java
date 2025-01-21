package gr.aueb.cf.ch15.exercises;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal animal = new Animal();
        Animal dog = new Dog();

        cat.doSpeak(cat);
        dog.doSpeak(dog);
        animal.doSpeak(cat);
        animal.doSpeak(animal);

    }
}
