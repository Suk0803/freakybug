package ClassMaterials.Java.BasicClass;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        String[] strArray = new String[5];

        char[] charArray = new char[5];
        boolean[] bArray = new boolean[5];

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(bArray));

        int[] intArray1 = { 1, 2, 3, 4, 5 };
        String[] strArray1 = { "Apple", "Banna", "Cherry" };

        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(strArray1));

    }
}
