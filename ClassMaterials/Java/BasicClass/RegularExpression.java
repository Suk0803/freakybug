package ClassMaterials.Java.BasicClass;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpression {
    public static void main(String[] args) {
        String text = "Hello, my email is john.doe@example.com and my friend's email is jane.doe@example.com jaylee's email is jaesek1223@icloud.com";
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }
    }
}
