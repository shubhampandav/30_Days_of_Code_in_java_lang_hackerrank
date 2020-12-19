package hacekrrank_30_days_of_code;



	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class day_3_Intro_to_Conditional_Statements {



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	System.out.println(" ");
	        int n= scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        scanner.close();
	              System.out.println( ((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
	    }
	}

