package player_set2;
import java.util.Scanner;
public class Happy {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter the number: ");
		String str=read.next();
		int rem=0;
		int flag=0;
		if(str.length()>=2){
		while(str.length()!=1){
			int sum=0;
		for(int i=0;i<str.length();i++)
		{
			rem=(int) Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))),2);
			sum+=rem;
		}
		str=String.valueOf(sum);
		if(sum==1)
		{
			flag=1;
			System.out.println("it is a happy number");
		}
	}
		if(flag==0){
			System.out.println("it is a unhappy number");
		}
		}
		else
			System.out.println("string must contain 2 element");
		//eg:02 instead of 2
	}

	}
	


