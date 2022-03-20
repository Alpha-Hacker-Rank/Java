/**
 * Mindula Dilthushan
 * Hacker Rank - Java
 * minduladilthushan1@gmail.com
 */
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String[] splitString = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
            System.out.println(splitString.length);
            for (String string : splitString) {
                System.out.println(string);
            }
        }
    }
}


