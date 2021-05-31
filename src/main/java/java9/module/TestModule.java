package main.java.java9.module;

import main.java.animal.Dog;

public class TestModule {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getVoice());
    }
}
