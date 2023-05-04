package ClassMaterials.Java.BasicClass;

/**
 * ClassCasting
 */
public class ClassCasting {

    public static void main(String[] args) {
        class Parent {
        }

        class Child extends Parent {
        }

        Parent parent = new Child(); // 업케스팅 : 자식 --> 부모
        Child child = (Child) parent; // 다운케스팅 : 부모 --> 자식

    }
}