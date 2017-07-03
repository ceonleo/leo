package player;
import java.util.Scanner;
public class Play8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String s=sc.nextLine().toLowerCase();
	String[] st=s.split(" ");
	for(String k:st){
		System.out.print(Character.toUpperCase(k.charAt(0))+k.substring(1,k.length()));
	}
	}
	}
