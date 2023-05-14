package ClassMaterials.Java.Object_Oriented_Programming.part1;

// 클래스와 객체
class Dog1 {
    String breed;
    int age;

    Dog1(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    void bark() {
        System.out.println("Woof!");
    }
}

// 상속
class Labrador extends Dog1 {
    Labrador(int age) {
        super("Labrador", age);
    }

    @Override
    void bark() {
        System.out.println("Labrador barking!");
    }
}

public class DogOOP {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1("Poodle", 5);
        myDog.bark();

        Dog1 myLabrador = new Labrador(3);
        myLabrador.bark();
    }
}
