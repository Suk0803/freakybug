package ClassMaterials.Java.Object_Oriented_Programming;

public class Main {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2("Poodle", 5);

        System.out.println("My dog's breed is " + myDog.getBreed() + " and he is " + myDog.getAge() + " years old.");

        myDog.setBreed("Labrador");
        myDog.setAge(3);

        System.out.printf("My dog's breed is %s and she is %s yaers old\n", myDog.getBreed(), myDog.getAge());
    }

}
