package player;
import java.util.Scanner;
public class Play7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String s=sc.next();
	char[] c=new char[s.length()];
	if(s.length()%2==0){
	for(int i=0;i<s.length();i+=2){
		c[i+1]=s.charAt(i);
	}
	for(int i=1;i<s.length();i+=2){
		c[i-1]=s.charAt(i);
	}
	System.out.println(String.copyValueOf(c));
	
	}
	if(s.length()%2!=0){
		StringBuffer sb=new StringBuffer(s);
		sb.delete(s.length()-1,s.length());
		for(int i=0;i<s.length()-1;i+=2){
			c[i+1]=sb.charAt(i);
		}
		for(int i=1;i<s.length()-1;i+=2){
			c[i-1]=sb.charAt(i);
		}
		c[s.length()-1]=s.charAt(s.length()-1);
		System.out.println(String.copyValueOf(c));
		
		}

}}
