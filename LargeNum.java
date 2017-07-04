package hunter_s01;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class LargeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int n=sc.nextInt();
	System.out.println("enter array elements");
	String s="";
	int[] a=new int[n];
	long num=0;
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int i=n-1;i>=0;i--){
				s+=a[i];
			//	System.out.println(a[i]);

	}
System.out.println(Long.parseLong(s));

	}
}
