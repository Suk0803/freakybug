package ClassMaterials.Java.BasicClass;

public class TypeCasting {
    public static void main(String[] args) {
        // int < double
        int intValue = 42;
        double doubeValue = intValue;

        double doubeValue1 = 42.5;
        // int intValue1 = doubeValue1; 오류 발생
        // int < double 이기 때문에 double << int 가 불가능 하다.
        // 명시적으로 변환해주면 변환이 가능하다.
        int intValue1 = (int) doubeValue1;

        System.out.println(intValue);
        System.out.println(doubeValue);
        System.out.println(intValue1);
        System.out.println(doubeValue1);
    }
}
