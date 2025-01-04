abstract class Animal {
    public abstract void sound();

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("The cat meows: Meow!");
    }
}

public class abstraction {
    public static void main(String[] args){
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myDog.eat();
        myCat.sound();
        myCat.eat();
    }
}