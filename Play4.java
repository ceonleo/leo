package player;
import java.util.Scanner;
public class Play4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		try{
		int num=Integer.parseInt(str);
		System.out.println("converted output: "+num);
	}
	
	catch(Exception e){
		System.out.println("invalid input format");
	}
	}

}
