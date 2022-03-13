package sebone2;
import java.util.*;

public class Palindrome {
	
	static void palind(int n){
		int x=n;
		int rev=0;
		int r=0;
		while(n>0){
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		if(rev==x){
			System.out.println("This is a Palindrome");
		}else{
		System.out.println("This is not a Palindrom");
		}
		
	
	}
	
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("i love u janu");
		int n=sc.nextInt();
		
		palind(n);
		
		
		
	}

}
