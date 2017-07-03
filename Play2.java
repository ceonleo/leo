package player;
import java.util.Scanner;
public class Play2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int out=1;
	if(n>0){
	for(int i=1;i<=n;i++){
		out*=i;
	}
	System.out.println(out);
	}
	if(n<0)
	{System.out.println("0");
	}

}
	}
