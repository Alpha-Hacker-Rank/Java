//Mindula Dilthushan
//Hacker Rank - Java
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        String[] splitString = (s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,?._'@]+"));
        System.out.println(splitString.length);
        for (String string : splitString) {
            System.out.println(string);
        }
    }
}

