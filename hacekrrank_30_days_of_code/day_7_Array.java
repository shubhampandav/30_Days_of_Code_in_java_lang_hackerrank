package hacekrrank_30_days_of_code;
import java.util.Scanner;
class day_7_Array{
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int A[] = new int[n];
		for (int i = 0; i <n; i++) {
			
			A[i] = scanner.nextInt();
			
		}
// here we reverse this value 
		
		for (int i = A.length-1; i >=0; i--) {
			
			System.out.print(" "+A[i]);
		}
	}
}