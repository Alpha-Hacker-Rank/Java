/**
 * Mindula Dilthushan
 * Hacker Rank - Java
 * minduladilthushan1@gmail.com
 */
import java.util.*;

public class JavaDequeue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> integerDeque = new ArrayDeque<Integer>();
        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            integerDeque.add(num);
            integerHashSet.add(num);

            if (integerDeque.size() == m) {

                max = Math.max(integerHashSet.size(), max);
                int item = integerDeque.remove();

                if (!integerDeque.contains(item)) {
                    integerHashSet.remove(item);
                }
            }
        }
        System.out.println(max);
    }
}



