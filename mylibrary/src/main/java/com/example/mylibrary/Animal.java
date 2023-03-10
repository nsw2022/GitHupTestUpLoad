package com.example.mylibrary;

public abstract class Animal {
    abstract void say();

    public static void main(String[] args) {
        Animal ani = new Dog();
        Animal ani2 = new Cat();

        ani.say();
        ani2.say();

    }
}
class Dog extends Animal{
    @Override
    void say() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal{

    @Override
    void say() {
        System.out.println("야옹");
    }
}



