//Mindula Dilthushan
//Hacker Rank - Java

import java.io.*;
import java.math.*;

public class JavaPrimalityTest {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        BigInteger num = new BigInteger(n);
        System.out.println(num.isProbablePrime(100) ? "prime" : "not prime");
        bufferedReader.close();
    }
}
