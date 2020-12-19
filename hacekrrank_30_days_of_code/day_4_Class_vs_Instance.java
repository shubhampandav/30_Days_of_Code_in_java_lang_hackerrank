package hacekrrank_30_days_of_code;

	import java.io.*;
	import java.util.*;

	public class day_4_Class_vs_Instance {
	    private int age;	
	  
		public day_4_Class_vs_Instance(int initialAge) {
	  		if(initialAge<0 ){
	              System.out.println("Age is not valid, setting age to 0.");
	              this.age =0;
	              
	          }
	          else{
	              this.age = initialAge;
	          }
		}

		public void amIOld() {
	          String result = "";
	        if(age >= 18){
	            result = "You are old.";
	        }
	        else if(age >=13){
	            result = "You are a teenager.";
	        }
	        else{
	            result = "You are young.";
	        }
	        System.out.println(result);
	  
		}

		public void yearPasses() {
	  		this.age++;
		}

		public static void main(String[] args) {
			System.out.println("");
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt();
				day_4_Class_vs_Instance p = new day_4_Class_vs_Instance(age);
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
	        }
			sc.close();
	    }
	}