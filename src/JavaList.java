//Mindula Dilthushan
//Hacker Rank - Java

import java.util.*;

public class JavaList {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numElements = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < numElements; i++) {
            numList.add(scanner.nextInt());
        }
        int numQueries = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numQueries; i++) {
            String queryType = scanner.nextLine();
            if (queryType.equals("Insert")) {
                String[] queryArray = scanner.nextLine().split(" ");
                numList.add(Integer.parseInt(queryArray[0]), Integer.parseInt(queryArray[1]));
            } else {
                int removeIndex = Integer.parseInt(scanner.nextLine());
                numList.remove(removeIndex);
            }
        }
        for (Integer num : numList) {
            System.out.print(num + " ");
        }
    }
}