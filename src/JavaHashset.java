/**
 * Mindula Dilthushan
 * Hacker Rank - Java
 * minduladilthushan1@gmail.com
 */

import java.util.*;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }

        //Write your code here
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + "_" + pair_right[i]);
            System.out.println(set.size());
        }
        scanner.close();
    }
}