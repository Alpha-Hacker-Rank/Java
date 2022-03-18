//Mindula Dilthushan
//Hacker Rank - Java
import java.io.*;
import java.util.*;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[][] numArray = new String[6][];
        int largestSum = 0;
        for (int i = 0; i < 6; i++) {
            numArray[i] = scanner.nextLine().split(" ");
        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = Integer.parseInt(numArray[i][j]) + Integer.parseInt(numArray[i][j + 1]) + Integer.parseInt(numArray[i][j + 2]) + Integer.parseInt(numArray[i + 1][j + 1]) + Integer.parseInt(numArray[i + 2][j]) + Integer.parseInt(numArray[i + 2][j + 1]) + Integer.parseInt(numArray[i + 2][j + 2]);
                if (i == 0 && j == 0) {
                    largestSum = sum;
                } else {
                    if (sum > largestSum) {
                        largestSum = sum;
                    }
                }
            }
        }
        System.out.println(largestSum);
    }
}
