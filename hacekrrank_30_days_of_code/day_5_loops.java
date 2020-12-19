package hacekrrank_30_days_of_code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day_5_loops {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println(" ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
       for (int i = 1; i <=10;  i++) {
        System.out.println(n + " x "+ i + " = " + i*n );
        
    }
    }
}