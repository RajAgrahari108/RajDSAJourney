

public class Hybrid {

    public static void main(String[] args) {

        // Dog Object
        Dog d = new Dog();

        d.eat();
        d.walk();
        d.bark();

        System.out.println();

        // Cat Object
        Cat c = new Cat();

        c.eat();
        c.walk();
        c.meow();

        System.out.println();

        // Human Object
        Human h = new Human();

        h.eat();
        h.walk();
        h.speak();

        System.out.println();

        // Peacock Object
        Peacock p = new Peacock();

        p.eat();
        p.fly();
        p.dance();
    }
}

// Parent Class
class Animal {

    void eat() {
        System.out.println("Animal can eat");
    }
}

// Fish Class
class Fish extends Animal {

    void swim() {
        System.out.println("Fish can swim");
    }
}

// Bird Class
class Bird extends Animal {

    void fly() {
        System.out.println("Bird can fly");
    }
}

// Peacock Class
class Peacock extends Bird {

    void dance() {
        System.out.println("Peacock can dance");
    }
}

// Mammal Class
class Mammal extends Animal {

    void walk() {
        System.out.println("Mammal can walk");
    }
}

// Dog Class
class Dog extends Mammal {

    void bark() {
        System.out.println("Dog can bark");
    }
}

// Cat Class
class Cat extends Mammal {

    void meow() {
        System.out.println("Cat can meow");
    }
}

// Human Class
class Human extends Mammal {

    void speak() {
        System.out.println("Human can speak");
    }
}