package player;
import java.util.Scanner;
public class Play3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int out=0;
	while(n!=0){
		out*=10;
		out+=(n%10);
		n/=10;
	
	}
	System.out.println(out);
	}

}
