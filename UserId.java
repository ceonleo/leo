package pro;
import java.util.Arrays;
import java.util.Scanner;
public class UserId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first name");
		String first=sc.next();
		System.out.println("enter the last name");
		String last=sc.next();
		System.out.println("enter the pin");
		String pin=sc.next();
		System.out.println("enter the digit");
		int n=sc.nextInt();
		String small="";
		String longest="";
		if(first.length()>last.length()){
			small=last;
			longest=first;
		}
		if(first.length()<last.length()){
			small=first;
			longest=last;
		}
		if(first.length()==last.length()){
			String arr[]=new String[]{first,last};
			Arrays.sort(arr);
			small=arr[0];
			longest=arr[1];
		}
		String id=longest.charAt(0)+small+pin.charAt(n-1)+pin.charAt(pin.length()-n);
		System.out.println("user id: "+id);
	}

}
