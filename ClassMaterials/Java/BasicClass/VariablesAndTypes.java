package ClassMaterials.Java.BasicClass;

/**
 * VariablesAndTypes
 */
class Person {
    String firstName;
    String LastName;
}

public class VariablesAndTypes {

    public static void main(String[] args) {

        Person person = new Person();
        person.firstName = "JaeSuk";
        person.LastName = "Lee";

        int age = 16;
        double height = 175.0;
        String name = "JaeSukLee";
        boolean isAlive = false;

        System.out.println("age : " + age);
        System.out.println("height : " + height);
        System.out.println("name : " + name);
        System.out.println("isAlive : " + isAlive);
        System.out.println("firstName : " + person.firstName);
        System.out.println("lastName : " + person.LastName);
    }
}