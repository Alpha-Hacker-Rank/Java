//Mindula Dilthushan
//Hacker Rank - Java

import java.util.*;

public class JavaSubarray {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n, sum = 0, c = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];

                }
                if (sum < 0) c++;
            }
        }
        System.out.print(c);
    }
}
