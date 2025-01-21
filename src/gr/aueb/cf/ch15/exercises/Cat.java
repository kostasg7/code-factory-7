package gr.aueb.cf.ch15.exercises;

public class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
