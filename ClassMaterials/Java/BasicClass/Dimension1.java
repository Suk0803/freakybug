package ClassMaterials.Java.BasicClass;

import java.util.Arrays;

/**
 * Dimension1
 */
public class Dimension1 {

    public static void main(String[] args) {
        int[][] intMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] intMatrix1 = new int[3][3];

        for (int i = 0; i < intMatrix1.length; i++) {
            for (int j = 0; j < intMatrix1.length; j++) {
                intMatrix1[i][j] = (i * 3) + j + 1;
            }
        }

        for (int[] row : intMatrix1) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("-----");

        for (int[] row : intMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("-----");

        System.out.println(Arrays.deepToString(intMatrix1)
                .replace("], [", "]\n[")
                .replace("[[", "[")
                .replace("]]", "]"));
    }
}