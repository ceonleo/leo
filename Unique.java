package hunter_s01;
import java.util.Arrays;
import java.util.Scanner;
public class Unique {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int s=sc.nextInt();
		int[] a=new int[s];
		System.out.println("enter array elements");
		for(int i=0;i<s;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<s;i++){
	if(check(i,a[i]))
	{
		System.out.println(a[i]);
	}
			}
		}
	
	static boolean check(int n,int i){
		if(n==i)
			return true;
		return false;
	}

}
