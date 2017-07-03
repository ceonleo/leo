package player;
import java.util.Scanner;
public class Play10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter hour-1 in format 'hours mins' ");
		int h1=sc.nextInt();
		int m1=sc.nextInt();
		System.out.println("enter hour-1 in format 'hours mins' ");
		int h2=sc.nextInt();
		int m2=sc.nextInt();
		int result=Math.abs(((h1*60)+m1)-((h2*60)+m2));
		System.out.println(result);
	}

}
