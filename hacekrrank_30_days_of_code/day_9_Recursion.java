package hacekrrank_30_days_of_code;

import java.util.Scanner;

import data_structer.stack;

public class day_9_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("    ");
		
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

System.out.println(factorial(n));


	}
static int factorial(int n ) {
	
	if (n==0)
	{
		return 1;
		
	}
	else {
		return (n*factorial(n-1));
	}
}	

}


