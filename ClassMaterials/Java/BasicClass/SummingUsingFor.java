package ClassMaterials.Java.BasicClass;

public class SummingUsingFor {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println(sum);

        /*
         * debug
         * sum = 0, i = 1
         * sum = 1, i = 2
         * sum = 3, i = 3
         * sum = 6, i = 4
         * sum = 10, i = 5
         * 
         */
    }
}
