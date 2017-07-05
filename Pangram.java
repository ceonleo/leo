package pro;
import java.util.Scanner;
public class Pangram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println((int)' ');
		System.out.println("enter the string");
		String str=sc.nextLine();
		int cnt=0;
		int flag=0;
		if(str.length()>=26){
		for(int i=0;i<str.length();i++){
			cnt=0;
			for(int j=65;j<=90;j++){
				if((int)str.charAt(i)==j||(int)str.charAt(i)==j+32||(int)str.charAt(i)==32){
					cnt=1;
				}
			}
			if(cnt==0){
				flag=1;
			}
		}}
		else{
			flag=1;
		}
		if(flag==0){
			System.out.println("it is a pangram");
		}
		if(flag==1){
			System.out.println("it is not a pangram");
		}
	}

}
