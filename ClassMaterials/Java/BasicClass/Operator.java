package ClassMaterials.Java.BasicClass;

/**
 * Operator
 */
public class Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
        System.out.println(a <<= b);
        System.out.println(a >>= b);
        System.out.println(a &= b);
        System.out.println(a ^= b);
        System.out.println(a |= b);

        System.out.println(a + b == 9 ? true : false);
        System.out.println(a + b);
    }
}