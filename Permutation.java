package sebone2;
import java.util.*;

public class Permutation {
	 public void printPermutations(String str,String ans) {
	      if(str.length()==0) {
		     System.out.println(ans);
		     return;
	      }
	    for(int i=0;i<str.length();i++) {
		   char ch=str.charAt(i);
		   String sl=str.substring(0,i);
		   String sr=str.substring(i+1);
		   String res=sl+sr;
		   printPermutations(res,ans+ch);
		
	         }
	    
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("hy");
		Permutation p=new Permutation();
		String s=sc.next();
		p.printPermutations(s,"");
		
	}
		

}
