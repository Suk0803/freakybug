package ClassMaterials.Java;

public class StringHandling1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello GyoDis");

        System.out.println(sb.append(" World!"));
        System.out.println(sb.replace(0, 5, "Goodbye"));
        System.out.println(sb.delete(0, 5));
        System.out.println(sb.reverse());
    }
}
