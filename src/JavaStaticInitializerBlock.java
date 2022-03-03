//Mindula Dilthushan
//Hacker Rank - Java

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static int B, H;
    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {

    }
}
