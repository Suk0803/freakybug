package ClassMaterials.Java;

import java.util.Arrays;

public class Dimension {
    public static void main(String[] args) {
        int[][] intMatrix = new int[3][3];
        String[][] strMatrix = new String[3][3];

        System.out.println(Arrays.toString(intMatrix));
        System.out.println(Arrays.toString(strMatrix));

        int[][] intMatrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(Arrays.toString(intMatrix1));
    }
}
