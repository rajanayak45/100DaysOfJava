package method_overriding;


//Base class
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Derived class
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

//Another Derived class
class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat meows");
 }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // base class reference, child class object
        Animal a2 = new Cat();

        a1.sound();  // Output: Dog barks
        a2.sound();  // Output: Cat meows
        
        Animal a=new Animal();
        a.sound();
    }
}

