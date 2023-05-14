package ClassMaterials.Java.Object_Oriented_Programming.part1;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Max", 5);
        System.out.println("My dog's name is " + myDog.getName() + " and he is " + myDog.getAge() + " years old.");
    }

}