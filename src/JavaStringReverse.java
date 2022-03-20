/**
 * Mindula Dilthushan
 * Hacker Rank - Java
 * minduladilthushan1@gmail.com
 */
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        boolean palindrome = true;
        for (int i = 0; i < A.length() / 2; i++) {
            if (!A.substring(i, i + 1).equals(A.substring(A.length() - i - 1, A.length() - i))) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



