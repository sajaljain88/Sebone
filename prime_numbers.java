package sebone2;
import java.util.*;

public class prime_numbers {
	  boolean isPrime(int n){
		if(n==1||n==0){
			return false;
		}
		for(int i=2;i<n;i++){
			if(n%i==0)
				return false;
		}
	return true;
		
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		prime_numbers pn=new prime_numbers();
		for(int i=2;i<n;i++){
			if(pn.isPrime(i)){
				System.out.println(i);
			}
		}
         
	}
		

	}


