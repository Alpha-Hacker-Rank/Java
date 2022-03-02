//Mindula Dilthushan
//Hacker Rank - Java

import java.util.*;

public class JavaLoops1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Value : ");
        int N = scanner.nextInt();
        for(int i = 1; i <=10; i++)
        {
            System.out.println(N + " x "+i+" = "+i*N);
        }
    }
}