/**
 * Mindula Dilthushan
 * Hacker Rank - Java
 * minduladilthushan1@gmail.com
 */
import java.util.*;

class JavaMap {
    public static void main(String[] argh) {

        Scanner in = new Scanner(System.in);
        Map hashMap = new HashMap();
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            hashMap.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            if (hashMap.containsKey(s)) {
                System.out.println(s + "=" + hashMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}



