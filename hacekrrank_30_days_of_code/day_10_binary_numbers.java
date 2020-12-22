package hacekrrank_30_days_of_code;



import java.util.*;

public class day_10_binary_numbers {

public static void main(String[] args) {
//	
//	System.out.println(" ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int rem=0,s=0,t=0;


    while(n>0)
        {
        rem=n%2;
        n=n/2;
        if(rem==1)
         {   s++;
           if(s>=t)

            t=s;

        }
        else{

            s=0;
        }   
    }

    System.out.println(t);
}
}
