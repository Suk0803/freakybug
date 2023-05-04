package ClassMaterials.Java.BasicClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String season = in.nextLine();

        switch (season.toLowerCase()) {
            case "spring":
                System.out.println("Go for a walk");
                break;
            case "summer":
                System.out.println("Go swimming");
                break;
            case "autumn":
                System.out.println("Go hiking");
                break;
            case "winter":
                System.out.println("Go skiing");
                break;
            default:
                System.out.println("Invalid season");
        }

        in.close();
    }
}
