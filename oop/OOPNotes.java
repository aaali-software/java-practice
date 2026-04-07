package oop;

public class OOPNotes {

    static class Animal {
        public void speak() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void speak() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.speak();
        dog.speak();
    }
}