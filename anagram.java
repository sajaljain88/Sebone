package sebone2;
import java.util.*;
import java.util.Arrays;
public class anagram {
	
	public void anag(String str1, String str2){
		boolean flag=false;
		if(str1.length()!=str2.length()){
			System.out.println("no it is not an anagram");
		}
		else{
			char[] s1=str1.toCharArray();
			char[] s2=str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			if(Arrays.equals(s1,s2)){
				flag=true;
			}
			
			
		}
		if(flag)
		{
			System.out.println("Anagram");
		}
		else
			System.out.println("Not an Anagram");
		
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
	     String str1 = sc.nextLine();
		anagram a= new anagram();
		a.anag(str,str1);
        }
        
	}

