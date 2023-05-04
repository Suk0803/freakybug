package ClassMaterials.Java;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        int[] intArray1 = new int[5];
        int[] intArray2 = new int[5];
        int[] intArray3 = { 1, 2, 3, 4, 5 };
        // String[] strArray = new String[5];

        String[] strArray1 = { "Apple", "Banna", "Cherry" };

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        Arrays.setAll(intArray1, i -> i + 1);

        Arrays.fill(intArray2, 1);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));

        for (int i = 0; i < strArray1.length; i++) {
            System.out.println(strArray1[i]);
        }

        for (String value : strArray1) {
            System.out.println(value);
        }
    }
}
