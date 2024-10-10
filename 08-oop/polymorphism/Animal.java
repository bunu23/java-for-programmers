
public class Animal {

    public void sound() {
        System.out.println("the animal makes sound");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        // Polymorphic behavior
        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("cat meows");
    }
}
