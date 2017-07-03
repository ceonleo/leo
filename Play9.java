package player;
import java.util.Scanner;
public class Play9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting range");
		int start=sc.nextInt();
		System.out.println("enter the ending range");
		int end=sc.nextInt();
		int count=0;;
		for(int i=start;i<=end;i++){
			int flag=0;
				for(int j=2;j<i;j++){
					if(i%j==0){
						flag++;
					}
				}
				if(flag==0){
					count++;
				}
		}
		System.out.println(count);
		
	}
	
}
